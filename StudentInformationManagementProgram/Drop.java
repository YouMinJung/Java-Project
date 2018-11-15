import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Drop extends JFrame
{
	Data_Base D;

	Drop(Data_Base D, String s)
	{
		this.D = D;
		int i=0;

		setTitle("Drop In "+ s);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Drop In " +s+ " >>");
		la.setBounds(120, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(i=0; i<D.L_total; i++)
		{
			if(D.NUMBER.get(i).equals(s))
			{
				break;
			}
		}

		JLabel la4 = new JLabel("Field : "+ D.FIELD.get(i));
		la4.setBounds(100, 110, 400, 40);
		c.add(la4);

		JLabel la3 = new JLabel("Title : "+ D.TITLE.get(i));
		la3.setBounds(100, 140, 400, 40);
		c.add(la3);

		JLabel la5 = new JLabel("Professor : "+ D.PROFESSOR.get(i));
		la5.setBounds(100, 170, 400, 40);
		c.add(la5);

		JLabel la6 = new JLabel("Season : "+ D.SEASON.get(i));
		la6.setBounds(100, 200, 400, 40);
		c.add(la6);

		JLabel la7 = new JLabel("Credit : "+ D.CREDIT.get(i));
		la7.setBounds(100, 230, 400, 40);
		c.add(la7);

		JButton ok = new JButton("Drop");
		ok.setBounds(130, 330, 130, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Drop"))
				{
					for(int num=0; num<D.L_total; num++)
					{
						if(D.NUMBER.get(num).equals(s))
						{
							for(int p=0; p<D.STUDENT.get(num).num; p++)
							{
								if(D.STUDENT.get(num).print(p).equals(D.now_id))
								{
									D.STUDENT.get(num).del(p);

									new Popup4();
								}
							}	
						}
					}
				}
			}
		});

		JButton b2 = new JButton("Exit");
		b2.setBounds(310, 330, 130, 30);
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
		
		setSize(600, 450);
		setLocation(700, 200);
		setVisible(true);
	}
}