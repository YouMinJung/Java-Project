import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Lecture_Score extends JFrame
{
	Data_Base D;

	Lecture_Score(Data_Base D)
	{
		this.D = D;

		setTitle("Lecture Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Lecture Score >>");
		la.setBounds(150, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JButton b1 = new JButton("Score Of This Season Print");
		b1.setBounds(130, 110, 200, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Score Of This Season Print"))
				{
					new Season_Score(D);
				}
			}
		});

		JButton b2 = new JButton("Print All Score Information");
		b2.setBounds(130, 150, 200, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Print All Score Information"))
				{
					new All_Score(D);
				}
			}
		});

		JButton ok = new JButton("Exit");
		ok.setBounds(250, 300, 90, 30);
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

		setSize(600, 400);
		setLocation(700, 200);
		setVisible(true);
	}
}