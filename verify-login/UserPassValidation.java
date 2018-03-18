import java.awt.*;
import java.awt.event.*;
public class UserPassValidation extends Frame implements ActionListener
{
  TextField nameField, passField, resultField;
  Label username, password, result, submit;
  public UserPassValidation()
  { 
		  // set layout (columns,rows)
    setLayout(new GridLayout(4, 5));  
				// fill the gap with color
    setBackground(Color.blue);  
    // create components
    nameField = new TextField(15);
    passField = new TextField(15);
    resultField = new TextField(15);
    username = new Label("Enter User Name");
    password = new Label("Enter Password");
    result = new Label("Display Result");
				submit = new Label("");
				Button okButton = new Button("Submit");
				okButton.setBackground(Color.GRAY);
    okButton.setForeground(Color.white);
    // register the listener
    passField.addActionListener(this);
    // Sets the chars entered or viewed as whatever you choose so people don't see the password entered
    passField.setEchoChar('*');
				// Makes it so the result/validation message can or cannot be edited by user
    resultField.setEditable(false);

    add(username);
				add(nameField);
    add(password);
				add(passField);
    add(result);
				add(resultField);
				add(submit);
				add(okButton);
    
				okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				// get the values entered by the user
				String str1 = nameField.getText();
				String str2 = passField.getText();
				if(str1.equals("Joe") && str2.equals("password"))	
				{
				resultField.setText("VALID");
				}
				else	
				{
				resultField.setText("Rubbish!!");
				}
				}
				});
				
				setTitle("User Name & Password Validation");
				// Set the size of the viewscreen
				setSize(350, 100);
				setVisible(true);
				}
				
   public void actionPerformed(ActionEvent e)
   { 
			
			  // get the values entered by the user
     String str1 = nameField.getText();
     String str2 = passField.getText();
     // some simple validation
     if(str1.equals("Joe") && str2.equals("password"))
     {
       resultField.setText("VALID");
     }
     else
     {
       resultField.setText("Rubbish!!");
     }
   }
   public static void main(String args[])
   {
     new UserPassValidation();
   }
}