import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Out_School extends JFrame 
{
	Data_Base D;

	public Out_School(Data_Base D)
	{
		this.D = D;

		setTitle("Get Out Of School");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);

		JLabel la = new JLabel("<< Get Out Of School >>");
		la.setBounds(25, 20, 800, 30);	
		la.setFont(new Font("Jokerman", Font.ITALIC, 30));
		c.add(la);

		JLabel id = new JLabel("ID ");
		id.setBounds(100, 90, 120, 25);
		c.add(id);

		JTextField id_f = new JTextField(20);
		id_f.setBounds(160, 90, 160, 25);
		c.add(id_f);

		JButton ok = new JButton("OK");
		ok.setBounds(100, 200, 90, 30);
		c.add(ok);

		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();

				if(b.getText().equals("OK"))
				{
					int p=0;

					for(p=0; p<D.total; p++)
					{
						if(D.ID.get(p).equals(id_f.getText()))
						{
							D.RECOGNITION.add("Get Out Of School");
							D.R_ID.add(id_f.getText());
							D.R_CHECK.add("0");
							new Popup4();
							p = -1;
							break;
						}
					}

					if(p != -1)
					{
						new Popup2();
					}
				}
			}
		});

		JButton b2 = new JButton("Exit");
		b2.setBounds(240, 200, 90, 30);
		c.add(b2);

		b2.addActionListener(new ActionListener()
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
		
		setSize(450, 330);
		setLocation(700, 300);
		setVisible(true);
	}
}