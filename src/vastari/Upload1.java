package vastari;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import vastari.BeanFileCryptoIOUtil;
import net.miginfocom.swing.MigLayout;

//UPLOAD1 SCREEN

public class Upload1 extends JPanel{
	
	private Controller frame;
	private String[] country_array={"SELECT","country1","country2","country3"},title_array={"SELECT","mr.","mrs."},
	description_array={"SELECT","A","B","C"},art_array={"SELECT","Artist1", "Artist2", "Artist3"}, 
	category_array={"SELECT","cat1","cat2","cat3"};
	
	public Upload1(final Controller frame) {
		this.frame=frame;
		setBackground(Color.WHITE);
		setLayout(new MigLayout("", "[grow][200,grow][]", "[][10][][10][][30][][15.00][][30][][][10][10][][10][][]"));

		JButton btnHome_12 = new JButton("Home"); //GO TO LOGIN PAGE
		btnHome_12.addActionListener(new ActionListener() {
			 @Override
		        public void actionPerformed(ActionEvent ae) {	
				frame.panelChange("UpLoad1","Login");			
			}
		});
		
		btnHome_12.setForeground(Color.WHITE);
		btnHome_12.setBackground(new Color(135, 206, 235));
		btnHome_12.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(btnHome_12, "cell 0 0");

		JButton btnMenu_7 = new JButton("Menu"); //GO TO MENU
		btnMenu_7.addActionListener(new ActionListener() {
			 @Override
		        public void actionPerformed(ActionEvent ae) {			
				frame.panelChange("UpLoad1","Menu");				
			}
		});
		
		btnMenu_7.setForeground(Color.WHITE);
		btnMenu_7.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnMenu_7.setBackground(new Color(135, 206, 235));
		add(btnMenu_7, "cell 2 0,alignx right");

		JLabel lblUploadObject = new JLabel("Upload Object");
		lblUploadObject.setHorizontalAlignment(SwingConstants.CENTER);
		lblUploadObject.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		add(lblUploadObject, "cell 0 2 3 1,alignx center,aligny center");

		JLabel lblMemberNo_6 = new JLabel("Member No: 123");
		lblMemberNo_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblMemberNo_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblMemberNo_6, "cell 0 4");

		JLabel lblObjects_6 = new JLabel("3/5 Objects");
		lblObjects_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjects_6.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblObjects_6, "cell 2 4,alignx right");

		JLabel lblObjectInformation = new JLabel("Object Information");
		lblObjectInformation.setHorizontalAlignment(SwingConstants.CENTER);
		lblObjectInformation.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 14));
		add(lblObjectInformation, "cell 0 5 3 1,alignx left");

		JLabel lblCategory = new JLabel("Category:*");
		lblCategory.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategory.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblCategory, "cell 0 6");

		final JComboBox catbox = new JComboBox(category_array);
		catbox.setBackground(Color.WHITE);
		add(catbox, "cell 0 7,growx");

		JLabel lblTitle_2 = new JLabel("Title:*");
		lblTitle_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle_2.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblTitle_2, "cell 0 8");

		final JTextField titlefield2 = new JTextField();
		add(titlefield2, "cell 0 9,growx");
		titlefield2.setColumns(10);

		JLabel lblArtistmakerfinder = new JLabel("Artist/Maker/Finder:*");
		lblArtistmakerfinder.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtistmakerfinder.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 13));
		add(lblArtistmakerfinder, "cell 0 10");
				
		final JTextField artistfield = new JTextField();
		artistfield.setColumns(10);
		add(artistfield, "cell 0 12,growx");

		JButton btnAddNew = new JButton("Add New"); //ADD ARTIST
		btnAddNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				if(artistfield.getText().equals("")){
					JOptionPane.showMessageDialog(frame, "You did not enter a valid artist.");
				}else{
					JOptionPane.showMessageDialog(frame, "New artist has been saved.");	
				}
			}
		});

		final JComboBox artistbox = new JComboBox(art_array);
		artistbox.setBackground(Color.WHITE);
		add(artistbox, "cell 1 12,growx");
		btnAddNew.setForeground(Color.WHITE);
		btnAddNew.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnAddNew.setBackground(new Color(135, 206, 235));
		add(btnAddNew, "cell 2 12");
				
		JTextArea txtrPleaseAssignAt = new JTextArea();
		txtrPleaseAssignAt.setText("Please assign at least one artist/maker/finder for your object or \r\nuse Unknown/Anonymous.If you cannot find the corresponding \r\nname, please add it to our database using the 'Add New' Button. ");
		txtrPleaseAssignAt.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(txtrPleaseAssignAt, "cell 0 14 3 1,grow");

		final JCheckBox chckbxUnknown = new JCheckBox("Unknown");
		chckbxUnknown.setBackground(Color.WHITE);
		chckbxUnknown.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		add(chckbxUnknown, "cell 0 16");

		final JCheckBox chckbxAnonymous = new JCheckBox("Anonymous");
		chckbxAnonymous.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
		chckbxAnonymous.setBackground(Color.WHITE);
		add(chckbxAnonymous, "cell 0 17");
			
		JButton btnNext_5 = new JButton("Next"); //Validation
		btnNext_5.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent ae) {
				String Category = (String)catbox.getSelectedItem();
				String Artist = (String)artistbox.getSelectedItem();

				if(Category.equals("SELECT")){
					JOptionPane.showMessageDialog(frame, "Please select a category.");
				}else if(titlefield2.getText().equals("")){
					JOptionPane.showMessageDialog(frame, "Please give a title.");
				}else if(chckbxAnonymous.isSelected()==false&&chckbxUnknown.isSelected()==false&&Artist.equals("SELECT")&&
						artistfield.getText().equals("")){
					JOptionPane.showMessageDialog(frame, "Please select an artist or check Anonymous/unknown.");
				}else{
					frame.panelChange("UpLoad1","UpLoad2");
				}
			}
		});
		
		btnNext_5.setForeground(Color.WHITE);
		btnNext_5.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		btnNext_5.setBackground(new Color(135, 206, 235));
		add(btnNext_5, "cell 2 17,alignx right");
		   
	 }
}
