package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

//LOGIN SCREEN

public class Login extends JPanel{
	private Controller frame;
	public Login(final Controller frame) {
		this.frame=frame;
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[][200][]", "[][10][][10][][10][][10][][30][][10][]"));
		 
		JButton btnHome_3 = new JButton("Home"); //STAY ON THIS PAGE, SINCE THIS IS THE ACCOUNT HOME
		btnHome_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Login","Login");	
			}
		});
		
		btnHome_3.setForeground(Color.WHITE);
		btnHome_3.setBackground(new Color(135, 206, 235));
		btnHome_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_3, "cell 0 0");
		
		JButton btnMenu = new JButton("Menu");  //GO TO MENU
		btnMenu.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Login","Menu");	
			}
		});
		
		btnMenu.setForeground(Color.WHITE);
		btnMenu.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMenu.setBackground(new Color(135, 206, 235));
		add(btnMenu, "cell 2 0");
		
		JLabel lblAccountSummary = new JLabel("Account Summary");
		lblAccountSummary.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountSummary.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblAccountSummary, "cell 0 2 3 1,alignx center,aligny center");
		
		JLabel lblMemberNo = new JLabel("Member No: 123");
		lblMemberNo.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberNo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblMemberNo, "cell 0 4");
		
		JLabel lblObjects = new JLabel("3/5 Objects");
		lblObjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjects.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblObjects, "cell 2 4");
		
		JLabel lblUploadAnObject = new JLabel("Upload an Object (Max 2MB)");
		lblUploadAnObject.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		lblUploadAnObject.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblUploadAnObject, "cell 0 6 3 1,alignx center");
		
		JButton btnUploadAnObject = new JButton("UPLOAD AN OBJECT NOW,CLICK HERE"); //GO TO UPLOAD OBJECT 1
		btnUploadAnObject.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Login","UpLoad1");		
			}
		});
		
		btnUploadAnObject.setForeground(Color.WHITE);
		btnUploadAnObject.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnUploadAnObject.setBackground(new Color(135, 206, 235));
		add(btnUploadAnObject, "cell 0 8 3 1,growx");
		
		JLabel lblUpgrade = new JLabel("Upgrade Your Account");
		lblUpgrade.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpgrade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblUpgrade, "cell 0 10 3 1,alignx center");
			
		JButton btnUpgrade_2 = new JButton("UPGRADE"); //GO TO WEBSITE
		btnUpgrade_2.addMouseListener(new MouseAdapter() { 
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.OpenWebPage("https://www.vastari.com/upgrade_subscription.aspx");
			}
		});
		btnUpgrade_2.setForeground(Color.WHITE);
		btnUpgrade_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnUpgrade_2.setBackground(new Color(135, 206, 235));
		add(btnUpgrade_2, "cell 0 12 3 1,growx");	 
	 }
}
