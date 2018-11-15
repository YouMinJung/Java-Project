import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Join extends JFrame 
{
	String [] Major = {"Computer Science", "Liberal Arts", "Science", "Economics", "Biotechnology", "Nursing", 
					"Medicine", "Dentistry", "Life Science", "Government Business", "Social Sciences", "Law", "Art", "Music"};
	Data_Base D;

	public Join(Data_Base D)
	{
		this.D = D;

		setTitle("Join NEW Member");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Input Your Information >>");
		la.setBounds(10, 20, 800, 30);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel major = new JLabel("Major ");
		major.setBounds(100, 90, 120, 25);
		c.add(major);
		
		JLabel name = new JLabel("Name ");
		name.setBounds(100, 130, 120, 25);
		c.add(name);

		JLabel password = new JLabel("Pass ");
		password.setBounds(100, 170, 120, 25);
		c.add(password);

		JComboBox major_f = new JComboBox(Major);
		major_f.setBounds(160, 90, 160, 25);
		c.add(major_f);

		JTextField name_f = new JTextField(20);
		name_f.setBounds(160, 130, 160, 25);
		c.add(name_f);
		
		JTextField password_f = new JTextField(20);
		password_f.setBounds(160, 170, 160, 25);
		c.add(password_f);

		JButton b1 = new JButton("Add");
		b1.setBounds(90, 250, 90, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton B = (JButton)e.getSource();
				int number=0;

				if(B.getText().equals("Add"))
				{
					String major = (String)major_f.getSelectedItem();

					if(major.equals("Computer Science"))
					{
						D.A++;
						number = 201621100 + D.A;
						D.total++;
				
						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					}
					else if(major.equals("Liberal Arts"))
					{
						D.B++;
						number = 201631100 + D.B;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());
			
						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					}
					else if(major.equals("Science"))
					{
						D.C++;
						number = 201621200 + D.C;
						D.total++;
						
						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Economics"))
					{
						D.D++;
						number = 201641100 + D.D;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Biotechnology"))
					{
						D.E++;
						number = 201621300 + D.E;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Nursing"))
					{
						D.F++;
						number = 201622100 + D.F;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Medicine"))
					{
						D.G++;
						number = 201622300 + D.G;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Dentistry"))
					{
						D.H++;
						number = 201622200 + D.H;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Life Science"))
					{
						D.I++;
						number = 201641200 + D.I;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());
			
						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					}
					else if(major.equals("Government Business"))
					{	
						D.J++;
						number = 201641300 + D.J;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					}
					else if(major.equals("Social Sciences"))
					{
						D.K++;
						number = 201641400 + D.K;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					}     	
					else if(major.equals("Law"))
					{
						D.L++;
						number = 201631200 + D.L;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Art"))
					{
						D.M++;
						number = 201651100 + D.M;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else if(major.equals("Music"))
					{
						D.N++;
						number = 201661100 + D.N;
						D.total++;

						D.GRADE.add("1");
						D.ID.add(Integer.toString(number));
						D.MAJOR.add((String)major_f.getSelectedItem());
						D.NAME.add(name_f.getText());
						D.PASS.add(password_f.getText());

						D.CREDIT1.add("00");
						D.CREDIT2.add("00");
						D.CREDIT3.add("00");
						D.CREDIT4.add("00");
						D.CREDIT5.add("00");

						D.SCORE11.add("00");
						D.SCORE12.add("00");
						D.SCORE21.add("00");
						D.SCORE22.add("00");
						D.SCORE31.add("00");
						D.SCORE32.add("00");
						D.SCORE41.add("00");
						D.SCORE42.add("00");
	
						D.SCHOLARSHIP.add("00");
						D.RECOGNITION1.add("00");
						D.RECOGNITION2.add("00");
					} 
					else
					{
						System.out.println("Error...");
					}

					new Popup3(D);
				}
			}
		});

		JButton b2 = new JButton("Exit");
		b2.setBounds(250, 250, 90, 30);
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

		setSize(450, 350);
		setLocation(700, 300);
		setVisible(true);
	}
}