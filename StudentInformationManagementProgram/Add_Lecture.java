import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Add_Lecture extends JFrame
{
	Data_Base D;
	String [] Field = {"Major Required", "Major Selection", "Liberal Arts Required", "Liberal Arts Selection", "General Elective"};
	String [] Season = {"11", "12", "21", "22", "31", "32", "41", "42"};
	String [] Credit = {"1", "2", "3"};

	Add_Lecture(Data_Base D)
	{
		this.D = D;
		Student_stack<String> s1 = new Student_stack<String>();
		Score_stack<String> s2 = new Score_stack<String>();

		setTitle("Add Lecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Add Lecture >>");
		la.setBounds(150, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel field = new JLabel("Field ");
		field.setBounds(140, 110, 120, 25);
		c.add(field);

		JLabel season = new JLabel("Season ");
		season.setBounds(140, 150, 120, 25);
		c.add(season);
		
		JLabel title = new JLabel("Title ");
		title.setBounds(140, 190, 120, 25);
		c.add(title);

		JLabel credit = new JLabel("Credit ");
		credit.setBounds(140, 230, 120, 25);
		c.add(credit);

		JLabel prof = new JLabel("Professor ");
		prof.setBounds(140, 270, 120, 25);
		c.add(prof);

		JComboBox field_f = new JComboBox(Field);
		field_f.setBounds(220, 110, 160, 25);
		c.add(field_f);

		JComboBox season_f = new JComboBox(Season);
		season_f.setBounds(220, 150, 160, 25);
		c.add(season_f);

		JTextField title_f = new JTextField(20);
		title_f.setBounds(220, 190, 160, 25);
		c.add(title_f);
		
		JComboBox credit_f = new JComboBox(Credit);
		credit_f.setBounds(220, 230, 160, 25);
		c.add(credit_f);

		JTextField prof_f = new JTextField(20);
		prof_f.setBounds(220, 270, 160, 25);
		c.add(prof_f);

		JLabel to = new JLabel("The Total Number ");
		to.setBounds(140, 310, 120, 25);
		c.add(to);

		JTextField to_f = new JTextField(20);
		to_f.setBounds(270, 310, 160, 25);
		c.add(to_f);

		JButton ok = new JButton("OK");
		ok.setBounds(160, 380, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				String field = (String)field_f.getSelectedItem();
				int number=0;

				if(b.getText().equals("OK"))
				{
					if(field.equals("Major Required"))
					{
						D.L_total++;
						number = 10000 + D.L_total;

						D.NUMBER.add(Integer.toString(number));
						D.FIELD.add((String)field_f.getSelectedItem());
						D.TITLE.add(title_f.getText());
						D.CREDIT.add((String)credit_f.getSelectedItem());
						D.PROFESSOR.add(prof_f.getText());
						D.SEASON.add((String)season_f.getSelectedItem());

						int to = Integer.parseInt(to_f.getText());
						
						s1.n_push(to);
						s2.n_push(to);

						D.STUDENT.add(s1);
						D.SCORE.add(s2);
					}
					else if(field.equals("Major Selection"))
					{
						D.L_total++;
						number = 20000 + D.L_total;

						D.NUMBER.add(Integer.toString(number));
						D.FIELD.add((String)field_f.getSelectedItem());
						D.TITLE.add(title_f.getText());
						D.CREDIT.add((String)credit_f.getSelectedItem());
						D.PROFESSOR.add(prof_f.getText());
						D.SEASON.add((String)season_f.getSelectedItem());

						int to = Integer.parseInt(to_f.getText());
						
						s1.n_push(to);
						s2.n_push(to);

						D.STUDENT.add(s1);
						D.SCORE.add(s2);
					}
					else if(field.equals("Liberal Arts Required"))
					{
						D.L_total++;
						number = 30000 + D.L_total;

						D.NUMBER.add(Integer.toString(number));
						D.FIELD.add((String)field_f.getSelectedItem());
						D.TITLE.add(title_f.getText());
						D.CREDIT.add((String)credit_f.getSelectedItem());
						D.PROFESSOR.add(prof_f.getText());
						D.SEASON.add((String)season_f.getSelectedItem());
			
						int to = Integer.parseInt(to_f.getText());

						s1.n_push(to);
						s2.n_push(to);
			
						D.STUDENT.add(s1);
						D.SCORE.add(s2);
					}
					else if(field.equals("Liberal Arts Selection"))
					{
						D.L_total++;
						number = 40000 + D.L_total;

						D.NUMBER.add(Integer.toString(number));
						D.FIELD.add((String)field_f.getSelectedItem());
						D.TITLE.add(title_f.getText());
						D.CREDIT.add((String)credit_f.getSelectedItem());
						D.PROFESSOR.add(prof_f.getText());
						D.SEASON.add((String)season_f.getSelectedItem());

						int to = Integer.parseInt(to_f.getText());

						s1.n_push(to);
						s2.n_push(to);

						D.STUDENT.add(s1);
						D.SCORE.add(s2);
					}
					else if(field.equals("General Elective"))
					{
						D.L_total++;
						number = 50000 + D.L_total;

						D.NUMBER.add(Integer.toString(number));
						D.FIELD.add((String)field_f.getSelectedItem());
						D.TITLE.add(title_f.getText());
						D.CREDIT.add((String)credit_f.getSelectedItem());
						D.PROFESSOR.add(prof_f.getText());
						D.SEASON.add((String)season_f.getSelectedItem());

						int to = Integer.parseInt(to_f.getText());

						s1.n_push(to);
						s2.n_push(to);
		
						D.STUDENT.add(s1);
						D.SCORE.add(s2);
					}
					else
					{
						System.out.println("Error...");
					}
	
					new Popup4();
				}
			}
		});


		JButton exit = new JButton("Exit");
		exit.setBounds(310, 380, 90, 30);
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