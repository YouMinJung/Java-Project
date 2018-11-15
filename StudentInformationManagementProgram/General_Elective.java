import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class General_Elective extends JFrame
{
	Data_Base D;
	
	General_Elective(Data_Base D)
	{
		this.D = D;
		int num=90;
		int i=0;

		setTitle("Information Of General Elective");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Information Of General Elective >>");
		la.setBounds(50, 20, 600, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(i=0; i<D.L_total; i++)
		{
			String s = D.TITLE.get(i) + " : " + D.PROFESSOR.get(i);
			int n = i;

			if(D.FIELD.get(i).equals("General Elective"))
			{
				JButton B = new JButton(s);
				B.setBounds(120, num, 90, 30);
				c.add(B);

				B.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						JButton b = (JButton)e.getSource();

						if(b.getText().equals(s))
						{
							new L_Information(D, n);
						}
					}
				});

				num = num+40;
			}
		}

		JButton ok = new JButton("Exit");
		ok.setBounds(270, 400, 90, 30);
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

		setSize(650, 500);
		setLocation(700, 200);
		setVisible(true);
	}
}