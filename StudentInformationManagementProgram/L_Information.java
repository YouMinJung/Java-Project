import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class L_Information extends JFrame
{
	Data_Base D;

	public L_Information(Data_Base D, int number)
	{
		this.D = D;

		setTitle("Information of Lecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Information of Lecture >>");
		la.setBounds(80, 20, 400, 30);	
		la.setFont(new Font("Goergia", Font.ITALIC, 20));
		c.add(la);

		JLabel num = new JLabel("Number : "+ D.NUMBER.get(number));
		num.setBounds(100, 70, 800, 30);	
		c.add(num);

		JLabel major = new JLabel("Field : "+ D.FIELD.get(number));
		major.setBounds(100, 100, 800, 30);	
		c.add(major);

		JLabel credit = new JLabel("Credit : "+ D.CREDIT.get(number));
		credit.setBounds(100, 130, 800, 30);	
		c.add(credit);

		JLabel name = new JLabel("TITLE : "+ D.TITLE.get(number));
		name.setBounds(100, 160, 800, 30);	
		c.add(name);

		JLabel season = new JLabel("Season : "+ D.SEASON.get(number));
		season.setBounds(100, 190, 800, 30);	
		c.add(season);

		JLabel prof = new JLabel("Professor : "+ D.PROFESSOR.get(number));
		prof.setBounds(100, 220, 800, 30);	
		c.add(prof);

		JLabel to = new JLabel("The Total Number : "+ D.STUDENT.get(number).num);
		to.setBounds(100, 250, 800, 30);	
		c.add(to);

		JButton b1 = new JButton("OK");
		b1.setBounds(150, 290, 90, 25);
		c.add(b1);

		b1.addActionListener(new ActionListener()
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

		setSize(400, 370);
		setLocation(700, 300);
		setVisible(true);
	}
}