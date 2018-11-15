import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Season32 extends JFrame
{
	Data_Base D;

	Season32(Data_Base D)
	{
		this.D = D;
		int i=0, p=0;
		int num=100;

		setTitle("Score of Season32");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Score of Season32 >>");
		la.setBounds(120, 20, 400, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(i=0; i<D.L_total; i++)
		{
			for(p=0; p<D.STUDENT.get(i).num; p++)
			{
				if(D.STUDENT.get(i).print(p).equals(D.now_id) && D.SEASON.get(i).equals("32"))
				{
					String s = D.NUMBER.get(i);

					JLabel n = new JLabel("[ "+ s + " ] (" + D.FIELD.get(i) + ") : "+ D.PROFESSOR.get(i) +" 's "+ D.TITLE.get(i));
					n.setBounds(100, num, 120, 25);
					c.add(n);

					JLabel n1 = new JLabel("     => Score : "+ D.SCORE.get(i).print(p));
					n1.setBounds(100, num+30, 120, 25);
					c.add(n1);
	
					num += 70;
				}
			}
		}

		JButton ok = new JButton("Accept");
		ok.setBounds(130, 400, 130, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("Accept"))
				{
					
				}
			}
		});

		JButton b2 = new JButton("Exit");
		b2.setBounds(310, 400, 130, 30);
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


		setSize(600, 500);
		setLocation(700, 200);
		setVisible(true);
	}
}