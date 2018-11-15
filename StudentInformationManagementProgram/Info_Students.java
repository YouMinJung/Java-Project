import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Info_Students extends JFrame
{
	Data_Base D;

	Info_Students(Data_Base D, String M)
	{
		this.D = D;

		setTitle("Information Of Students");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< "+M+ " >>");
		la.setBounds(120, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		if(M.equals("Computer Science"))
		{
			JLabel L = new JLabel("Total Students : "+D.A);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);				
		}
		else if(M.equals("Computer Science"))
		{
			JLabel L = new JLabel("Total Students : "+D.B);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);
		}
		else if(M.equals("Science"))
		{
			JLabel L = new JLabel("Total Students : "+D.C);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);			
		}
		else if(M.equals("Economics"))
		{
			JLabel L = new JLabel("Total Students : "+D.D);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);				
		}
		else if(M.equals("Biotechnology"))
		{
			JLabel L = new JLabel("Total Students : "+D.E);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);				
		}
		else if(M.equals("Nursing"))
		{
			JLabel L = new JLabel("Total Students : "+D.F);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);					
		}
		else if(M.equals("Medicine"))
		{
			JLabel L = new JLabel("Total Students : "+D.G);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);					
		}
		else if(M.equals("Dentistry"))
		{
			JLabel L = new JLabel("Total Students : "+D.H);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);
		}
		else if(M.equals("Life Science"))
		{
			JLabel L = new JLabel("Total Students : "+D.I);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);					
		}
		else if(M.equals("Government Business"))
		{
			JLabel L = new JLabel("Total Students : "+D.J);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);					
		}
		else if(M.equals("Social Sciences"))
		{
			JLabel L = new JLabel("Total Students : "+D.K);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);					
		}
		else if(M.equals("Law"))
		{
			JLabel L = new JLabel("Total Students : "+D.L);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);					
		}
		else if(M.equals("Art"))
		{
			JLabel L = new JLabel("Total Students : "+D.M);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);					
		}
		else if(M.equals("Music"))
		{
			JLabel L = new JLabel("Total Students : "+D.N);
			L.setBounds(90, 50, 100, 30);	
			c.add(L);
		}

		int i=0;
		int num = 100;

		for(i=0; i<D.total; i++)
		{
			if(D.MAJOR.get(i).equals(M))
			{
				JLabel l = new JLabel("[ "+D.ID.get(i)+" ] : "+ D.NAME.get(i) + ",  (Grade : "+ D.GRADE.get(i)+ ")");
				l.setBounds(120, num, 400, 30);	
				c.add(l);
							
				num = num + 30;
			}
		}

		JButton exit = new JButton("Exit");
		exit.setBounds(250, 500, 90, 30);
		c.add(exit);

		exit.addActionListener(new ActionListener()
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

		setSize(600, 600);
		setLocation(700, 200);
		setVisible(true);
	}
}
