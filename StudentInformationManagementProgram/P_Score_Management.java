import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class P_Score_Management extends JFrame
{
	Data_Base D;

	P_Score_Management(Data_Base D, String s)
	{
		this.D = D;
		int i=0, p=0;
		int num=100;

		setTitle("Score Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< "+ s +" Management >>");
		la.setBounds(120, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(i=0; i<D.L_total; i++)
		{
			if(s.equals(D.NUMBER.get(i)))
			{
				for(p=0; p<D.STUDENT.get(i).num; p++)
				{
					int num1 = i;
					int num2 = p;
					String ch = "ID : " +D.STUDENT.get(i).print(p);

					JButton b1 = new JButton(ch);
					b1.setBounds(100, num, 400, 30);
					c.add(b1);

					b1.addActionListener(new ActionListener()
					{
						public void actionPerformed(ActionEvent e)
						{
							JButton b = (JButton)e.getSource();
	
							if(b.getText().equals(ch))
							{
								new E_Score(D, num1, num2);
							}
						}
					});

					num += 40;
				}
			}
		}
		
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