package vastari;
import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//SETTINGS SCREEN

public class Settings extends JPanel{
	
	private Controller frame;
	private String oldp,newp;
	private JPasswordField newpass,oldpass,cnewpass;

	public Settings(final Controller frame) {
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][200][]", "[][10][][10][][30][10][10][][30][][10][][10][][][10][]"));

		JButton btnHome_9 = new JButton("Home"); //GO TO LOGIN PAGE
		btnHome_9.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {	   		
				frame.panelChange("Settings","Login");				
			}
		});
		
		btnHome_9.setForeground(Color.WHITE);
		btnHome_9.setBackground(new Color(135, 206, 235));
		btnHome_9.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_9, "cell 0 0");
		
		JButton btnMenu_3 = new JButton("Menu"); //GO TO MENU
		btnMenu_3.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
	   		
				frame.panelChange("Settings","Menu");
				
			}
		});
		
		btnMenu_3.setForeground(Color.WHITE);
		btnMenu_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMenu_3.setBackground(new Color(135, 206, 235));
		add(btnMenu_3, "cell 2 0");
		
		JLabel lblSetting = new JLabel("Settings");
		lblSetting.setHorizontalAlignment(SwingConstants.CENTER);
		lblSetting.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblSetting, "cell 0 2 3 1,alignx center,aligny center");
		
		JLabel lblMemberNo_1 = new JLabel("Member No: 123");
		lblMemberNo_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberNo_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblMemberNo_1, "cell 0 4");
		
		JLabel lblObjects_1 = new JLabel("3/5 Objects");
		lblObjects_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjects_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblObjects_1, "cell 2 4");
		
		JLabel lblChangePincode = new JLabel("Change Pincode");
		lblChangePincode.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePincode.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		add(lblChangePincode, "cell 0 5");
		
		JLabel lblOldPincode = new JLabel("Old Pincode:");
		lblOldPincode.setHorizontalAlignment(SwingConstants.CENTER);
		lblOldPincode.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblOldPincode, "cell 0 7");
		
		final JPasswordField oldpinfield = new JPasswordField();
		oldpinfield.setHorizontalAlignment(SwingConstants.LEFT);
		oldpinfield.setBackground(Color.WHITE);
		add(oldpinfield, "cell 0 8,growx");
		
		JLabel lblNewPincode = new JLabel("New Pincode:");
		lblNewPincode.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewPincode.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblNewPincode, "cell 0 9");
		
		final JPasswordField newpinfield = new JPasswordField(); //restricts the user to type digits only
		newpinfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char character = e.getKeyChar();
				if (((character < '0') || (character > '9'))
		                && (character != '\b')) {
		            e.consume();	
				}
			}
		});
		
		newpinfield.setHorizontalAlignment(SwingConstants.LEFT);
		newpinfield.setBackground(Color.WHITE);
		add(newpinfield, "cell 0 10,growx");
		
		JLabel lblConfirmNewPincode = new JLabel("Confirm New Pincode:");
		lblConfirmNewPincode.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirmNewPincode.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblConfirmNewPincode, "cell 0 11");
		
		final JPasswordField conpinfield = new JPasswordField(); //restricts the user to type digits only
		conpinfield.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char character = e.getKeyChar();
				if (((character < '0') || (character > '9'))
		                && (character != '\b')) {
		            e.consume();	
				}
			}
		});
		
		conpinfield.setHorizontalAlignment(SwingConstants.LEFT);
		conpinfield.setBackground(Color.WHITE);
		add(conpinfield, "cell 0 12,growx");

		//validation
		
		JButton btnOK = new JButton("OK");
		btnOK.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				String oldpincode = (String)BeanFileCryptoIOUtil.readCryptoBean("data/pincode.dat");
				if(oldpinfield.getText().equals(oldpincode)){
					if(newpinfield.getText().length()!=4){
						JOptionPane.showMessageDialog(frame, "Pincode must be 4 digits long.");
					}else{
						if(newpinfield.getText().equals(conpinfield.getText())){
							JOptionPane.showMessageDialog(frame, "You have successfully changed your pincode.");
							BeanFileCryptoIOUtil.writeCryptoBean("data/pincode.dat", newpinfield.getText());
						}else{
							JOptionPane.showMessageDialog(frame, "New Pincode and Confirm Pincode fields do not match!");
							}
						}
				}else{
					JOptionPane.showMessageDialog(frame, "Old pincode field does not match your old pincode.");
				}	
			}
		});
		
		btnOK.setForeground(Color.WHITE);
		btnOK.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnOK.setBackground(new Color(135, 206, 235));
		add(btnOK, "cell 1 14,alignx center");
		
		JLabel lblChangePassword = new JLabel("Change Password");
		lblChangePassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangePassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		add(lblChangePassword, "cell 0 15");
		
		JButton changepass = new JButton("Click here to change password."); //GO TO WEBSITE
		changepass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {		
				ChangePassword();
			}
		});
		changepass.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		changepass.setBackground(Color.WHITE);
		add(changepass, "cell 0 17 3 1,growx");	   
	}
	
	//a frame which enables user to change password
	public void ChangePassword(){
		
		final JFrame pframe = new JFrame("Change Password");
		pframe.setBounds(100, 100, 300, 300);
		pframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		JPanel passpanel = new JPanel();
		passpanel.setBackground(Color.WHITE);
		pframe.getContentPane().add(passpanel, BorderLayout.CENTER);
		pframe.setVisible(true);
		passpanel.setLayout(new MigLayout("", "[grow]", "[][][][][][][]"));
		
		JLabel lblOldPassword = new JLabel("Old Password");
		lblOldPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		passpanel.add(lblOldPassword, "cell 0 0");	
		
		oldpass = new JPasswordField();
		passpanel.add(oldpass, "cell 0 1,growx");
		
		JLabel lblNewPassword = new JLabel("New Password");
		lblNewPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		passpanel.add(lblNewPassword, "cell 0 2");
		
		newpass = new JPasswordField();
		passpanel.add(newpass, "cell 0 3,growx");
		
		JLabel lblConfirmNewPassword = new JLabel("Confirm New Password");
		lblConfirmNewPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		passpanel.add(lblConfirmNewPassword, "cell 0 4");
		
		final JPasswordField cnewpass = new JPasswordField();
		passpanel.add(cnewpass, "cell 0 5,growx");
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		passpanel.add(btnOk, "cell 0 6,alignx center");
		btnOk.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseReleased(MouseEvent e) {  //reads the current password from the file
				
				String destfile="files/password.txt";
				StringBuffer content = new StringBuffer();
			    FileInputStream fin = null;
				try {
					fin = new FileInputStream(destfile);
				} catch (FileNotFoundException e3) {
					e3.printStackTrace();
				}
			    int c;
			    try {
					while ((c = fin.read()) != -1) {
					  content.append((char) c);
					}
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			    try {
					fin.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			    
			    oldp=content.toString();
			
				if(oldpass.getText().equals(oldp)){ //validation
					if(newpass.getText().equals("")){
						JOptionPane.showMessageDialog(frame, "New password field is empty!");
					}else if(newpass.getText().length()<6){
						JOptionPane.showMessageDialog(frame, "New password must be at least 6 characters long!");		
					}else{
						if(newpass.getText().equals(cnewpass.getText())){
							newp=newpass.getText();
							frame.writePassword(newp);
							JOptionPane.showMessageDialog(frame, "New password is set successfully!");
							pframe.setVisible(false);
						}else{
							JOptionPane.showMessageDialog(frame, "New password and Confirm new password fields do not match!");
						}
					}
					
				}else{
					JOptionPane.showMessageDialog(frame, "Old password field does not match your old password.");						
					}
			}
		});
			
	}
			
}
