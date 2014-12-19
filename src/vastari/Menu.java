package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

//MENU SCREEN

public class Menu extends JPanel{
	
	private Controller frame;

	public Menu(final Controller frame, final String currentpage) {
	   this.frame=frame;
	   setBackground(Color.WHITE); 
	   setLayout(new MigLayout("", "[grow][200,grow][]", "[][30][20][10][20][10][][10][30][10][10][10][][10][]"));
	   
	   JButton btnClose = new JButton("Close"); //CLOSE MENU AND GO BACK TO MOST RECENT PAGE
       btnClose.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Menu", currentpage);	
			}
		});
       
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnClose.setBackground(new Color(135, 206, 235));
		add(btnClose, "cell 2 0");
		
		JButton btnMyCollection = new JButton("My Collection"); //GO TO MY COLLECTION
		btnMyCollection.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Menu","MyCollection");	
			}
		});
		
		btnMyCollection.setForeground(Color.BLACK);
		btnMyCollection.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMyCollection.setBackground(Color.WHITE);
		add(btnMyCollection, "cell 0 2 3 1,growx");
		
		JButton btnUploadObject = new JButton("Upload Object"); //GO TO UPLOAD OBJECT 1
		btnUploadObject.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Menu","UpLoad1");	
			}
		});
		
		btnUploadObject.setForeground(Color.BLACK);
		btnUploadObject.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnUploadObject.setBackground(Color.WHITE);
		add(btnUploadObject, "cell 0 4 3 1,growx");
		
		JButton btnMessages = new JButton("Messages");
		btnMessages.setForeground(Color.BLACK);
		btnMessages.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMessages.setBackground(Color.WHITE);
		add(btnMessages, "cell 0 6 3 1,growx");
		
		JButton btnAccountSettings = new JButton("Account Settings"); //GO TO SETTINGS
		btnAccountSettings.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {	
				frame.panelChange("Menu","Settings");				
			}
		});
		
		btnAccountSettings.setForeground(Color.BLACK);
		btnAccountSettings.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnAccountSettings.setBackground(Color.WHITE);
		add(btnAccountSettings, "cell 0 8 3 1,growx");
		
		JButton btnUpgrade = new JButton("Upgrade"); //GO TO WEBSITE
		btnUpgrade.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.OpenWebPage("https://www.vastari.com/upgrade_subscription.aspx");
			}
		});
		
		btnUpgrade.setForeground(Color.BLACK);
		btnUpgrade.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnUpgrade.setBackground(Color.WHITE);
		add(btnUpgrade, "cell 0 10 3 1,growx");
		
		JButton btnTerms = new JButton("Terms and Conditions"); //GO TO WEBSITE
		btnTerms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.OpenWebPage("https://www.vastari.com/terms_conditions.aspx");
			}
		});
		
		btnTerms.setForeground(Color.BLACK);
		btnTerms.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnTerms.setBackground(Color.WHITE);
		add(btnTerms, "cell 0 12 3 1,growx");
		
		JButton btnLogout = new JButton("Logout"); //GO TO MAIN PAGE
		btnLogout.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {	
				frame.panelChange("Menu","MainPage");	
			}
		});
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnLogout.setBackground(Color.WHITE);
		add(btnLogout, "cell 0 14 3 1,growx");
	   
		 }		 
}
