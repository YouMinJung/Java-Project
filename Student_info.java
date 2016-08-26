import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Student_info extends JFrame
{
	Student_info()
	{
		setTitle("Student Information Management Program");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Student Information Management Program >>");
		la.setBounds(10, 20, 800, 30);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel id = new JLabel("User ");
		id.setBounds(160, 90, 120, 25);
		c.add(id);
		
		JLabel password = new JLabel("Pass ");
		password.setBounds(160, 120, 120, 25);
		c.add(password);

		JTextField id_f = new JTextField(20);
		id_f.setBounds(250, 90, 160, 25);
		c.add(id_f);
		
		JTextField password_f = new JTextField(20);
		password_f.setBounds(250, 120, 160, 25);
		c.add(password_f);

		JButton b1 = new JButton("Login");
		b1.setBounds(440, 90, 70, 60);
		c.add(b1);
	
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Login"))
				{
					if(id_f.getText().equals("1001") && password_f.getText().equals("0000"))
					{
						N_D.Now_major = "Manager";
						N_D.Now_name = "Professor";
						N_D.Now_id = "1001";
						N_D.Now_pass = "0000";

						System.out.println("Professor");
					}
					else
					{
						int p=0;
						int num = N_D.total_print();

						for(p=0; p<=num; p++) 
						{
							if(D[p].ID_print().equals(id_f.getText()) && D[p].PASS_print().equals(password_f.getText()))
							{
								N_D.Now_major = D[p].MAJOR_print();
								N_D.Now_name = D[p].NAME_print();
								N_D.Now_id = D[p].ID_print();
								N_D.Now_pass = D[p].PASS_print();

								System.out.println("Student");
							}
						}
					}		
				}
			}
		});
		
		JButton b2 = new JButton("Join NEW");
		b2.setBounds(230, 190, 100, 30);
		c.add(b2);
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Join NEW"))
				{
					new Join();
				}
			}
		});
		
		JButton b3 = new JButton("Find info");
		b3.setBounds(400, 190, 100, 30);
		c.add(b3);
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Find info"))
				{
					//new Find();
				}
			}
		});
		
		setSize(760, 300);
		setLocation(700, 400);
		setVisible(true);
	}		

	public static void main(String[] args)
	{	
		//Data_Base [] D = new Data_Base[50];
		//Number_Data N_D = new Number_Data();

		Thread th1 = new Number_Data();
		Thread th2 = new Data_Base();

		th1.start();
		th2.start();
		new Student_info();
	}
}






