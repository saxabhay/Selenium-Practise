package qsp;
import javax.swing.JOptionPane;

public class Practise { 
	
	public static void main(String...args){
     String un = JOptionPane.showInputDialog("Username");
     System.out.println(un);
	}
}
	/*public static void main(final String[] args) {
        final JFrame parent = new JFrame();
        JButton button = new JButton();

        button.setText("Click me to show dialog!");
        parent.add(button);
        parent.pack();
        parent.setVisible(true);

        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String uname = JOptionPane.showInputDialog(parent,
                        "Username", null);
                System.out.println(uname);
                String pass = JOptionPane.showInputDialog(parent,
                        "pass", null);
                String marketplace = JOptionPane.showInputDialog(parent,
                        "pass", null);
            }
        });
    }
}*/
	