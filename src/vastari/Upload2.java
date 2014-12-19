package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//UPLOAD2 SCREEN

public class Upload2 extends JPanel{
	
	private Controller frame;

	public Upload2(final Controller frame) {
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][200,grow][]", "[][10][][10][][10][][10][][30][][10][][]"));
	   
	   JButton btnHome_13 = new JButton("Home"); //GO TO LOGIN PAGE
		btnHome_13.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {  		
				frame.panelChange("UpLoad2","Login");	
			}
		});
		
		btnHome_13.setForeground(Color.WHITE);
		btnHome_13.setBackground(new Color(135, 206, 235));
		btnHome_13.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_13, "cell 0 0");

		JButton btnMenu_8 = new JButton("Menu"); //GO TO MENU
		btnMenu_8.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {		
				frame.panelChange("UpLoad2","Menu");				
			}
		});
		
		btnMenu_8.setForeground(Color.WHITE);
		btnMenu_8.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMenu_8.setBackground(new Color(135, 206, 235));
		add(btnMenu_8, "cell 2 0");
		
		JLabel lblUploadObj2 = new JLabel("Upload Object");
		lblUploadObj2.setHorizontalAlignment(SwingConstants.CENTER);
		lblUploadObj2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblUploadObj2, "cell 0 2 3 1,alignx center,aligny center");
		
		JLabel lblMemberNo_7 = new JLabel("Member No: 123");
		lblMemberNo_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberNo_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblMemberNo_7, "cell 0 4");
		
		JLabel lblObjects_7 = new JLabel("3/5 Objects");
		lblObjects_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjects_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblObjects_7, "cell 2 4");
		
		JTextArea txtrYourObjectHas = new JTextArea();
		txtrYourObjectHas.setText("Your object has been saved successfully. Your object \r\nreference number is XX123. Please upload a photo\r\nof your object.");
		txtrYourObjectHas.setRows(5);
		txtrYourObjectHas.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(txtrYourObjectHas, "cell 0 6 3 1,alignx left,growy");
		
		JButton btnUpload = new JButton("UPLOAD"); //GO TO CAMERA
		btnUpload.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {	   		
				frame.panelChange("UpLoad2","Camera");				
			}
		});
		
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnUpload.setBackground(new Color(135, 206, 235));
		add(btnUpload, "cell 0 8 3 1,alignx center");
		
		JButton btnBackToMy = new JButton("BACK TO MY COLLECTION"); //GO TO MY COLLECTION
		btnBackToMy.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {	   		
				frame.panelChange("UpLoad2","MyCollection");				
			}
		});
		
		btnBackToMy.setForeground(Color.WHITE);
		btnBackToMy.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnBackToMy.setBackground(new Color(135, 206, 235));
		add(btnBackToMy, "cell 0 10 3 1,alignx center");
		
		JTextArea txtrToAddAdditional = new JTextArea();
		txtrToAddAdditional.setText("To add additional information such as Movement/Theme, \r\nDate, Size, Geographical Origin etc, you can visit\r\nthe website. ");
		txtrToAddAdditional.setRows(5);
		txtrToAddAdditional.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(txtrToAddAdditional, "cell 0 12 3 1,grow");
		
		JButton addinfo = new JButton("Click here to go to Vastari website."); //GO TO WEBSITE
		addinfo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				frame.OpenWebPage("https://www.vastari.com/my_collection.aspx?my=true");
			}
		});
		
		addinfo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		addinfo.setBackground(Color.WHITE);
		add(addinfo, "cell 0 13 3 1,growx");	 
	 }
}
