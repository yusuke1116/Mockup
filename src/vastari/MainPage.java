package vastari;
import java.awt.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//MAIN PAGE SCREEN

public class MainPage extends JPanel {
	private Controller frame;
	private JTextField usernameField_;
	private JPasswordField passwordField_;
	private String oldpassword;

	public MainPage(final Controller frame) {
		this.frame=frame;
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[grow][200,grow][]", "[][40][][10][][10][10][13.00][20.00][30][10][10][10][10][][10][][20]"));
		   
		JButton btnabout = new JButton("ABOUT US"); //GO TO ABOUT US 
		btnabout.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent ae) {
				frame.panelChange("MainPage","AboutUs"); 
			}
		});
		
		btnabout.setForeground(Color.WHITE);
		btnabout.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnabout.setBackground(new Color(135, 206, 235));
		add(btnabout, "cell 0 0 2 1,alignx center,aligny top");
		
		JButton btncontact = new JButton("CONTACT"); //GO TO CONTACT
		btncontact.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("MainPage","Contact");	
			}
		});
		
		btncontact.setForeground(Color.WHITE);
		btncontact.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btncontact.setBackground(new Color(135, 206, 235));
		add(btncontact, "cell 0 1 2 1,alignx center");

		JButton btnRegister = new JButton("REGISTER"); //GO TO REGISTER
		btnRegister.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("MainPage","Register");	
			}
		});
		
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnRegister.setBackground(new Color(135, 206, 235));
		add(btnRegister, "cell 0 2 2 1,alignx center");
		
		JTextArea txtrVastari = new JTextArea();
		txtrVastari.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		txtrVastari.setText("VASTARI");
		add(txtrVastari, "cell 0 4 2 1,alignx center,growy");
		
		JTextArea txtrTheExhibitonConnection = new JTextArea();
		txtrTheExhibitonConnection.setText("THE EXHIBITON CONNECTION");
		txtrTheExhibitonConnection.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(txtrTheExhibitonConnection, "cell 0 5 2 1,alignx center,growy");
		
		JTextArea txtrConnectingCollectorsAnd = new JTextArea();
		txtrConnectingCollectorsAnd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtrConnectingCollectorsAnd.setText("Connecting collectors and museum curators for exhibitions\r\nFor Collectors:\r\r\n\u2022 Exposure to top museums worldwide\r\n\u2022 Increase the cultural significance of collection\r\n\u2022 Get researched by experts in the field");
		add(txtrConnectingCollectorsAnd, "cell 0 7 2 1,alignx left,growy");
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblUsername, "cell 0 9,alignx left");
		usernameField_ = new JTextField();
		add(usernameField_, "cell 0 10,growx");
		usernameField_.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblPassword, "cell 0 11");
		passwordField_ = new JPasswordField();
		add(passwordField_, "cell 0 12,growx");
		
		JButton btnLogin = new JButton("LOGIN"); //GO TO LOGIN
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			//Validation
			public void mouseReleased(MouseEvent e) {
				if(usernameField_.getText().equals("")||passwordField_.getText().equals("")){
					JOptionPane.showMessageDialog(frame,"Please fill the mandatory fields.");
				}else if(passwordField_.getText().length()<6){
					JOptionPane.showMessageDialog(frame,"Wrong password!(Password should be at least 6 characters long.)");
				}else{
					BeanFileCryptoIOUtil.writeCryptoBean("data/password.dat", passwordField_.getText());
					String userpassword = (String)BeanFileCryptoIOUtil.readCryptoBean("data/password.dat");
					frame.writePassword(userpassword);
					Pincode();
					frame.panelChange("MainPage","Login");
				}	
			}
		});
		
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(135, 206, 235));
		add(btnLogin, "cell 0 14 2 1,alignx center");
		
		JButton txtrForgotYourUsername = new JButton();
		txtrForgotYourUsername.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
           	frame.OpenWebPage("https://www.vastari.com/forgot_password.aspx");	
		}
		});
		txtrForgotYourUsername.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtrForgotYourUsername.setText("Forgot your username or password?");
		add(txtrForgotYourUsername, "cell 0 16,grow");
		
		JTextArea txtrVastaricomAll = new JTextArea();
		txtrVastaricomAll.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 11));
		txtrVastaricomAll.setText("Vastari.com \u00A9 All rights reserved ");
		add(txtrVastaricomAll, "cell 0 17,grow");
   }
	
//"SET PINCODE" FRAME
	
   public void Pincode(){ 
	   
	final JFrame pinframe;
	JPanel pinpanel;
	final JTextField pinfield;
	JLabel pinlabel;
	JButton pinbutton;
	pinframe=new JFrame("Set Pincode");
	pinpanel=new JPanel();
	pinfield=new JTextField(4);
	pinlabel=new JLabel("Please set a 4 digit pincode.");
	pinbutton=new JButton("OK");
	pinpanel.add(pinlabel);
	pinpanel.add(pinbutton);
	pinpanel.add(pinfield);
	pinframe.add(pinpanel);
	pinframe.setSize(300,150);
	pinframe.setVisible(true);
	
	pinfield.addKeyListener(new KeyAdapter(){ //Restricts the user to type digits only
		@Override
		public void keyTyped(KeyEvent ke) {
			char character = ke.getKeyChar();
			if (((character < '0') || (character > '9'))
	                && (character != '\b')) {
	            ke.consume();	
			}
	}
	});	
	
	pinbutton.addMouseListener(new MouseAdapter() { //validation
		@Override
		public void mouseReleased(MouseEvent e) {
			if(pinfield.getText().length()!=4){
				JOptionPane.showMessageDialog(pinframe,"Pin must be 4 digits long.");
			}else{
				JOptionPane.showMessageDialog(pinframe,"Pincode is set successfully!");
				BeanFileCryptoIOUtil.writeCryptoBean("data/pincode.dat", pinfield.getText());  
				pinframe.setVisible(false);
			}	
		}
	});		
	   
	}	
}