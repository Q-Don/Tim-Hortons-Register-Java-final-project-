/*
Simarpreet Kaur, Quardin Lyttle
Object Oriented Program 2 Java- PROG 24178 - P11 12248 / 106
Computer Engineering Tech
Sheridan College
 */
package timhortonsregisterjavafinalproject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Simarpreet Kaur, Quardin Lyttle
 */
public class NewCardController implements Initializable
{

    @FXML 
    private Button Buy;
     @FXML 
    private Button Cancel;
    @FXML 
    private Label lname;
    @FXML 
    private Label fname;
    @FXML 
    private Label emailID;
    @FXML 
    private Label balance;
    @FXML
    private Label thanks;
    @FXML 
    private TextField txtfname;
    @FXML 
    private TextField txtlname;
   @FXML 
    private TextField txtemail;
   @FXML 
    private TextField txtinibal;
   
   File data = new File("src/Tim Card Data/timCardData.txt");
    @FXML
    private void WRITE(ActionEvent event) throws IOException
    {
       PrintWriter output;
       String firstname=txtfname.getText();
       String lastname=txtlname.getText();
       String email=txtemail.getText();
       double intialbalance =Double.parseDouble(txtinibal.getText());
     
         try
         {
         output = new PrintWriter(new BufferedWriter(new FileWriter(data,true)));
         output.println(email+","+firstname+","+lastname+","+intialbalance);
         output.close();
         }
         catch(Exception e)
                 {
                 System.out.println("file not found-write");
                 }
         
         txtemail.clear();
         txtlname.clear();
         txtfname.clear();
         txtinibal.clear();
         thanks.setText("Tim Card Successfully Registered!");
         
    }
   
   @FXML
   public void Cancel(ActionEvent event)
   {
       TimHortonsRegisterJavaFinalProject.newCardStage.close();
       txtfname.clear();
       txtlname.clear();
       txtemail.clear();
       txtinibal.clear();
       
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
