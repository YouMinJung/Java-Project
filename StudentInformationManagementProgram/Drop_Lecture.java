import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Drop_Lecture extends JFrame
{
	Data_Base D;

	Drop_Lecture(Data_Base D)
	{
		this.D = D;
		int i=0, p=0;
		int num=100;

		setTitle("Drop Lecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Drop Lecture >>");
		la.setBounds(150, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel menu = new JLabel("** Your Enroll Condition **");
		menu.setBounds(120, 100, 100, 40);	
		menu.setFont(new Font("Goergia", Font.ITALIC, 15));
		c.add(menu);

		for(i=0; i<D.L_total; i++)
		{
			for(p=0; p<D.STUDENT.get(i).num; p++)
			{
				if(D.STUDENT.get(i).print(p).equals(D.now_id))
				{
					String s = D.NUMBER.get(i);
					String s2 = "[ "+ D.NUMBER.get(i) + " ] (" + D.FIELD.get(i) + ") : "+ D.PROFESSOR.get(i) +" 's "+ D.TITLE.get(i);

					JButton b1 = new JButton(s2);
					b1.setBounds(100, num, 500, 30);
					c.add(b1);

					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JButton b = (JButton)e.getSource();

							if(b.getText().equals(s2))
							{
								new Drop(D, s);
							}
						}
					});

					num += 40;
				}
			}
		}

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