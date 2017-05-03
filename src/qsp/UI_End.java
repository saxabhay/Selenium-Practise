package qsp;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

public class UI_End extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1868621386002835352L;
	public JPanel contentPanel;
	
	
	
	JLabel emailLabel;
	JLabel passwordLabel;
	JButton createButton;
	JButton closeButton;
	public static String name;
	public static String emailid;
	public static String mp;
	public static String password;
	public JLabel nameLabel;
	

public static void main(String[] args) {

	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {

				UI_Practise account = new UI_Practise();
				account.setVisible(true);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}

public UI_End() {

	setTitle("Account Creator V1.0 By ABHAY SAXENA");
	setResizable(false);
	setDefaultCloseOperation(3);
	setBounds(100, 100, 600, 400);

	contentPanel = new JPanel();
	contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPanel);
	contentPanel.setLayout(null);

	emailLabel = new JLabel("E-mail Id= "+"email");
	emailLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
	emailLabel.setBackground(new Color(204, 204, 204));
	emailLabel.setBounds(71, 100, 109, 36);
	contentPanel.add(emailLabel);

	passwordLabel = new JLabel("Password ="+"password");
	passwordLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
	passwordLabel.setBackground(new Color(204, 204, 204));
	passwordLabel.setBounds(71, 165, 109, 36);
	contentPanel.add(passwordLabel);


	
	nameLabel = new JLabel("Name"+"name");
	nameLabel.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 20));
	nameLabel.setBackground(new Color(204, 204, 204));
	nameLabel.setBounds(71, 42, 109, 36);
	contentPanel.add(nameLabel);

}

@Override
public void actionPerformed(ActionEvent e) {
	
	
}


}
