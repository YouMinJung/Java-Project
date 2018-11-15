import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Delete_Lecture extends JFrame
{
	Data_Base D;
	String [] Field = {"Major Required", "Major Selection", "Liberal Arts Required", "Liberal Arts Selection", "General Elective"};

	Delete_Lecture(Data_Base D)
	{
		this.D = D;

		setTitle("Delete Lecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Delete Lecture >>");
		la.setBounds(150, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel number = new JLabel("Number ");
		number.setBounds(120, 110, 120, 25);
		c.add(number);

		JLabel field = new JLabel("Field ");
		field.setBounds(120, 150, 120, 25);
		c.add(field);
		
		JLabel title = new JLabel("Title ");
		title.setBounds(120, 190, 120, 25);
		c.add(title);

		JTextField number_f = new JTextField(20);
		number_f.setBounds(220, 110, 160, 25);
		c.add(number_f);

		JComboBox field_f = new JComboBox(Field);
		field_f.setBounds(160, 150, 160, 25);
		c.add(field_f);

		JTextField title_f = new JTextField(20);
		title_f.setBounds(160, 190, 160, 25);
		c.add(title_f);

		JButton ok = new JButton("OK");
		ok.setBounds(180, 300, 90, 30);
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
						if(D.NUMBER.get(i).equals(number_f.getText()) && D.FIELD.get(i).equals((String)field_f.getSelectedItem())
							&& D.TITLE.get(i).equals(title_f.getText()))
						{
							D.L_total--;
							D.NUMBER.remove(i);
							D.TITLE.remove(i);
							D.CREDIT.remove(i);
							D.SEASON.remove(i);
							D.PROFESSOR.remove(i);
							D.FIELD.remove(i);
							D.STUDENT.remove(i);
							D.SCORE.remove(i);
			
							new Popup4();

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
		exit.setBounds(330, 300, 90, 30);
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

		setSize(600, 400);
		setLocation(700, 200);
		setVisible(true);
	}
}