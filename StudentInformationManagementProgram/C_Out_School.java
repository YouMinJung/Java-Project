import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class C_Out_School extends JFrame 
{
	Data_Base D;

	public C_Out_School(Data_Base D)
	{
		this.D = D;

		int p=0;
		String s = "";

		setTitle("Get Out Of School");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		for(p=0; p<D.total; p++)
		{
			if(D.now_id.equals(D.R_ID.get(p)) && D.RECOGNITION.get(p).equals("Get Out Of School"))
			{
				s = D.R_CHECK.get(p);
				break;
			}
		}
		
		if(s.equals("0"))
		{
			JLabel r2 = new JLabel("; Wait Professor's Approval");
			r2.setBounds(100, 130, 200, 25);
			c.add(r2);
		}
		else if(s.equals("1"))
		{
			JLabel r2 = new JLabel("; Professor's Approval Process");
			r2.setBounds(100, 130, 200, 25);
			c.add(r2);
		}
		else if(s.equals("2"))
		{
			JLabel r2 = new JLabel("; Professor's approval False");
			r2.setBounds(100, 130, 200, 25);
			c.add(r2);
		}
		else
		{
			JLabel r2 = new JLabel("; You don't ask Recognition");
			r2.setBounds(100, 130, 200, 25);
			c.add(r2);
		}

		JLabel la = new JLabel("<< Get Out Of School >>");
		la.setBounds(25, 20, 800, 30);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel r1 = new JLabel("** Result **");
		r1.setBounds(100, 90, 120, 25);
		c.add(r1);

		JButton ok = new JButton("OK");
		ok.setBounds(100, 200, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
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

		JButton b2 = new JButton("Process");
		b2.setBounds(240, 200, 90, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Process"))
				{
					int i=0;

					for(int n=0; n<D.total; n++)
					{
						if(D.now_id.equals(D.ID.get(n)))
						{
							if(D.MAJOR.get(n).equals("Computer Science"))
							{
								D.A--;
							}
							else if(D.MAJOR.get(n).equals("Computer Science"))
							{
								D.B--;
							}
							else if(D.MAJOR.get(n).equals("Science"))
							{
								D.C--;
							}
							else if(D.MAJOR.get(n).equals("Economics"))
							{
								D.D--;
							}
							else if(D.MAJOR.get(n).equals("Biotechnology"))
							{
								D.E--;
							}
							else if(D.MAJOR.get(n).equals("Nursing"))
							{
								D.F--;
							}
							else if(D.MAJOR.get(n).equals("Medicine"))
							{
								D.G--;
							}
							else if(D.MAJOR.get(n).equals("Dentistry"))
							{
								D.H--;
							}
							else if(D.MAJOR.get(n).equals("Life Science"))
							{
								D.I--;
							}
							else if(D.MAJOR.get(n).equals("Government Business"))
							{
								D.J--;
							}
							else if(D.MAJOR.get(n).equals("Social Sciences"))
							{
								D.K--;
							}
							else if(D.MAJOR.get(n).equals("Law"))
							{
								D.L--;
							}
							else if(D.MAJOR.get(n).equals("Art"))
							{
								D.M--;
							}
							else if(D.MAJOR.get(n).equals("Music"))
							{
								D.N--;
							}

							D.total--;
							D.ID.remove(n);
							D.PASS.remove(n);
							D.MAJOR.remove(n);
							D.NAME.remove(n);
							D.GRADE.remove(n);

							D.CREDIT1.remove(n);
							D.CREDIT2.remove(n);
							D.CREDIT3.remove(n);
							D.CREDIT4.remove(n);
							D.CREDIT5.remove(n);

							D.SCORE11.remove(n);
							D.SCORE12.remove(n);
							D.SCORE21.remove(n);
							D.SCORE22.remove(n);
							D.SCORE31.remove(n);
							D.SCORE32.remove(n);
							D.SCORE41.remove(n);
							D.SCORE42.remove(n);
	
							D.SCHOLARSHIP.remove(n);
							D.RECOGNITION1.remove(n);
							D.RECOGNITION2.remove(n);
						}
					}

					for(i=0; i<D.total; i++)
					{
						if(D.now_id.equals(D.R_ID.get(i)) && D.RECOGNITION.get(i).equals("Get Out Of School") 
							&& D.R_CHECK.get(i).equals("1"))
						{
							D.RECOGNITION.remove(i);
							D.R_ID.remove(i);
							D.R_CHECK.remove(i);

							new Popup4();
							i=-1;
							break;
						}
					}

					if(i != -1)
					{
						new Popup2();
					}
			
					System.exit(0);
				}
			}
		});
		
		setSize(450, 330);
		setLocation(700, 300);
		setVisible(true);
	}
}