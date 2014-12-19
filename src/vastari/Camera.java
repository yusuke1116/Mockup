package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

//CAMERA SCREEN

public class Camera extends JPanel{
	private Controller frame;
	public Camera(final Controller frame) {
	
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][200,grow][]", "[][10][][10][][30][][30][]"));
	   
	   JButton btnHome_10 = new JButton("Home"); //GO TO TO LOGIN PAGE
	   btnHome_10.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Camera","Login");				
			}
		});
		btnHome_10.setForeground(Color.WHITE);
		btnHome_10.setBackground(new Color(135, 206, 235));
		btnHome_10.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_10, "cell 0 0");
		
		JButton btnMenu_5 = new JButton("Menu"); //GO TO MENU
		btnMenu_5.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Camera","Menu");			
			}
		});
		btnMenu_5.setForeground(Color.WHITE);
		btnMenu_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMenu_5.setBackground(new Color(135, 206, 235));
		add(btnMenu_5, "cell 2 0,alignx right");
		
		JLabel lblUploadObj = new JLabel("Upload Object");
		lblUploadObj.setHorizontalAlignment(SwingConstants.CENTER);
		lblUploadObj.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
	    add(lblUploadObj, "cell 0 2 3 1,alignx center,aligny center");
		
		JLabel lblMemberNo_3 = new JLabel("Member No: 123");
		lblMemberNo_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberNo_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblMemberNo_3, "cell 0 4");
		
		JLabel lblObjects_3 = new JLabel("3/5 Objects");
		lblObjects_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjects_3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblObjects_3, "cell 2 4,alignx right");
		
		JButton btnTakeAPhoto = new JButton("Take a Photo");
		btnTakeAPhoto.setForeground(Color.WHITE);
		btnTakeAPhoto.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnTakeAPhoto.setBackground(new Color(135, 206, 235));
		add(btnTakeAPhoto, "cell 0 8,alignx center");
		
		JButton btnChooseFromGallery = new JButton("Choose from gallery"); //GO TO MY COLLECTION
		btnChooseFromGallery.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Camera","MyCollection");
			}
		});
		btnChooseFromGallery.setForeground(Color.WHITE);
		btnChooseFromGallery.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnChooseFromGallery.setBackground(new Color(135, 206, 235));
		add(btnChooseFromGallery, "cell 2 8");
	   
     }
}
