import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Adjust_My_Information extends JFrame
{
	Data_Base D;

	Adjust_My_Information(Data_Base D)
	{
		this.D = D;

		setTitle("Adjust Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Adjust Information >>");
		la.setBounds(130, 20, 500, 40);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel name = new JLabel("Name ");
		name.setBounds(100, 90, 120, 25);
		c.add(name);

		JLabel password = new JLabel("Pass ");
		password.setBounds(100, 130, 120, 25);
		c.add(password);

		JTextField name_f = new JTextField(20);
		name_f.setBounds(160, 90, 160, 25);
		c.add(name_f);
		
		JTextField password_f = new JTextField(20);
		password_f.setBounds(160, 130, 160, 25);
		c.add(password_f);

		JButton ok = new JButton("OK");
		ok.setBounds(180, 210, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();
				int num=0;

				if(b.getText().equals("OK"))
				{
					for(num=0; num<D.total; num++)
					{
						if(D.now_id.equals(D.ID.get(num)))
						{
							D.NAME.add(num, name_f.getText());
							D.PASS.add(num, password_f.getText());

							new Popup1(D, num);
						}
					}
				}
			}
		});


		JButton exit = new JButton("Exit");
		exit.setBounds(330, 210, 90, 30);
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

		setSize(600, 310);
		setLocation(700, 200);
		setVisible(true);
	}
}