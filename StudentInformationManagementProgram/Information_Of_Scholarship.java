import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Information_Of_Scholarship extends JFrame
{
	Data_Base D;

	Information_Of_Scholarship(Data_Base D)
	{
		this.D = D;

		setTitle("Information Of Scholarship");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Information Of Scholarship >>");
		la.setBounds(60, 20, 500, 40);	
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