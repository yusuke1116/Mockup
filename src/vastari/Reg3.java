package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//REGISTRATION 3 SCREEN

public class Reg3 extends JPanel{
	
	private Controller frame;
	private String[] country_array={"SELECT","country1","country2","country3"},title_array={"SELECT","mr.","mrs."},
	description_array={"SELECT","A","B","C"},art_array={"SELECT","Artist1", "Artist2", "Artist3"}, 
	category_array={"SELECT","cat1","cat2","cat3"};
	
	public Reg3(final Controller frame) {
		this.frame=frame;
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[grow][200][]", "[][10][][10][20][][][10][][30][][10][10][][][][10][]"));
		JButton btnHome_6 = new JButton("Home"); //GO TO MAIN PAGE
		btnHome_6.addActionListener(new ActionListener() {
			 @Override
		        public void actionPerformed(ActionEvent ae) {
				frame.panelChange("Reg3","MainPage");		
			}
		});
		
		btnHome_6.setForeground(Color.WHITE);
		btnHome_6.setBackground(new Color(135, 206, 235));
		btnHome_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_6, "cell 0 0");

		JLabel lblReg3 = new JLabel("Registration-Private Member");
		lblReg3.setHorizontalAlignment(SwingConstants.CENTER);
		lblReg3.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblReg3, "cell 0 2 3 1,alignx center,aligny center");

		JLabel lblDescribe = new JLabel("What would you describe yourself as?: *");
		lblDescribe.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblDescribe, "cell 0 4");

		final JComboBox comboBox_desc = new JComboBox(description_array);
		comboBox_desc.setBackground(Color.WHITE);
		add(comboBox_desc, "cell 0 5,growx");

		JLabel lblAreaOfInterest = new JLabel("Area of Interest:*");
		lblAreaOfInterest.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblAreaOfInterest, "cell 0 6");

		final JCheckBox chckbxFineArt = new JCheckBox("FINE ART");
		chckbxFineArt.setBackground(Color.WHITE);
		chckbxFineArt.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(chckbxFineArt, "cell 0 7");

		final JCheckBox chckbxAntiques = new JCheckBox("ANTIQUES");
		chckbxAntiques.setBackground(Color.WHITE);
		chckbxAntiques.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(chckbxAntiques, "cell 0 8");

		final JCheckBox chckbxArtefacts = new JCheckBox("ARTEFACTS");
		chckbxArtefacts.setBackground(Color.WHITE);
		chckbxArtefacts.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(chckbxArtefacts, "cell 0 9");

		final JCheckBox chckbxMemorabilia = new JCheckBox("MEMORABILIA");
		chckbxMemorabilia.setBackground(Color.WHITE);
		chckbxMemorabilia.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(chckbxMemorabilia, "cell 0 10");

		final JCheckBox chckbxOther = new JCheckBox("OTHER");
		chckbxOther.setBackground(Color.WHITE);
		chckbxOther.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(chckbxOther, "cell 0 11");

		final JCheckBox chckbxIAgreeTo = new JCheckBox("I agree to Vastari.com's");
		chckbxIAgreeTo.setBackground(Color.WHITE);
		chckbxIAgreeTo.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(chckbxIAgreeTo, "flowx,cell 0 13");

		JButton btnTermsconditions = new JButton("Terms&Conditions"); //GO TO WEBSITE
		btnTermsconditions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				frame.OpenWebPage("https://www.vastari.com/terms_conditions.aspx");
			}
		});
		
		btnTermsconditions.setForeground(Color.BLACK);
		btnTermsconditions.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnTermsconditions.setBackground(Color.WHITE);
		add(btnTermsconditions, "cell 0 13");

		JTextArea txtrVastariIsCommitted = new JTextArea();
		txtrVastariIsCommitted.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		txtrVastariIsCommitted.setText("Vastari is committed to protecting the privacy of the users of its \r\nwebsite. By submitting this registration you are agreeing to our ");
		add(txtrVastariIsCommitted, "cell 0 14 2 1,grow");

		JButton btnPrivacyPolicy = new JButton("Privacy Policy"); //GO TO WEBSITE
		btnPrivacyPolicy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				frame.OpenWebPage("https://www.vastari.com/privacy_policy.aspx");
			}
		});
		
		btnPrivacyPolicy.setHorizontalAlignment(SwingConstants.LEFT);
		btnPrivacyPolicy.setForeground(Color.BLACK);
		btnPrivacyPolicy.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		btnPrivacyPolicy.setBackground(Color.WHITE);
		add(btnPrivacyPolicy, "cell 0 15,alignx left");

		JButton btnBack_2 = new JButton("BACK"); //GO BACK TO REG2
		btnBack_2.addActionListener(new ActionListener() {
			 @Override
		        public void actionPerformed(ActionEvent ae) {			
				frame.panelChange("Reg3","Reg2");	
			}
		});
		
		btnBack_2.setForeground(Color.WHITE);
		btnBack_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnBack_2.setBackground(new Color(135, 206, 235));
		add(btnBack_2, "flowx,cell 0 17");

		JButton btnSubmit = new JButton("SUBMIT"); //GO TO REG4
		btnSubmit.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
				String describe = (String)comboBox_desc.getSelectedItem();
				
				if(describe.equals("SELECT")){
					JOptionPane.showMessageDialog(frame, "Please describe yourself.");
				}else if(chckbxFineArt.isSelected()==false && chckbxAntiques.isSelected()==false && 
						chckbxArtefacts.isSelected()==false && chckbxMemorabilia.isSelected()==false && 
						chckbxOther.isSelected()==false){
					JOptionPane.showMessageDialog(frame, "Please select at least one interest.");
				}else if(chckbxIAgreeTo.isSelected()==false){
					JOptionPane.showMessageDialog(frame, "Please agree to Terms and Conditions.");
				}else{
					frame.panelChange("Reg3","Reg4");
				}	
			}
		});
		
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnSubmit.setBackground(new Color(135, 206, 235));
		add(btnSubmit, "cell 0 17,alignx center");
		   
	}
}
