import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Professor_Menu extends JFrame
{
	Data_Base D;

	Professor_Menu(Data_Base D)
	{
		this.D = D;

		setTitle("Professor Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Professor >>");
		la.setBounds(180, 20, 220, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel id = new JLabel("ID : "+ D.now_id);
		id.setBounds(140, 90, 100, 25);
		c.add(id);
		
		JLabel major = new JLabel("Major : "+ D.now_major);
		major.setBounds(140, 120, 100, 25);
		c.add(major);

		JLabel name = new JLabel("Name : "+ D.now_name);
		name.setBounds(140, 150, 100, 25);
		c.add(name);

		JLabel menu = new JLabel("** Professor's Menu **");
		menu.setFont(new Font("Goergia", Font.ITALIC, 15));
		menu.setBounds(120, 200, 200, 40);
		c.add(menu);

		JButton b1 = new JButton("Add Lecture");
		b1.setBounds(130, 240, 200, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Add Lecture"))
				{
					new Add_Lecture(D);
				}
			}
		});

		JButton b2 = new JButton("Adjust Lecture");
		b2.setBounds(130, 280, 200, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Adjust Lecture"))
				{
					new Adjust_Lecture(D);
				}
			}
		});

		JButton b3 = new JButton("Delete Lecture");
		b3.setBounds(130, 320, 200, 30);
		c.add(b3);

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Delete Lecture"))
				{
					new Delete_Lecture(D);
				}
			}
		});

		JButton b4 = new JButton("Information Of Lectures");
		b4.setBounds(130, 360, 200, 30);
		c.add(b4);

		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Information Of Lectures"))
				{
					new Information_Of_Lectures(D);
				}
			}
		});

		JButton b5 = new JButton("Information Of Students");
		b5.setBounds(130, 400, 200, 30);
		c.add(b5);
		
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Information Of Students"))
				{
					new Information_Of_Students(D);
				}
			}
		});

		JButton b6 = new JButton("Score Management");
		b6.setBounds(130, 440, 200, 30);
		c.add(b6);

		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Score Management"))
				{
					new Score_Management(D);
				}
			}
		});

		JButton b7 = new JButton("Recognize Management");
		b7.setBounds(130, 480, 200, 30);
		c.add(b7);

		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Recognize Management"))
				{
					new Recognize_Management(D);
				}
			}
		});

		JButton b8 = new JButton("Notice Management");
		b8.setBounds(130, 520, 200, 30);
		c.add(b8);

		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Notice Management"))
				{
					new Notice_Management(D);
				}
			}
		});

		JButton b9 = new JButton("Information Of Scholarship");
		b9.setBounds(130, 560, 200, 30);
		c.add(b9);
	
		b9.addActionListener(new ActionListener()
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