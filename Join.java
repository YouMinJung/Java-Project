import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Join extends JFrame 
{
	String [] Major = {"Computer Science", "Liberal Arts ", "Science", "Economics", "Biotechnology", "Nursing", 
					"Medicine", "Dentistry", "Life Science", "Government Business", "Social Sciences", "Law", "Art", "Music"};

	Join()
	{
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
				int total=0;
				String major = (String)major_f.getSelectedItem();

				if(B.getText().equals("Add"))
				{
					if(major.equals("Computer Science"))
					{
						N_D.add_A();
						number = 201621100 + N_D.A_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					}
					else if(major.equals("Liberal Arts"))
					{
						N_D.add_B();
						number = 201621100 + N_D.B_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					}
					else if(major.equals("Science"))
					{
						N_D.add_C();
						number = 201621100 + N_D.C_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Economics"))
					{
						N_D.add_D();
						number = 201621100 + N_D.D_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Biotechnology"))
					{
						N_D.add_E();
						number = 201621100 + N_D.E_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Nursing"))
					{
						N_D.add_F();
						number = 201621100 + N_D.F_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Medicine"))
					{
						N_D.add_G();
						number = 201621100 + N_D.G_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Dentistry"))
					{
						N_D.add_H();
						number = 201621100 + N_D.H_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Life Science"))
					{
						N_D.add_I();
						number = 201621100 + N_D.I_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					}
					else if(major.equals("Government Business"))
					{	
						N_D.add_J();
						number = 201621100 + N_D.J_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					}
					else if(major.equals("Social Sciences"))
					{
						N_D.add_K();
						number = 201621100 + N_D.K_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					}     	
					else if(major.equals("Law"))
					{
						N_D.add_L();
						number = 201621100 + N_D.L_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Art"))
					{
						N_D.add_M();
						number = 201621100 + N_D.M_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else if(major.equals("Music"))
					{
						N_D.add_N();
						number = 201621100 + N_D.N_print();
						total = N_D.total_print();

						D[total].ID(Integer.toString(number));
						D[total].MAJOR((String)major_f.getSelectedItem());
						D[total].NAME(name_f.getText());
						D[total].PASS(password_f.getText());
					} 
					else
					{
						System.out.println("Error...");
					}

					//new Popup3();
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