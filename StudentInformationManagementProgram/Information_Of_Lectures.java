import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Information_Of_Lectures extends JFrame
{
	Data_Base D;

	Information_Of_Lectures(Data_Base D)
	{
		this.D = D;

		setTitle("Information Of Lectures");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Information Of Lectures >>");
		la.setBounds(100, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JButton b1 = new JButton("Major Required");
		b1.setBounds(130, 110, 200, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Major Required"))
				{
					new Major_Required(D);
				}
			}
		});

		JButton b2 = new JButton("Major Selection");
		b2.setBounds(130, 150, 200, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Major Selection"))
				{
					new Major_Selection(D);
				}
			}
		});

		JButton b3 = new JButton("Liberal Arts Required");
		b3.setBounds(130, 190, 200, 30);
		c.add(b3);

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Liberal Arts Required"))
				{
					new Liberal_Arts_Required(D);
				}
			}
		});

		JButton b4 = new JButton("Liberal Arts Selection");
		b4.setBounds(130, 230, 200, 30);
		c.add(b4);

		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Liberal Arts Selection"))
				{
					new Liberal_Arts_Selection(D);
				}
			}
		});

		JButton b5 = new JButton("General Elective");
		b5.setBounds(130, 270, 200, 30);
		c.add(b5);

		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("General Elective"))
				{
					new General_Elective(D);
				}
			}
		});
		
		JButton ok = new JButton("Exit");
		ok.setBounds(250, 400, 90, 30);
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

		setSize(600, 500);
		setLocation(700, 200);
		setVisible(true);
	}
}