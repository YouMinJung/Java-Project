import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Score_Management extends JFrame
{
	Data_Base D;

	Score_Management(Data_Base D)
	{
		this.D = D;

		setTitle("Score Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Score Management >>");
		la.setBounds(130, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel n = new JLabel("Number ");
		n.setBounds(100, 110, 120, 25);
		c.add(n);

		JTextField n_f = new JTextField(20);
		n_f.setBounds(160, 110, 160, 25);
		c.add(n_f);

		JButton ok = new JButton("OK");
		ok.setBounds(180, 200, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("OK"))
				{
					new P_Score_Management(D, n_f.getText());
				}
			}
		});


		JButton exit = new JButton("Exit");
		exit.setBounds(330, 200, 90, 30);
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

		setSize(600, 300);
		setLocation(700, 200);
		setVisible(true);
	}
}