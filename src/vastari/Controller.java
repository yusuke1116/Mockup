package vastari;
import java.awt.*;
import java.io.*;

import javax.swing.*;

public class Controller extends JFrame {
	
	private MainPage MainPage;
	private Login Login;
	private Register Register;
	private Reg1 Reg1;
	private Reg2 Reg2;
	private Reg3 Reg3;
	private Reg4 Reg4;
	private Reg5 Reg5;
	private Settings Settings;
	private Camera Camera;
	private MyCollection MyCollection;
	private Upload1 UpLoad1;
	private Upload2 UpLoad2;
	private Contact Contact;
	private AboutUs AboutUs;
	private Menu Menu;

    public Controller() {
    
    //creating the main frame
    	
    setBounds(100, 100, 370, 640);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBackground(Color.WHITE);
    MainPage = new MainPage(this); 
    add(MainPage);
}    
  //Writes the user's password (set on Login) to a file
  	public void writePassword(String password){
  		
  		String file="files/password.txt";
  		try {
  			FileOutputStream fout=new FileOutputStream(file);	
  			byte[] a=password.getBytes();
  			fout.write(a);
  			fout.flush();
  		} catch (IOException e) {
  			System.err.println("file not found");
  		}
  	}
    public void OpenWebPage(String url){ //method to open a page in web browser
		   try {         
		     java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		   }
		   catch (java.io.IOException e) {
		       System.out.println(e.getMessage());
		   }
		}
    
  //switches panels upon button clicks
    public void panelChange(String indexRemove, String indexAdd){ 
	 
	  switch(indexRemove){   //panel to be removed from the frame
		  case "MainPage":
			   this.remove(MainPage);	   
			   break;
		  case "Login":
			   this.remove(Login);
			   break;
		  case "Register":
			   this.remove(Register);
			   break;
		  case "Reg1":
			   this.remove(Reg1);
			   break;
		  case "Reg2":
			   this.remove(Reg2);
			   break;
		  case "Reg3":
			   this.remove(Reg3);
			   break;
		  case "Reg4":
			   this.remove(Reg4);
			   break;
		  case "Reg5":
			   this.remove(Reg5);
			   break;
		  case "Settings":
			   this.remove(Settings);
			   break;
		  case "MyCollection":
			   this.remove(MyCollection);
			   break;
		  case "UpLoad1":
			   this.remove(UpLoad1);
			   break;
		  case "UpLoad2":
			   this.remove(UpLoad2);
			   break;
		  case "Camera":
			   this.remove(Camera);
			   break;
		  case "Contact":
			   this.remove(Contact);
			   break;
		  case "AboutUs":
			   this.remove(AboutUs);
			   break;
		  case "Menu":
			   this.remove(Menu);
			   break;
	  }
	  
	  switch(indexAdd){ //panel to be added to the frame
	   case "MainPage":
	   		MainPage = new MainPage(this);
	       	this.add(MainPage, BorderLayout.CENTER);    		
	       	break;
	   case "Login":
	   		Login = new Login(this);
	       	this.add(Login, BorderLayout.CENTER);
	   		break;
	   case "Register":
	   		Register = new Register(this);
	       	this.add(Register, BorderLayout.CENTER);
	   		break;
	   case "Reg1":
			Reg1 = new Reg1(this);
	  		this.add(Reg1, BorderLayout.CENTER);
	  		break;	
	   case "Reg2": 
		   	Reg2 = new Reg2(this);
		   	this.add(Reg2, BorderLayout.CENTER);
		   	break;
	   case "Reg3":
		   	Reg3 = new Reg3(this);
		   	this.add(Reg3, BorderLayout.CENTER);
		   	break;
	   case "Reg4":
		   	Reg4 = new Reg4(this);
		   	this.add(Reg4, BorderLayout.CENTER);
		   	break;
	   case "Reg5":
	   		Reg5 = new Reg5(this);
	   		this.add(Reg5, BorderLayout.CENTER);
	   		break;
	   case "Settings":
	   		Settings = new Settings(this);
	   		this.add(Settings, BorderLayout.CENTER);
	   		break;
	   case "MyCollection":
	   		MyCollection = new MyCollection(this);
	   		this.add(MyCollection, BorderLayout.CENTER);
	   		break;
	   case "UpLoad1":
	   		UpLoad1 = new Upload1(this);
	   		this.add(UpLoad1, BorderLayout.CENTER);
	   		break;
	   case "UpLoad2":
	   		UpLoad2 = new Upload2(this);
	   		this.add(UpLoad2, BorderLayout.CENTER);
	   		break;
	   case "Camera":
	   		Camera = new Camera(this);
	   		this.add(Camera, BorderLayout.CENTER);
	   		break;
	   case "Contact":
	   	    Contact = new Contact(this);
	   		this.add(Contact, BorderLayout.CENTER);
	   		break;
	   case "AboutUs":
	   		AboutUs = new AboutUs(this);
	   		this.add(AboutUs, BorderLayout.CENTER);
	   		break;
	   case "Menu":
	   		Menu = new Menu(this, indexRemove);
	   		this.add(Menu, BorderLayout.CENTER);
	   		break;
	  	}	  
	  this.revalidate();
	  this.repaint();
   }

   public static void main(String[] arguments) {

   	Controller frame = new Controller();
    frame.setVisible(true);
 
   }
  
}
