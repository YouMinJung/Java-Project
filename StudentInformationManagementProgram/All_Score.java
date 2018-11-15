import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class All_Score extends JFrame
{
	Data_Base D;
	
	All_Score(Data_Base D)
	{
		this.D = D;
		int i=0;

		setTitle("All Score");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< All Score >>");
		la.setBounds(150, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(i=0; i<D.total; i++)
		{
			if(D.now_id.equals(D.ID.get(i)))
			{
				break;
			}
		}

		JLabel n = new JLabel("Season 11 : "+ D.SCORE11.get(i));
		n.setBounds(100, 100, 120, 25);
		c.add(n);

		JLabel n2 = new JLabel("Season 12 : "+ D.SCORE12.get(i));
		n2.setBounds(100, 130, 120, 25);
		c.add(n2);

		JLabel n3 = new JLabel("Season 21 : "+ D.SCORE21.get(i));
		n3.setBounds(100, 160, 120, 25);
		c.add(n3);

		JLabel n4 = new JLabel("Season 22 : "+ D.SCORE22.get(i));
		n4.setBounds(100, 190, 120, 25);
		c.add(n4);

		JLabel n5 = new JLabel("Season 31 : "+ D.SCORE31.get(i));
		n5.setBounds(100, 220, 120, 25);
		c.add(n5);

		JLabel n6 = new JLabel("Season 32 : "+ D.SCORE32.get(i));
		n6.setBounds(100, 250, 120, 25);
		c.add(n6);

		JLabel n7 = new JLabel("Season 41 : "+ D.SCORE41.get(i));
		n7.setBounds(100, 280, 120, 25);
		c.add(n7);

		JLabel n8 = new JLabel("Season 42 : "+ D.SCORE42.get(i));
		n8.setBounds(100, 310, 120, 25);
		c.add(n8);

		JLabel n9 = new JLabel("Total : ");
		n9.setBounds(100, 340, 120, 25);
		c.add(n9);

		JButton exit = new JButton("Exit");
		exit.setBounds(270, 500, 90, 30);
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
