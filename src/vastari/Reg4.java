package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//REGISTRATION 4 SCREEN

public class Reg4 extends JPanel{
	
	private Controller frame;

	public Reg4(final Controller frame) {
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][200][]", "[][10][][10][20][][]"));
	   
	   JButton btnHome_7 = new JButton("Home"); //GO TO MAIN PAGE
	   btnHome_7.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Reg4","MainPage");			
			}
		});
	   
		btnHome_7.setForeground(Color.WHITE);
		btnHome_7.setBackground(new Color(135, 206, 235));
		btnHome_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
	    add(btnHome_7, "cell 0 0");
		
		JLabel lblReg4 = new JLabel("Registration-Private Member");
		lblReg4.setHorizontalAlignment(SwingConstants.CENTER);
		lblReg4.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblReg4, "cell 0 2 3 1,alignx center,aligny center");
		
		JTextArea txtrRegistrationEmailSent = new JTextArea();
		txtrRegistrationEmailSent.setText("Registration Email Sent to user's email.\r\nCheck your email for the link to complete your registration.\r\nIf you don't see this email in your inbox within 15 minutes,look for \r\nit in your junk-mail folder. If you find it there, please mark the \r\nemail as Not Junk and add @vastari.com to your address book.");
		txtrRegistrationEmailSent.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(txtrRegistrationEmailSent, "cell 0 4 3 1,grow");
		
		JButton btnConfirmEmail = new JButton("Confirm Email"); //GO TO REGISTRATION 5
		btnConfirmEmail.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Reg4","Reg5");		
			}
		});
		
		btnConfirmEmail.setForeground(Color.WHITE);
		btnConfirmEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnConfirmEmail.setBackground(new Color(135, 206, 235));
		add(btnConfirmEmail, "cell 0 6"); 
	 }
}
