import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Enroll_In_Lecture extends JFrame
{
	Data_Base D;

	Enroll_In_Lecture(Data_Base D)
	{
		this.D = D;
		int num=100;

		setTitle("Enroll In Lecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Enroll In Lecture >>");
		la.setBounds(120, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(int i=0; i<D.L_total; i++)
		{
			String s2 = D.NUMBER.get(i); 
			String s = "[ "+ s2 + " ] (" + D.FIELD.get(i) + ") : "+ D.PROFESSOR.get(i) +" 's "+ D.TITLE.get(i);

			JButton b1 = new JButton(s);
			b1.setBounds(100, num, 400, 30);
			c.add(b1);

			b1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JButton b = (JButton)e.getSource();

					if(b.getText().equals(s))
					{
						new Enroll(D, s2);
					}
				}
			});

			num += 40;
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