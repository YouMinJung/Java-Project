import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Adjust_Lecture extends JFrame
{
	String [] Field = {"Major Required", "Major Selection", "Liberal Arts Required", "Liberal Arts Selection", "General Elective"};
	String [] Season = {"11", "12", "21", "22", "31", "32", "41", "42"};
	String [] Credit = {"1", "2", "3"};

	Data_Base D;

	Adjust_Lecture(Data_Base D)
	{
		this.D = D;

		setTitle("Adjust Lecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Adjust Lecture >>");
		la.setBounds(130, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel code = new JLabel("Input Lecture Code ");
		code.setBounds(120, 110, 120, 25);
		c.add(code);

		JLabel field = new JLabel("Field ");
		field.setBounds(140, 150, 120, 25);
		c.add(field);

		JLabel season = new JLabel("Season ");
		season.setBounds(140, 190, 120, 25);
		c.add(season);
		
		JLabel title = new JLabel("Title ");
		title.setBounds(140, 230, 120, 25);
		c.add(title);

		JLabel credit = new JLabel("Credit ");
		credit.setBounds(140, 270, 120, 25);
		c.add(credit);

		JLabel prof = new JLabel("Professor ");
		prof.setBounds(140, 310, 120, 25);
		c.add(prof);

		JTextField code_f = new JTextField(20);
		code_f.setBounds(240, 110, 160, 25);
		c.add(code_f);

		JComboBox field_f = new JComboBox(Field);
		field_f.setBounds(220, 150, 160, 25);
		c.add(field_f);

		JComboBox season_f = new JComboBox(Season);
		season_f.setBounds(220, 190, 160, 25);
		c.add(season_f);

		JTextField title_f = new JTextField(20);
		title_f.setBounds(220, 230, 160, 25);
		c.add(title_f);
		
		JComboBox credit_f = new JComboBox(Credit);
		credit_f.setBounds(220, 270, 160, 25);
		c.add(credit_f);

		JTextField prof_f = new JTextField(20);
		prof_f.setBounds(220, 310, 160, 25);
		c.add(prof_f);

		JLabel to = new JLabel("The Total Number ");
		to.setBounds(140, 350, 120, 25);
		c.add(to);

		JTextField to_f = new JTextField(20);
		to_f.setBounds(270, 350, 160, 25);
		c.add(to_f);

		JButton ok = new JButton("OK");
		ok.setBounds(180, 400, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("OK"))
				{
					int i=0;

					for(i=0; i<D.L_total; i++)
					{
						if(D.NUMBER.get(i).equals(code_f.getText()))
						{
							int n = Integer.parseInt(to_f.getText());

							D.FIELD.add((String)field_f.getSelectedItem());
							D.SEASON.add((String)season_f.getSelectedItem());
							D.TITLE.add(i, title_f.getText());
							D.CREDIT.add(i, (String)credit_f.getSelectedItem());		
							D.PROFESSOR.add(i, prof_f.getText());

							if(D.STUDENT.get(i).num > n)
							{
								new Popup5();
								D.STUDENT.get(i).add(n);
								D.SCORE.get(i).add(n);
							}

							new L_Information(D, i); 
							i=-1;
							break;
						}
					}

					if(i != -1)
					{
						new Popup2();
					}
				}
			}
		});


		JButton exit = new JButton("Exit");
		exit.setBounds(330, 400, 90, 30);
		c.add(exit);

		exit.addActionListener(new ActionListener()
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