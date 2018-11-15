import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Print_All_Lecture extends JFrame
{
	Data_Base D;

	Print_All_Lecture(Data_Base D)
	{
		this.D = D;
		int num=60;

		setTitle("Print All Lecture");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Print All Lecture >>");
		la.setBounds(200, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(int i=0; i<D.L_total; i++)
		{
			JLabel l = new JLabel("[ "+D.FIELD.get(i)+" ]"+D.PROFESSOR.get(i) +" 's "+ D.TITLE.get(i) +" Lecture :: ");
			l.setBounds(80, num, 800, 30);	
			c.add(l);

			JLabel l2 = new JLabel("Credit : "+ D.CREDIT.get(i) +", Season : "+ D.SEASON.get(i) +", The Total Number : "+ D.STUDENT.get(i).num);
			l2.setBounds(200, num+30, 800, 30);	
			c.add(l2);

			num += 60;
		}

		JButton b1 = new JButton("OK");
		b1.setBounds(370, 700, 90, 30);
		c.add(b1);

		b1.addActionListener(new ActionListener()
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

		setSize(800, 800);
		setLocation(700, 200);
		setVisible(true);
	}
}