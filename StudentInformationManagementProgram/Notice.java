import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Notice extends JFrame
{
	Data_Base D;

	Notice(Data_Base D)
	{
		this.D = D;
		int i = 70;

		setTitle("Notice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Notice >>");
		la.setBounds(150, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(int p=0; p<D.Notice.size(); p++)
		{
			JLabel la1 = new JLabel(D.Notice.get(p));
			la1.setFont(new Font("Goergia", Font.ITALIC, 15));
			la1.setBounds(110, i, 400, 40);
			c.add(la1);
			i = i+20;
		}

		JButton ok = new JButton("OK");
		ok.setBounds(200, 550, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("OK"))
				{
					dispose();
				}
			}
		});

		setSize(500, 650);
		setLocation(700, 200);
		setVisible(true);
	}
}