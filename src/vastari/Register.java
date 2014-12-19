package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//REGISTER SCREEN

public class Register extends JPanel {
	
	private Controller frame;

	public Register(final Controller frame) {
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][200][66.00][-89.00]", "[][10][30][10,baseline][20][30][30][][10][10][30][10][10]"));
	   
	   JButton btnHome_2 = new JButton("Home"); //GO TO MAIN PAGE
	   btnHome_2.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {	
				frame.panelChange("Register","MainPage");				
			}
		});
	   
		btnHome_2.setForeground(Color.WHITE);
		btnHome_2.setBackground(new Color(135, 206, 235));
		btnHome_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_2, "cell 0 0");
		
		JLabel lblRegister = new JLabel("REGISTER");
		lblRegister.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblRegister, "cell 0 2 4 1,alignx center");
		
		JTextArea txtrRegisterAsA = new JTextArea();
		txtrRegisterAsA.setText("Register as a collector if you own works of interest that\r\nyou would like to share with the world's museums.\r\nNot only is Vastari a secure digital database of your\r\nworks, it is an anonymous platform for you to connect with \r\nthe world's museums for exhibitions. Through the App, you \r\ncan only register using the FREE MembershipTrial. If you \r\nwant to consider other membership types, please UPGRADE\r\nfrom your account settings or visit the website.");
		txtrRegisterAsA.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(txtrRegisterAsA, "cell 0 4 4 1,grow");
		
		JButton btnRegisterThroughThe = new JButton("Register through the website"); //GO TO WEBSITE
		btnRegisterThroughThe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				frame.OpenWebPage("https://www.vastari.com/collectors.aspx");
			}
		});
		
		btnRegisterThroughThe.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnRegisterThroughThe.setBackground(Color.WHITE);
		add(btnRegisterThroughThe, "cell 0 5 3 1");
		
		JLabel label_1 = new JLabel("MEMBERSHIP TRIAL");
		label_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(label_1, "cell 1 7,alignx center");
		
		JLabel labelFree = new JLabel("FREE");
		labelFree.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(labelFree, "cell 1 8,alignx center");
		
		JTextArea textArea = new JTextArea();
		textArea.setText("1. Limited to 5 object uploads\r\r\n2. Unlimited Exhibition Searches\r\r\n3. Access to Artists Sought");
		textArea.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(textArea, "cell 0 10 4 1,grow");
		
		JButton btnRegister_1 = new JButton("REGISTER"); //GO TO REGISTRATION 1
		btnRegister_1.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {	   		
				frame.panelChange("Register","Reg1");				
			}
		});
		
		btnRegister_1.setForeground(Color.WHITE);
		btnRegister_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnRegister_1.setBackground(new Color(135, 206, 235));
	    add(btnRegister_1, "cell 1 12,alignx center");
	   
	   }
}
