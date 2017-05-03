package qsp;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FramePractise {
	              

	public static void main(String[] args) {
		
		              

		JFrame myFrame = new JFrame("Account Created Details");
		myFrame.setVisible(true);
		myFrame.setBounds(50, 50, 700, 600);
		
		

		
		JLabel Name = new JLabel("UserName = ");
		Name.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		Name.setBackground(new Color(204, 204, 204));
		Name.setBounds(71, 50, 500, 36);
		myFrame.add(Name);
		
		

		JLabel email = new JLabel("E-mail Id = ");
		email.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		email.setBackground(new Color(204, 204, 204));
		email.setBounds(71, 120, 500, 36);
		myFrame.add(email);

		JLabel pwd = new JLabel("Password = ");
		pwd.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		pwd.setBackground(new Color(204, 204, 204));
		pwd.setBounds(71, 190, 500, 36);
		myFrame.add(pwd);

		JLabel ecid = new JLabel("ECID = ");
		ecid.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		ecid.setBackground(new Color(204, 204, 204));
		ecid.setBounds(71, 260, 500, 36);
		myFrame.add(ecid);

		JLabel map = new JLabel("Market Place = ");
		map.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		map.setBounds(71, 330, 500, 36);
		myFrame.add(map);

		JLabel exp = new JLabel("EXP = ");
		exp.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		exp.setBackground(new Color(204, 204, 204));
		exp.setBounds(71, 400, 500, 36);
		myFrame.add(exp);
        
		JLabel blank = new JLabel("");
		blank.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 15));
		blank.setBackground(new Color(204, 204, 204));
		blank.setBounds(71, 470, 500, 36);
		myFrame.add(blank);
		
		

	}

}