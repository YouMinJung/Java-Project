import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Popup3 extends JFrame
{
	Data_Base D;

	public Popup3(Data_Base D)
	{
		this.D = D;

		setTitle("Add Success");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Complete >>");
		la.setBounds(130, 20, 400, 30);	
		la.setFont(new Font("Goergia", Font.ITALIC, 20));
		c.add(la);

		JLabel id = new JLabel("ID : "+ D.ID.get(D.ID.size()-1));
		id.setBounds(100, 70, 100, 30);	
		c.add(id);

		JLabel major = new JLabel("Major : "+ D.MAJOR.get(D.MAJOR.size()-1));
		major.setBounds(100, 100, 800, 30);	
		c.add(major);

		JLabel grade = new JLabel("Grade : "+ D.GRADE.get(D.GRADE.size()-1));
		grade.setBounds(100, 130, 800, 30);	
		c.add(grade);

		JLabel name = new JLabel("Name : "+D.NAME.get(D.NAME.size()-1));
		name.setBounds(100, 160, 800, 30);	
		c.add(name);

		JLabel password = new JLabel("Password : "+D.PASS.get(D.PASS.size()-1));
		password.setBounds(100, 190, 800, 30);	
		c.add(password);

		JButton b1 = new JButton("OK");
		b1.setBounds(150, 240, 90, 25);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("OK"))
				{
					dispose();
				}
			}
		});

		setSize(400, 330);
		setLocation(700, 300);
		setVisible(true);
	}
}