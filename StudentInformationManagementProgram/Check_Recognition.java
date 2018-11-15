import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Check_Recognition extends JFrame
{
	Data_Base D;

	Check_Recognition(Data_Base D)
	{
		this.D = D;

		setTitle("Check Recognition");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Check Recognition >>");
		la.setBounds(120, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JButton b1 = new JButton("English Certification");
		b1.setBounds(130, 110, 200, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("English Certification"))
				{
					new C_English_Certification(D);
				}
			}
		});

		JButton b2 = new JButton("Community Service");
		b2.setBounds(130, 150, 200, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Community Service"))
				{
					new C_Community_Service(D);
				}
			}
		});

		JButton b3 = new JButton("Get Out Of School");
		b3.setBounds(130, 190, 200, 30);
		c.add(b3);

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Get Out Of School"))
				{
					new C_Out_School(D);
				}
			}
		});

		JButton ok = new JButton("Exit");
		ok.setBounds(250, 300, 90, 30);
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

		setSize(600, 400);
		setLocation(700, 200);
		setVisible(true);
	}
}