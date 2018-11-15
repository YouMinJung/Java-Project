import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Popup2 extends JFrame
{
	public Popup2()
	{
		setTitle("False");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< False >>");
		la.setBounds(130, 20, 400, 30);	
		la.setFont(new Font("Goergia", Font.ITALIC, 20));
		c.add(la);

		JLabel id = new JLabel("; There is No that information...");
		id.setBounds(100, 80, 800, 40);	
		c.add(id);

		JButton b1 = new JButton("OK");
		b1.setBounds(150, 150, 90, 30);
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

		setSize(400, 250);
		setLocation(700, 300);
		setVisible(true);
	}
}