package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//REGISTRATION 2 SCREEN

public class Reg2 extends JPanel{
	
	private Controller frame;
	private String[] country_array={"SELECT","country1","country2","country3"},title_array={"SELECT","mr.","mrs."},
	description_array={"SELECT","A","B","C"},art_array={"SELECT","Artist1", "Artist2", "Artist3"}, 
	category_array={"SELECT","cat1","cat2","cat3"};
	
	public Reg2(final Controller frame) {
		this.frame=frame;
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[grow][200][]", "[][10][][10][20][][][10][][30][][10][][][][][10][][][10][]"));
		
		JButton btnHome_5 = new JButton("Home");  //GO TO MAIN PAGE
		btnHome_5.addActionListener(new ActionListener() {
			 @Override
		        public void actionPerformed(ActionEvent ae) {	
				frame.panelChange("Reg2","MainPage");			
			}
		});
		
		btnHome_5.setForeground(Color.WHITE);
		btnHome_5.setBackground(new Color(135, 206, 235));
		btnHome_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_5, "cell 0 0");

		JLabel lblReg5 = new JLabel("Registration-Private Member");
		lblReg5.setHorizontalAlignment(SwingConstants.CENTER);
		lblReg5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblReg5, "cell 0 2 3 1,alignx center,aligny center");

		JLabel lblProfileInformation = new JLabel("Profile Information");
		lblProfileInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfileInformation.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblProfileInformation, "cell 0 4");

		JLabel lblTitle = new JLabel("Title:*");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblTitle, "cell 0 5");

		final JComboBox comboBoxtitle = new JComboBox(title_array);
		comboBoxtitle.setBackground(Color.WHITE);
		add(comboBoxtitle, "cell 0 6,growx");

		JLabel lblfname = new JLabel("First Name:*");
		lblfname.setHorizontalAlignment(SwingConstants.CENTER);
		lblfname.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblfname, "cell 0 7");

		final JTextField textFieldfname = new JTextField();
		add(textFieldfname, "cell 0 8,growx");
		textFieldfname.setColumns(10);

		JLabel lbllastname = new JLabel("Last Name:*");
		lbllastname.setHorizontalAlignment(SwingConstants.CENTER);
		lbllastname.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lbllastname, "cell 0 9");

		final JTextField textFieldlname = new JTextField();
		textFieldlname.setColumns(10);
		add(textFieldlname, "cell 0 10,growx");

		JLabel lbladdress = new JLabel("Address:");
		lbladdress.setHorizontalAlignment(SwingConstants.CENTER);
		lbladdress.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lbladdress, "cell 0 11");

		final JTextField textField_address = new JTextField(); 
		add(textField_address, "cell 0 12,growx");
		textField_address.setColumns(10);

		JLabel lblCountry = new JLabel("Country:*");
		lblCountry.setHorizontalAlignment(SwingConstants.CENTER);
		lblCountry.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblCountry, "cell 0 13");

		final JComboBox comboBox_country = new JComboBox(country_array);
		comboBox_country.setBackground(Color.WHITE);
		add(comboBox_country, "cell 0 14,growx");

		JLabel lblCity = new JLabel("City:*");
		lblCity.setHorizontalAlignment(SwingConstants.CENTER);
		lblCity.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblCity, "cell 0 15");

		final JTextField textField_city = new JTextField();
		textField_city.setColumns(10);
		add(textField_city, "cell 0 16,growx");

		JLabel lblZippostcode = new JLabel("Zip/Postcode:*");
		lblZippostcode.setHorizontalAlignment(SwingConstants.CENTER);
		lblZippostcode.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblZippostcode, "cell 0 17");

		final JTextField textField_zip = new JTextField();
		textField_zip.setColumns(10);
		add(textField_zip, "cell 0 18,growx");

		JButton btnBack = new JButton("Back"); //GO BACK TO REGISTRATION 1
		btnBack.addActionListener(new ActionListener() {
			@Override
	        public void actionPerformed(ActionEvent e) {	
				frame.panelChange("Reg2","Reg1");		
			}	
		});
		
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnBack.setBackground(new Color(135, 206, 235));
		add(btnBack, "cell 0 20,alignx left");

		JButton btnNext_1 = new JButton("Next"); //GO TO REG3
		btnNext_1.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
				String title = (String)comboBoxtitle.getSelectedItem();
				String country = (String)comboBox_country.getSelectedItem();
				if(title.equals("SELECT")){
					JOptionPane.showMessageDialog(frame, "Please select a title.");
				}else if(textFieldfname.getText().equals("")){ //firstname
					JOptionPane.showMessageDialog(frame, "Please enter a First name.");
				}else if(textFieldlname.getText().equals("")){ //lastname
					JOptionPane.showMessageDialog(frame, "Please enter a Lastname.");
				}else if(country.equals("SELECT")){ //country
					JOptionPane.showMessageDialog(frame, "Please select a country.");
				}else if(textField_city.getText().equals("")){ //city
					JOptionPane.showMessageDialog(frame, "Please enter a city.");
				}else if(textField_zip.getText().equals("")){ //zip
					JOptionPane.showMessageDialog(frame, "Please enter a zipcode.");
				}else{
					frame.panelChange("Reg2","Reg3");
				}		
			}
		});
		
		btnNext_1.setForeground(Color.WHITE);
		btnNext_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnNext_1.setBackground(new Color(135, 206, 235));
		add(btnNext_1, "cell 2 20,alignx right");
			   			   
	}	   
}
