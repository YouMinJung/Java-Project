import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Student_Menu extends JFrame
{
	Data_Base D;

	Student_Menu(Data_Base D)
	{
		this.D = D;

		setTitle("Student Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Student >>");
		la.setBounds(180, 20, 200, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel id = new JLabel("ID : "+ D.now_id);
		id.setBounds(140, 90, 100, 25);
		c.add(id);
		
		JLabel major = new JLabel("Major : "+ D.now_major);
		major.setBounds(140, 120, 200, 25);
		c.add(major);

		JLabel name = new JLabel("Name : "+ D.now_name);
		name.setBounds(140, 150, 200, 25);
		c.add(name);
		
		JButton notice = new JButton("Notice");
		notice.setBounds(400, 300, 100, 60);
		c.add(notice);

		notice.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Notice"))
				{
					new Notice(D);
				}
			}
		});

		JButton info = new JButton("Essential Information");
		info.setBounds(400, 400, 160, 60);
		c.add(info);

		info.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Essential Information"))
				{
					new Essential_Information();
				}
			}
		});

		JLabel menu = new JLabel("** Student's Menu **");
		menu.setFont(new Font("Goergia", Font.ITALIC, 15));
		menu.setBounds(120, 200, 200, 40);
		c.add(menu);

		JButton b1 = new JButton("Print All Lecture");
		b1.setBounds(130, 240, 200, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Print All Lecture"))
				{
					new Print_All_Lecture(D);
				}
			}
		});

		JButton b2 = new JButton("Enroll In Lecture");
		b2.setBounds(130, 280, 200, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Enroll In Lecture"))
				{
					new Enroll_In_Lecture(D);
				}
			}
		});

		JButton b3 = new JButton("Drop Lecture");
		b3.setBounds(130, 320, 200, 30);
		c.add(b3);

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Drop Lecture"))
				{
					new Drop_Lecture(D);
				}
			}
		});

		JButton b4 = new JButton("Lecture Score");
		b4.setBounds(130, 360, 200, 30);
		c.add(b4);

		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Lecture Score"))
				{
					new Lecture_Score(D);
				}
			}
		});

		JButton b5 = new JButton("Credit Information");
		b5.setBounds(130, 400, 200, 30);
		c.add(b5);

		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Credit Information"))
				{
					new Credit_Information(D);
				}
			}
		});

		JButton b6 = new JButton("Information Of Scholarship");
		b6.setBounds(130, 440, 200, 30);
		c.add(b6);

		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Information Of Scholarship"))
				{
					new Information_Of_Scholarship(D);
				}
			}
		});

		JButton b7 = new JButton("Ask Recognition");
		b7.setBounds(130, 480, 200, 30);
		c.add(b7);

		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Ask Recognition"))
				{
					new Ask_Recognition(D);
				}
			}
		});

		JButton b8 = new JButton("Check Recognition");
		b8.setBounds(130, 520, 200, 30);
		c.add(b8);

		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Check Recognition"))
				{
					new Check_Recognition(D);
				}
			}
		});

		JButton b9 = new JButton("Adjust My Information");
		b9.setBounds(130, 560, 200, 30);
		c.add(b9);

		b9.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Adjust My Information"))
				{
					new Adjust_My_Information(D);
				}
			}
		});

		JButton ok = new JButton("Exit");
		ok.setBounds(250, 700, 90, 30);
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

		setSize(600, 800);
		setLocation(700, 200);
		setVisible(true);
	}
}