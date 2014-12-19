package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

//REGISTRATION 1 SCREEN

public class Reg1 extends JPanel{
	
	private Controller frame;

	public Reg1(final Controller frame) {
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][200][][][]", "[][10][][20][][30][][10][][30][][10][][][][][10][]"));
	   
	   JButton btnHome_4 = new JButton("Home"); //GO TO MAIN PAGE
	   btnHome_4.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Reg1","MainPage");		
			}
		});
	   
		btnHome_4.setForeground(Color.WHITE);
		btnHome_4.setBackground(new Color(135, 206, 235));
		btnHome_4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_4, "cell 0 0");
		
		JLabel lblRegPrivate = new JLabel("Registration-Private Member");
		lblRegPrivate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegPrivate.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblRegPrivate, "cell 0 2 5 1,alignx center,aligny center");
		
		JLabel lblUsername_1 = new JLabel("Username:*");
		lblUsername_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
	    add(lblUsername_1, "cell 0 4");
		
		JTextArea txtrminimumCharacters = new JTextArea();
		txtrminimumCharacters.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtrminimumCharacters.setText("(minimum 6 characters)");
		add(txtrminimumCharacters, "cell 0 5 5 1,grow");
		
		final JTextField textField = new JTextField(); 
		add(textField, "cell 0 6,growx");
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email:*");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblEmail, "cell 0 7");
		
		final JTextField textField_1 = new JTextField(); 
		textField_1.setColumns(10);
		add(textField_1, "cell 0 8,growx");
		
		JLabel lblConfirmEmail = new JLabel("Confirm Email:*");
		lblConfirmEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblConfirmEmail, "cell 0 9");
		
		final JTextField textField_2 = new JTextField(); 
		textField_2.setColumns(10);
		add(textField_2, "cell 0 10,growx");
		
		JLabel lblPass = new JLabel("Password:*");
		lblPass.setHorizontalAlignment(SwingConstants.CENTER);
		lblPass.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblPass, "cell 0 11");
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setText("(minimum 6 characters)");
		textArea_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(textArea_1, "cell 0 12 5 1,grow");
		
		final JPasswordField passwordField = new JPasswordField(); 
		add(passwordField, "cell 0 13,growx");
		
		final JPasswordField passwordField_1 = new JPasswordField();
		add(passwordField_1, "cell 0 15,growx");
		
		JLabel lblConfirmPassword = new JLabel("Confirm Password:*");
		lblConfirmPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblConfirmPassword, "cell 0 14");
		
		JButton btnNext = new JButton("Next"); //GO TO REGISTRATION 2
		btnNext.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent ae) { //validation
				if(textField.getText().length()<6){
					JOptionPane.showMessageDialog(frame, "Username must be at least 6 characters long!");
				}else if(!(textField_1.getText().contains("@"))||textField_1.getText().equals("")){
					JOptionPane.showMessageDialog(frame, "Please enter a valid email address!");
				}else if(!(textField_1.getText().equals(textField_2.getText()))){
					JOptionPane.showMessageDialog(frame, "Email fields do not match!");
				}else if(passwordField.getText().length()<6){
					JOptionPane.showMessageDialog(frame, "Password must be at least 6 characters long!");
				}else if(!(passwordField.getText().equals(passwordField_1.getText()))){
					JOptionPane.showMessageDialog(frame, "Password fields do not match!");
				}else{
					frame.panelChange("Reg1","Reg2");
				}	
			}
		});
		
		btnNext.setForeground(Color.WHITE);
		btnNext.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnNext.setBackground(new Color(135, 206, 235));
		add(btnNext, "cell 0 17 5 1");
	  		   
	   }
}
