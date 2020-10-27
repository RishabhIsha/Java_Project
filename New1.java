package practice;
import java.sql.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class New1 
{
    JFrame j,j1,j2,j5;
    String ss=" ";
    JButton b1,b12;
  void adminlogin()
  {
	     j=new JFrame("Login Form");
	    
	     JLabel l=new JLabel("User Id");
	     l.setBounds(150, 50, 100, 30);
	     j.add(l);
		 final JTextField f0=new JTextField();
		 f0.setBounds(120, 80, 150, 30);
		 j.add(f0);
		 
		 JLabel l1=new JLabel("Password");
	     l1.setBounds(150, 120, 100, 30);
	     j.add(l1);
	     final JPasswordField passwordField = new JPasswordField();
		 passwordField.setBounds(120, 150, 150, 30);
		 j.add(passwordField);
		 JButton b=new JButton("Login");
		 b.setBounds(145, 210, 100, 40);
		 j.add(b);
		 
		 b.addActionListener(new ActionListener()
		 {
			public void actionPerformed(ActionEvent e) 
			{
				
               ss=f0.getText();	
              String password=passwordField.getText();
              
              if(ss.equals("Rishabh")&& password.equals("123456"))
              {
            	  j.setVisible(false);
            	  choice(); 
              }
              else
              {
            	  JOptionPane.showMessageDialog(null, "Sorry, Username or Password Error","Login Error!", JOptionPane.ERROR_MESSAGE);
              }
			}
        });
		 j.setSize(400,400);
		 j.setBackground(Color.WHITE);
		 j.setLayout(null);
	     j.setVisible(true);
    }
  void choice()
  {
	  j1=new JFrame("Choice");
	  j1.setSize(400,400);
	  j1.setBackground(Color.WHITE);
	  j1.setLayout(null);
      j1.setVisible(true);
	  b1=new JButton("New User");
	  b1.setBounds(120, 50, 120, 60);
	  j1.add(b1);
	  
	  b1.addActionListener(new ActionListener() 
	  {
		public void actionPerformed(ActionEvent e)
		{
			newform();
		}
	});
	  JButton b2=new JButton("Existing User");
	  b2.setBounds(120, 140, 120, 60);
	  j1.add(b2);
	  b2.addActionListener(new ActionListener()
	  {
		public void actionPerformed(ActionEvent e) 
		{
			existinguser();
		}
	});
	  JButton b3=new JButton("Log Out");
	  b3.setBounds(120, 230, 120, 60);
	  j1.add(b3);
	  b3.addActionListener(new ActionListener() 
	  {
		
		public void actionPerformed(ActionEvent e)
		{
		  j1.setVisible(false);
		 j.setVisible(true);
			
		}
	});   
  }
  
  private void newform() 
	{
			j1.setVisible(false);
			String name[]= {"Teacher","Student","Other"};
		    j2=new JFrame("New User Details");
			j2.setSize(500,500);
			 j2.setBackground(Color.WHITE);
			 j2.setLayout(null);
		     j2.setVisible(true);

			 JLabel j11=new JLabel("First Name");
			 j11.setBounds(20, 22, 140, 30);
			 j2.add(j11);
		      final JTextField f11=new JTextField();
		      f11.setBounds(160, 20, 130, 30);
		      j2.add(f11);
		      JLabel j12=new JLabel("Last Name");
		      j12.setBounds(20, 67, 140, 30);
		      j2.add(j12);
		      JTextField f12=new JTextField();
		      f12.setBounds(160, 65, 130, 30);
		      j2.add(f12);
		      JLabel j13=new JLabel("Email Id");
				 j13.setBounds(20, 112, 140, 30);
				 j2.add(j13);
			      final JTextField f13=new JTextField();
			      f13.setBounds(160, 110, 130, 30);
			      j2.add(f13);
			      JLabel j14=new JLabel("Contact No.");
					 j14.setBounds(20, 157, 140, 30);
					 j2.add(j14);
				      final JTextField f14=new JTextField();
				      f14.setBounds(160, 155, 130, 30);
				      j2.add(f14);
				      JLabel j15=new JLabel("Profession");
				      j15.setBounds(20, 202, 140, 30);
				      j2.add(j15);
				      JComboBox jc = new JComboBox(name);
				      jc.setBounds(160, 200, 140, 30);
				      j2.add(jc);
				      JLabel j16=new JLabel("Address 1");
						 j16.setBounds(20, 247, 140, 30);
						 j2.add(j16);
					      final JTextField f16=new JTextField();
					      f16.setBounds(160, 245, 190, 30);
					      j2.add(f16);
					      JLabel j17=new JLabel("Pin Code");
							 j17.setBounds(20, 292, 140, 30);
							 j2.add(j17);
						      final JTextField f17=new JTextField();
						      f17.setBounds(160, 290, 190, 30);
						      j2.add(f17);
				      
		      b12=new JButton("Submit");
		      b12.setBounds(100, 350, 100, 50);
		      j2.add(b12);
		      
		      
		      JButton b13=new JButton("Cancel");
		      b13.setBounds(250, 350, 100, 50);
		      j2.add(b13);
		      b12.addActionListener(new ActionListener()
		      {
				public void actionPerformed(ActionEvent e)
				{
				 idconfirm();	
				}
			});
		       b13.addActionListener(new ActionListener()
		       {
				public void actionPerformed(ActionEvent e)
				{
				  j2.setVisible(false);
				  j1.setVisible(true);
				}
			  });
}
 void idconfirm()
  {
			j2.setVisible(false);
			final JFrame j4=new JFrame("Id Confirmation");
			j4.setSize(400, 400);
			j4.setVisible(true);
			j4.setLayout(null);
			j4.setBackground(Color.WHITE);
			
				   String Pass1="";
			      
			      String Capital_chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
			      String numbers = "0123456789";

			      String values = Capital_chars + numbers ;
				        Random rndm_method = new Random(); 

			      char[] password = new char[10]; 

			      for (int i = 0; i < 10; i++) 
			      { 
			          password[i] = 
			            values.charAt(rndm_method.nextInt(values.length())); 
			          Pass1=Pass1+password[i];
			      } 
			   JLabel j110=new JLabel("Unique Id :-");
			   j110.setBounds(50, 78, 100, 40);
			   j4.add(j110);
			   JLabel j114=new JLabel(Pass1);
			   j114.setBounds(190, 80, 100, 40);
			   j4.add(j114);

		 JLabel j111=new JLabel("Enter Password");
			j111.setBounds(50, 120, 100, 40);
			j4.add(j111);
			final JTextField f111=new JTextField();
			f111.setBounds(190, 120, 140,30);
			j4.add(f111);
			JLabel j112=new JLabel("Confirm Password");
			j112.setBounds(50, 165, 100, 40);
			j4.add(j112);
			final JTextField f112=new JTextField();
			f112.setBounds(190, 165, 140,30);
			j4.add(f112);
			JButton jb11=new JButton("Submit");
			jb11.setBounds(120, 250, 100, 50);
			j4.add(jb11);
			jb11.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					String ss1=f111.getText();
					String ss2=f112.getText();
					if(ss1.equalsIgnoreCase(ss2))
					{
						JOptionPane.showMessageDialog(null,"Data Successfully Saved", "Success", JOptionPane.INFORMATION_MESSAGE);
						j4.setVisible(false);
						j1.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Password Mismatch","Error!", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
  }
 void existinguser()
 {
	 j1.setVisible(false);
		j5=new JFrame("Search");
		j5.setSize(350, 300);
		j5.setVisible(true);
		j5.setLayout(null);
		j5.setBackground(Color.WHITE);
		
		JLabel j22=new JLabel("Unique Id");
		j22.setBounds(50, 70, 100, 30);
		j5.add(j22);
		JTextField f22=new JTextField();
		f22.setBounds(150, 70, 120, 30);
		j5.add(f22);
		JButton jb11=new JButton("Search");
		jb11.setBounds(65, 150, 80, 40);
		j5.add(jb11);
		JButton jb12=new JButton("Cancel");
		jb12.setBounds(170, 150, 80, 40);
		j5.add(jb12);
		jb12.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
			  j5.setVisible(false);
			  j1.setVisible(true);
			}
		});
 }
  public static void main(String[] args) 
  {
	  New1 ob=new New1();
	  ob.adminlogin();
  }
}
