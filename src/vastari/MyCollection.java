package vastari;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

//MY COLLECTION SCREEN

public class MyCollection extends JPanel{
	
	private Controller frame;

	public MyCollection(final Controller frame) {
	   this.frame=frame;
	   setBackground(Color.WHITE);
	   setLayout(new MigLayout("", "[grow][200,grow][]", "[][10][][10][][10][][10][][10][][40][]"));
	   
	   JButton btnHome_11 = new JButton("Home"); //GO TO LOGIN PAGE
	   btnHome_11.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("MyCollection","Login");		
			}
		});
	   
		btnHome_11.setForeground(Color.WHITE);
		btnHome_11.setBackground(new Color(135, 206, 235));
		btnHome_11.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_11, "cell 0 0");
		
		JButton btnMenu_6 = new JButton("Menu"); //GO TO MENU
		btnMenu_6.addActionListener(new ActionListener() {
			 @Override
	            public void actionPerformed(ActionEvent ae) {
				frame.panelChange("MyCollection","Menu");	
			}
		});
		
		btnMenu_6.setForeground(Color.WHITE);
		btnMenu_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMenu_6.setBackground(new Color(135, 206, 235));
		add(btnMenu_6, "cell 2 0,alignx right");
		
		JLabel lblMycol = new JLabel("My Collection");
		lblMycol.setHorizontalAlignment(SwingConstants.CENTER);
		lblMycol.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblMycol, "cell 0 2 3 1,alignx center,aligny center");
		
		JLabel lblMemberNo_5 = new JLabel("Member No: 123");
		lblMemberNo_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberNo_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblMemberNo_5, "cell 0 4");
		
		JLabel lblObjects_5 = new JLabel("3/5 Objects");
		lblObjects_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjects_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblObjects_5, "cell 2 4,alignx right");
		
		JLabel lblMyObjects = new JLabel("My Objects");
		lblMyObjects.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyObjects.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblMyObjects, "cell 0 6");
		
		BufferedImage img1 = null;
		BufferedImage img2=null;
		try {
		    img1= ImageIO.read(new File("images/pic1.jpg"));
		    img2=ImageIO.read(new File("images/pic2.jpg"));
		} catch (IOException e) {
			System.out.println("Unable to fetch image.");     
		}
		
		BufferedImage ret1 = new BufferedImage(50,50,img1.TYPE_INT_RGB);
		ret1.getGraphics().drawImage(img1,0,0,50,50,null);
		ImageIcon icon1 = new ImageIcon(ret1);
		final JLabel pic1 = new JLabel(icon1);
		add(pic1, "cell 0 8,alignx center");
		
		BufferedImage ret2 = new BufferedImage(50,50,img2.TYPE_INT_RGB);
		ret2.getGraphics().drawImage(img2,0,0,50,50,null);
		ImageIcon icon2 = new ImageIcon(ret2);
		final JLabel pic2 = new JLabel(icon2);
		add(pic2, "cell 1 8,alignx center");
		
		JButton del1 = new JButton("Delete"); //Delete first picture
		del1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				remove(pic1);
				revalidate();
				repaint();	
			}
		});
		
		del1.setForeground(Color.WHITE);
		del1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		del1.setBackground(new Color(135, 206, 235));
		add(del1, "cell 0 10,alignx center");
		
		JButton del2 = new JButton("Delete"); //delete second picture
		del2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				remove(pic2);
				revalidate();
				repaint();	
			}
		});
		
		del2.setForeground(Color.WHITE);
		del2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		del2.setBackground(new Color(135, 206, 235));
		add(del2, "cell 1 10,alignx center");
		
		JButton btnUploadSimilarObject = new JButton("Upload Similar Object"); 
		btnUploadSimilarObject.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				frame.panelChange("MyCollection","UpLoad1");	
			}
		});
		
		btnUploadSimilarObject.setForeground(Color.WHITE);
		btnUploadSimilarObject.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnUploadSimilarObject.setBackground(new Color(135, 206, 235));
		add(btnUploadSimilarObject, "cell 0 12 3 1,alignx center");		   
	 }
}
