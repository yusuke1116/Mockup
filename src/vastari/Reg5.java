package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//REGISTRATION 5 SCREEN

public class Reg5 extends JPanel{
	
	private Controller frame;

	public Reg5(final Controller frame) {
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][][200][]", "[][10][][10][20][35][10]"));
	   
	   JButton btnHome_8 = new JButton("Home"); //GO TO MAIN PAGE
		btnHome_8.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Reg5","MainPage");			
			}
		});
		
		btnHome_8.setForeground(Color.WHITE);
		btnHome_8.setBackground(new Color(135, 206, 235));
		btnHome_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_8, "cell 0 0");
		
		JLabel lblRegister5 = new JLabel("Registration-Private Member");
		lblRegister5.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegister5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblRegister5, "cell 0 2 4 1,alignx center,aligny center");
		
		JTextArea txtrRegistrationEmail = new JTextArea();
		txtrRegistrationEmail.setText("Confirm Email\r\n\r\n\nSuccess! Your email has been confirmed.");
		txtrRegistrationEmail.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(txtrRegistrationEmail, "cell 0 4 4 1,grow");
		
		JButton btnGoToYour = new JButton("Go to your account"); //GO TO LOGIN PAGE
		btnGoToYour.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
	   		
				frame.panelChange("Reg5","Login");			
			}
		});
		
		btnGoToYour.setForeground(Color.WHITE);
		btnGoToYour.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnGoToYour.setBackground(new Color(135, 206, 235));
		add(btnGoToYour, "cell 1 6,alignx center");
		   
   }
}