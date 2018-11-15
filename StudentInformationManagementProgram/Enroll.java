import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Enroll extends JFrame
{
	Data_Base D;

	Enroll(Data_Base D, String s)
	{
		this.D = D;
		int i=0;

		setTitle("Enroll In "+ s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Enroll In " +s+ " >>");
		la.setBounds(120, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);


		for(i=0; i<D.L_total; i++)
		{
			if(D.NUMBER.get(i).equals(s))
			{
				break;
			}
		}

		int to = D.STUDENT.get(i).tos;

		JLabel la1 = new JLabel("** NOW The Total Number : "+ to +" **");
		la1.setFont(new Font("Goergia", Font.ITALIC, 15));
		la1.setBounds(60, 110, 400, 40);
		c.add(la1);

		JLabel la2 = new JLabel("The Total Number : "+ D.STUDENT.get(i).num);
		la2.setFont(new Font("Goergia", Font.ITALIC, 15));
		la2.setBounds(60, 90, 400, 40);
		c.add(la2);

		JLabel la4 = new JLabel("Field : "+ D.FIELD.get(i));
		la4.setBounds(100, 150, 400, 40);
		c.add(la4);

		JLabel la3 = new JLabel("Title : "+ D.TITLE.get(i));
		la3.setBounds(100, 180, 400, 40);
		c.add(la3);

		JLabel la5 = new JLabel("Professor : "+ D.PROFESSOR.get(i));
		la5.setBounds(100, 210, 400, 40);
		c.add(la5);

		JLabel la6 = new JLabel("Season : "+ D.SEASON.get(i));
		la6.setBounds(100, 240, 400, 40);
		c.add(la6);

		JLabel la7 = new JLabel("Credit : "+ D.CREDIT.get(i));
		la7.setBounds(100, 270, 400, 40);
		c.add(la7);

		JButton ok = new JButton("Enroll");
		ok.setBounds(130, 350, 130, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Enroll"))
				{
					for(int num=0; num<D.L_total; num++)
					{
						if(D.NUMBER.get(num).equals(s))
						{
							D.STUDENT.get(num).push(D.now_id);
							new Popup4();
						}
					}
				}
			}
		});

		JButton b2 = new JButton("Exit");
		b2.setBounds(310, 350, 130, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
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
		
		setSize(600, 450);
		setLocation(700, 200);
		setVisible(true);
	}
}