import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Essential2 extends JFrame
{
	Essential2()
	{
		setTitle("Multi Major Completion Condition");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Multi Major Completion Condition >>");
		la.setBounds(5, 20, 600, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel la1 = new JLabel("## ���� �̼� ���� : 130��");
		la1.setFont(new Font("Goergia", Font.ITALIC, 15));
		la1.setBounds(100, 120, 200, 40);
		c.add(la1);

		JLabel la2 = new JLabel("���� �ʼ� : 19��");
		la2.setFont(new Font("Goergia", Font.ITALIC, 15));
		la2.setBounds(100, 150, 200, 40);
		c.add(la2);

		JLabel la3 = new JLabel("���� ���� : 20��");
		la3.setFont(new Font("Goergia", Font.ITALIC, 15));
		la3.setBounds(100, 180, 400, 40);
		c.add(la3);

		JLabel la4 = new JLabel("���� �ʼ� : 17��");
		la4.setFont(new Font("Goergia", Font.ITALIC, 15));
		la4.setBounds(100, 210, 400, 40);
		c.add(la4);

		JLabel la5 = new JLabel("���� ���� : 21��");
		la5.setFont(new Font("Goergia", Font.ITALIC, 15));
		la5.setBounds(100, 240, 400, 40);
		c.add(la5);
		
		JLabel la6 = new JLabel("����  ��  : 38��");
		la6.setFont(new Font("Goergia", Font.ITALIC, 15));
		la6.setBounds(100, 270, 500, 40);
		c.add(la6);


		JButton b1 = new JButton("OK");
		b1.setBounds(250, 350, 90, 30);
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

		setSize(600, 430);
		setLocation(700, 200);
		setVisible(true);
	}
}