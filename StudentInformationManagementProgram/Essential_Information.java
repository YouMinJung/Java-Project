import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Essential_Information extends JFrame
{
	Essential_Information()
	{
		setTitle("Essential Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Essential Information >>");
		la.setBounds(110, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel menu = new JLabel("** Menu **");
		menu.setFont(new Font("Goergia", Font.ITALIC, 15));
		menu.setBounds(120, 120, 200, 40);
		c.add(menu);

		JButton b1 = new JButton("Liberal Atrs Lecture Completion Condition");
		b1.setBounds(130, 200, 300, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Liberal Atrs Lecture Completion Condition"))
				{
					new Essential1();
				}
			}
		});

		JButton b2 = new JButton("Multi Major Completion Condition");
		b2.setBounds(130, 240, 300, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Multi Major Completion Condition"))
				{
					new Essential2();
				}
			}
		});

		JButton b3 = new JButton("Single Major Completion Condition");
		b3.setBounds(130, 280, 300, 30);
		c.add(b3);

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Single Major Completion Condition"))
				{
					new Essential3();
				}
			}
		});

		JButton b4 = new JButton("And Others");
		b4.setBounds(130, 320, 300, 30);
		c.add(b4);

		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("And Others"))
				{
					new Essential4();
				}
			}
		});

		JButton ok = new JButton("Exit");
		ok.setBounds(250, 400, 90, 30);
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

		setSize(600, 500);
		setLocation(700, 200);
		setVisible(true);
	}
}