package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

//CONTACT SCREEN

public class Contact extends JPanel{
	private Controller frame;
	public Contact(final Controller frame) {
	
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][125.00][79.00]", "[][10][30][10][][10][][10][]"));
	   JButton btnHome_1 = new JButton("Home"); //GO TO MAIN PAGE
	   btnHome_1.addActionListener(new ActionListener() {
		   @Override
           public void actionPerformed(ActionEvent ae) {
			   frame.panelChange("Contact","MainPage");	 			
		   }
		});
	   
	   btnHome_1.setForeground(Color.WHITE);
	   btnHome_1.setBackground(new Color(135, 206, 235));
	   btnHome_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
	   add(btnHome_1, "cell 0 0");

	   JLabel lblAboutUs = new JLabel("CONTACT");
	   lblAboutUs.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
	   add(lblAboutUs, "cell 0 2 3 1,alignx center");
		
	   JTextArea txtrGeneralEnquiriesInfo = new JTextArea();
	   txtrGeneralEnquiriesInfo.setText("E-Mail:\r\n\r\nGeneral Enquiries: info (at) vastari.com\r\r\nPress Enquiries: editor (at) vastari.com\r\r\nArtists Sought&Exhibition Updates: francesca (at) vastari.com\r\r\nCollector Requests&Tutorials: angela (at) vastari.com\r\r\nTravelling Exhibition Network: ten (at) vastari.com \r\nTo Report Misuse of Site: security (at) vastari.com");
	   txtrGeneralEnquiriesInfo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
	   add(txtrGeneralEnquiriesInfo, "cell 0 4 3 1,grow");
		
	   JTextArea txtrTelephone = new JTextArea();
	   txtrTelephone.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
	   txtrTelephone.setText("Telephone:\r\n\r\n+44 (0) 207 723 3079\r\r\nMonday - Friday\r\n10 am - 6 pm GMT");
	   add(txtrTelephone, "cell 0 6 3 1,grow");
		
	   JTextArea txtrExhibitionConnectionLtd = new JTextArea();
	   txtrExhibitionConnectionLtd.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
	   txtrExhibitionConnectionLtd.setText("Address: \r\n\r\nExhibition Connection Ltd\r\n69-89 Mile End Road\r\nLondon E1 4TT\r\n34 Salisbury Street\r\nLondon NW8 8QE\r\n \r\nUnited Kingdom");
	   add(txtrExhibitionConnectionLtd, "cell 0 8 3 1,grow");
	   
	 }
}
