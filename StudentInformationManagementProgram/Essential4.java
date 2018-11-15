import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Essential4 extends JFrame
{
	Essential4()
	{
		setTitle("Etc, information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Etc, information >>");
		la.setBounds(130, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel la1 = new JLabel("## 졸업 이수 조건");
		la1.setFont(new Font("Goergia", Font.ITALIC, 15));
		la1.setBounds(60, 120, 400, 40);
		c.add(la1);

		JLabel la2 = new JLabel("1. 영어 : TOEIC 600점 이상");
		la2.setFont(new Font("Goergia", Font.ITALIC, 15));
		la2.setBounds(60, 150, 400, 40);
		c.add(la2);

		JLabel la3 = new JLabel("2. 봉사 : 2학년까지 60시간 + 사회 봉사 수업 이수");
		la3.setFont(new Font("Goergia", Font.ITALIC, 15));
		la3.setBounds(60, 180, 500, 40);
		c.add(la3);

		JLabel la4 = new JLabel("## 조기 졸업 조건");
		la4.setFont(new Font("Goergia", Font.ITALIC, 15));
		la4.setBounds(60, 230, 400, 40);
		c.add(la4);

		JLabel la5 = new JLabel("** 5 ~ 6학기까지 평균 평점 4.0이상 + 이수 학점 117점이상 **");
		la5.setFont(new Font("Goergia", Font.ITALIC, 15));
		la5.setBounds(60, 260, 600, 40);
		c.add(la5);
		

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

		setSize(600, 450);
		setLocation(700, 200);
		setVisible(true);
	}
}