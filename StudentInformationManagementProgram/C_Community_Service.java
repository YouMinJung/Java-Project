import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class C_Community_Service extends JFrame 
{
	Data_Base D;

	public C_Community_Service(Data_Base D)
	{
		this.D = D;
		int p=0, n=0;
		String s = "";

		setTitle("Community Service");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		for(n=0; n<D.total; n++)
		{
			if(D.now_id.equals(D.ID.get(n)))
			{
				break;
			}
		}

		for(p=0; p<D.total; p++)
		{
			if(D.now_id.equals(D.R_ID.get(p)) && D.RECOGNITION.get(p).equals("Community Service"))
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
		else if(D.RECOGNITION2.get(n).equals("3"))
		{
			JLabel r2 = new JLabel("; Complete Recognition");
			r2.setBounds(100, 130, 200, 25);
			c.add(r2);
		}
		else
		{
			JLabel r2 = new JLabel("; You don't ask Recognition");
			r2.setBounds(100, 130, 200, 25);
			c.add(r2);
		}

		JLabel la = new JLabel("<< Community Service >>");
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

					for(i=0; i<D.total; i++)
					{
						if(D.now_id.equals(D.R_ID.get(i)) && D.RECOGNITION.get(i).equals("Community Service") 
							&& D.R_CHECK.get(i).equals("1"))
						{
							D.RECOGNITION.remove(i);
							D.R_ID.remove(i);
							D.R_CHECK.remove(i);

							for(int l=0; l<D.total; l++)
							{
								if(D.now_id.equals(D.ID.get(l)))
								{
									D.RECOGNITION2.add(l, "3");
								}
							}		

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
		
		setSize(450, 320);
		setLocation(700, 300);
		setVisible(true);
	}
}