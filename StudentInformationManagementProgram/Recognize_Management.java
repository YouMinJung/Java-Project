import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Recognize_Management extends JFrame
{
	Data_Base D;

	Recognize_Management(Data_Base D)
	{
		this.D = D;
		int num = 90;

		setTitle("Recognize Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Recognize Management >>");
		la.setBounds(100, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		for(int i=0; i<D.RECOGNITION.size(); i++)
		{
			String s, s1, s2;

			s = D.RECOGNITION.get(i) + " : "+ D.R_ID.get(i);
			s1 = D.RECOGNITION.get(i);
			s2 = D.R_ID.get(i);

			JButton B = new JButton(s);
			B.setBounds(130, num, 400, 30);
			c.add(B);

			B.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JButton b = (JButton)e.getSource();

					if(b.getText().equals(s))
					{
						new Recognition(D, s1, s2);
					}
				}
			});
		
			num = num + 40;
		}

		JButton ok = new JButton("Exit");
		ok.setBounds(250, 700, 90, 30);
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

		setSize(600, 800);
		setLocation(700, 200);
		setVisible(true);
	}
}