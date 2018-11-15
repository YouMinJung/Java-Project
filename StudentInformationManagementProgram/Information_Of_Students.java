import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Information_Of_Students extends JFrame
{
	String [] Major = {"Computer Science", "Liberal Arts", "Science", "Economics", "Biotechnology", "Nursing", 
					"Medicine", "Dentistry", "Life Science", "Government Business", "Social Sciences", "Law", "Art", "Music"};
	Data_Base D;

	Information_Of_Students(Data_Base D)
	{
		this.D = D;

		setTitle("Information Of Students");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Information Of Students >>");
		la.setBounds(100, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel major = new JLabel("Major ");
		major.setBounds(120, 110, 120, 25);
		c.add(major);

		JComboBox major_f = new JComboBox(Major);
		major_f.setBounds(180, 110, 160, 25);
		c.add(major_f);

		JButton ok = new JButton("OK");
		ok.setBounds(180, 200, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				String M = (String)major_f.getSelectedItem();

				if(b.getText().equals("OK"))
				{
					new Info_Students(D, M);
				}
			}
		});


		JButton exit = new JButton("Exit");
		exit.setBounds(330, 200, 90, 30);
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

		setSize(600, 300);
		setLocation(700, 200);
		setVisible(true);
	}
}