import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Season_Score extends JFrame
{
	Data_Base D;
	
	Season_Score(Data_Base D)
	{
		this.D = D;

		setTitle("Season Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Season Score >>");
		la.setBounds(150, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JButton b1 = new JButton("1학년 1학기");
		b1.setBounds(140, 100, 200, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("1학년 1학기"))
				{
					new Season11(D);
				}
			}
		});

		JButton b2 = new JButton("1학년 2학기");
		b2.setBounds(140, 140, 200, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("1학년 2학기"))
				{
					new Season12(D);
				}
			}
		});

		JButton b3 = new JButton("2학년 1학기");
		b3.setBounds(140, 180, 200, 30);
		c.add(b3);

		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("2학년 1학기"))
				{
					new Season21(D);
				}
			}
		});

		JButton b4 = new JButton("2학년 2학기");
		b4.setBounds(140, 220, 200, 30);
		c.add(b4);

		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("2학년 2학기"))
				{
					new Season22(D);
				}
			}
		});

		JButton b5 = new JButton("3학년 1학기");
		b5.setBounds(140, 260, 200, 30);
		c.add(b5);

		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("3학년 1학기"))
				{
					new Season31(D);
				}
			}
		});

		JButton b6 = new JButton("3학년 2학기");
		b6.setBounds(140, 300, 200, 30);
		c.add(b6);

		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("3학년 2학기"))
				{
					new Season32(D);
				}
			}
		});

		JButton b7 = new JButton("4학년 1학기");
		b7.setBounds(140, 340, 200, 30);
		c.add(b7);

		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("4학년 1학기"))
				{
					new Season41(D);
				}
			}
		});

		JButton b8 = new JButton("4학년 2학기");
		b8.setBounds(140, 380, 200, 30);
		c.add(b8);

		b8.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("4학년 2학기"))
				{
					new Season42(D);
				}
			}
		});

		JButton b9 = new JButton("Exit");
		b9.setBounds(250, 450, 130, 30);
		c.add(b9);

		b9.addActionListener(new ActionListener()
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
		
		setSize(600, 550);
		setLocation(700, 200);
		setVisible(true);
	}
}