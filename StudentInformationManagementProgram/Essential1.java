import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Essential1 extends JFrame
{
	Essential1()
	{
		setTitle("Liberal Atrs Lecture Completion Condition");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Liberal Atrs Lecture Completion Condition >>");
		la.setBounds(30, 20, 800, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel la1 = new JLabel("## ���� �ʼ� : ���� ����, ��� �ٽ� ����");
		la1.setFont(new Font("Goergia", Font.ITALIC, 15));
		la1.setBounds(60, 120, 400, 40);
		c.add(la1);

		JLabel la2 = new JLabel("## ���� ���� : ���� ����, �Ϲ� ����");
		la2.setFont(new Font("Goergia", Font.ITALIC, 15));
		la2.setBounds(60, 150, 400, 40);
		c.add(la2);

		JLabel la3 = new JLabel("���� ���� : 11��  ");
		la3.setFont(new Font("Goergia", Font.ITALIC, 15));
		la3.setBounds(60, 200, 400, 40);
		c.add(la3);

		JLabel la4 = new JLabel("��� �ٽ� ���� : 8�� (4���� �̼�, �� ���� 2��)");
		la4.setFont(new Font("Goergia", Font.ITALIC, 15));
		la4.setBounds(60, 230, 400, 40);
		c.add(la4);

		JLabel la5 = new JLabel("���� ���� : 12��");
		la5.setFont(new Font("Goergia", Font.ITALIC, 15));
		la5.setBounds(60, 260, 400, 40);
		c.add(la5);
		
		JLabel la6 = new JLabel(" (�ڿ� ������ ����, ��ȸ ������ ����, �ι����� ����, ������ ü���� ����)");
		la6.setFont(new Font("Goergia", Font.ITALIC, 15));
		la6.setBounds(60, 280, 500, 40);
		c.add(la6);

		JLabel la7 = new JLabel("�Ϲ� ���� : 8��");
		la7.setFont(new Font("Goergia", Font.ITALIC, 15));
		la7.setBounds(60, 310, 400, 40);
		c.add(la7);

		JLabel la8 = new JLabel("** ��� �ٽ� ������ ���� ������ �� �κп��� ��� 1���� �̻� �̼�");
		la8.setFont(new Font("Goergia", Font.ITALIC, 15));
		la8.setBounds(60, 340, 500, 40);
		c.add(la8);

		JButton b1 = new JButton("OK");
		b1.setBounds(350, 430, 90, 30);
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

		setSize(800, 530);
		setLocation(700, 200);
		setVisible(true);
	}
}