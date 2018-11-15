import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Find extends JFrame 
{
	String [] Major = {"Computer Science", "Liberal Arts", "Science", "Economics", "Biotechnology", "Nursing", 
					"Medicine", "Dentistry", "Life Science", "Government Business", "Social Sciences", "Law", "Art", "Music"};

	String [] Grade = {"1", "2", "3", "4"};

	Data_Base D;

	public Find(Data_Base D)
	{
		this.D = D;

		setTitle("Find Your Info");
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

		JLabel grade = new JLabel("Grade ");
		grade.setBounds(100, 170, 120, 25);
		c.add(grade);

		JComboBox major_f = new JComboBox(Major);
		major_f.setBounds(160, 90, 160, 25);
		c.add(major_f);

		JTextField name_f = new JTextField(20);
		name_f.setBounds(160, 130, 160, 25);
		c.add(name_f);

		JComboBox grade_f = new JComboBox(Grade);
		grade_f.setBounds(160, 170, 160, 25);
		c.add(grade_f);

		JButton b1 = new JButton("Find");
		b1.setBounds(90, 240, 90, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Find"))
				{
					int num;

					for(num=0; num<D.total; num++)
					{
						if(D.NAME.get(num).equals(name_f.getText()) && D.MAJOR.get(num).equals((String)major_f.getSelectedItem())
								&& D.GRADE.get(num).equals((String)grade_f.getSelectedItem())) 
						{
							new Popup1(D, num);
							num = -1;
							break;
						}
					}

					if(num != -1)
					{
						new Popup2();
					}
				}
			}
		});

		JButton b2 = new JButton("Exit");
		b2.setBounds(250, 240, 90, 30);
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

		setSize(450, 340);
		setLocation(700, 300);
		setVisible(true);
	}
}