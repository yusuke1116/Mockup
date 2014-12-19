package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

//ABOUT US SCREEN

public class AboutUs extends JPanel{
	private Controller frame;
	public AboutUs(final Controller frame) {
		this.frame=frame;
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[grow][90.00][200][22.00]", "[][10][30][10][20][10][30][10][][76.00][10][][][10][]"));
		JButton btnHome = new JButton("Home");  //GO TO MAIN PAGE
		btnHome.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
			frame.panelChange("AboutUs","MainPage");		
			}
		});
		
		//test
		btnHome.setForeground(Color.WHITE);
		btnHome.setBackground(new Color(135, 206, 235));
		btnHome.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome, "cell 0 0");
		
		JLabel label = new JLabel("ABOUT US");
		label.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(label, "cell 0 2 3 1,alignx center");
		
		JLabel lblAboutTheCompany = new JLabel("ABOUT THE COMPANY");
		lblAboutTheCompany.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblAboutTheCompany, "cell 0 4 4 1");
		
		JTextArea txtrVastariConnectsCollectors = new JTextArea();
		txtrVastariConnectsCollectors.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtrVastariConnectsCollectors.setText("Vastari connects collectors to museums for exhibition loans.");
		add(txtrVastariConnectsCollectors, "cell 0 6 4 1,grow");
		
		JLabel lblAboutTheProduct = new JLabel("ABOUT THE PRODUCT");
		lblAboutTheProduct.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblAboutTheProduct, "cell 0 8");
		
		JTextArea txtrMuseumsAroundThe = new JTextArea();
		txtrMuseumsAroundThe.setText("Museums around the world organise tens of thousands of \r\nexhibitions a year. Vastari's interface and networking tools \r\nmake it easier for these museums to communicate with \r\nthe private sector directly.");
		txtrMuseumsAroundThe.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(txtrMuseumsAroundThe, "cell 0 9 4 1,grow");
		
		JLabel lblAboutTheApp = new JLabel("ABOUT THE APP");
		lblAboutTheApp.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblAboutTheApp, "cell 0 11");
		
		JTextArea txtrThisApplicationEnables = new JTextArea();
		txtrThisApplicationEnables.setText("This application enables collectors to upload a photo of an object, \r\nview My Collection, Register(free membership only) and reply\r\nto Inbox Messages.");
		txtrThisApplicationEnables.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(txtrThisApplicationEnables, "cell 0 12 3 1,grow");
		
		JButton button = new JButton("Click here to find out more."); //GO TO WEBSITE
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				frame.OpenWebPage("https://www.vastari.com/about.aspx");
			}
		});
		button.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		button.setBackground(Color.WHITE);
		add(button, "cell 0 14 3 1,alignx center");   
		   
	 }		   
}
