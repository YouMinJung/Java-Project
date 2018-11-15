import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Recognition extends JFrame 
{
	Data_Base D;

	public Recognition(Data_Base D, String S1, String S2)
	{
		this.D = D;
		int p=0;

		setTitle("Recognition");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Recognition >>");
		la.setBounds(100, 20, 800, 30);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(p=0; p<D.total; p++)
		{
			if(D.ID.get(p).equals(S2))
			{
				break;
			}
		}

		JLabel id = new JLabel("ID : "+ D.ID.get(p));
		id.setBounds(100, 90, 120, 25);
		c.add(id);

		JLabel major = new JLabel("Major : "+ D.MAJOR.get(p));
		major.setBounds(100, 120, 200, 25);
		c.add(major);

		JLabel name = new JLabel("Name : "+ D.NAME.get(p));
		name.setBounds(100, 150, 200, 25);
		c.add(name);

		JButton ok = new JButton("Approved");
		ok.setBounds(130, 200, 130, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Approved"))
				{
					int i=0;

					for(i=0; i<D.RECOGNITION.size(); i++)
					{
						if(S1.equals(D.RECOGNITION.get(i)) && S2.equals(D.R_ID.get(i)))
						{
							D.R_CHECK.add(i, "1");
						}
					}

					dispose();
				}
			}
		});

		JButton b2 = new JButton("Nnapproved");
		b2.setBounds(310, 200, 130, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Nnapproved"))
				{
					int i=0;

					for(i=0; i<D.RECOGNITION.size(); i++)
					{
						if(S1.equals(D.RECOGNITION.get(i)) && S2.equals(D.R_ID.get(i)))
						{
							D.R_CHECK.add(i, "2");
						}
					}

					dispose();
				}
			}
		});

		setSize(600, 300);
		setLocation(700, 300);
		setVisible(true);
	}
}