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

		Data_Base D = new Data_Base();

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
						D.now_major = "Manager";
						D.now_name = "Professor";
						D.now_id = "1001";
						D.now_pass = "0000";

						new Professor_Menu(D);
					}
					else
					{
						int p=0;
						int num = D.total;

						for(p=0; p<num; p++) 
						{
							if(D.ID.get(p).equals(id_f.getText()) && D.PASS.get(p).equals(password_f.getText()))
							{
								D.now_major = D.MAJOR.get(p);
								D.now_name = D.NAME.get(p);
								D.now_id = D.ID.get(p);
								D.now_pass = D.PASS.get(p);

								new Student_Menu(D);
								p = -1;
								break;
							}
						}

						if(p != -1)
						{
							new Popup2();
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
					new Join(D);
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
					new Find(D);
				}
			}
		});
		
		setSize(760, 300);
		setLocation(700, 400);
		setVisible(true);
	}		

	public static void main(String[] args)
	{	
		new Student_info();
	}
}






