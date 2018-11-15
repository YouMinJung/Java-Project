import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Notice_Management extends JFrame
{
	Data_Base D;

	Notice_Management(Data_Base D)
	{
		this.D = D;

		setTitle("Notice Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Notice Management >>");
		la.setBounds(110, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JTextField tf = new JTextField(40);
		tf.setBounds(105, 110, 400, 30);
		c.add(tf);

		JTextArea ta = new JTextArea(50, 40);
		ta.setBounds(105, 150, 400, 500);
		c.add(ta);

		tf.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JTextField t = (JTextField)e.getSource();

				D.Notice.add(t.getText());

				ta.append(t.getText() +"\n");
				t.setText("");
			}
		});

		JButton ok = new JButton("OK");
		ok.setBounds(250, 700, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
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

		setSize(600, 800);
		setLocation(700, 200);
		setVisible(true);
	}
}