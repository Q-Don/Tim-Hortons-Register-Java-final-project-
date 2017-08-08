/*
Simarpreet Kaur, Quardin Lyttle
Object Oriented Program 2 Java- PROG 24178 - P11 12248 / 106
Computer Engineering Tech
Sheridan College
 */
package timhortonsregisterjavafinalproject;

import java.io.File;
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
    private TextField firstname;
    @FXML 
    private TextField lastname;
   @FXML 
    private TextField email;
   @FXML 
    private TextField initialBalance;
   
   File data = new File("Time Card Data/timCardData.txt");
    
   
   @FXML
   public void Cancel(ActionEvent event)
   {
       TimHortonsRegisterJavaFinalProject.newCardStage.close();
   }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
