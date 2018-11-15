import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class E_Score extends JFrame
{
	Data_Base D;

	E_Score(Data_Base D, int i, int p)
	{
		this.D = D;

		setTitle("Score Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< "+D.STUDENT.get(i).print(p)+" Management >>");
		la.setBounds(110, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel score = new JLabel("Score ");
		score.setBounds(100, 100, 120, 25);
		c.add(score);
		
		JTextField score_f = new JTextField(20);
		score_f.setBounds(160, 100, 160, 25);
		c.add(score_f);

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
					D.SCORE.get(i).PUSH(score_f.getText(), p);
					new Popup4();
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