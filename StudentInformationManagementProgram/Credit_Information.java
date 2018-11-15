import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Credit_Information extends JFrame
{
	Data_Base D;

	Credit_Information(Data_Base D)
	{
		this.D = D;

		setTitle("Credit Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Credit Information >>");
		la.setBounds(120, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JButton ok = new JButton("Exit");
		ok.setBounds(250, 700, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Exit"))
				{
					dispose();
				}
			}
		});

		setSize(600, 800);
		setLocation(700, 200);
		setVisible(true);
	}
}