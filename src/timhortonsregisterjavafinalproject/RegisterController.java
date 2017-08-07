/*
Simarpreet Kaur, Quardin Lyttle
Object Oriented Program 2 Java- PROG 24178 - P11 12248 / 106
Computer Engineering Tech
Sheridan College
 */
package timhortonsregisterjavafinalproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Simarpreet Kaur, Quardin Lyttle
 */
public class RegisterController implements Initializable
{
    
    @FXML
    private Button timcard;
    @FXML
    private Button exit;
    @FXML
    private Button menu;
    
   @FXML
    private void TimCard (ActionEvent event)
    {
        TimHortonsRegisterJavaFinalProject.LaunchTimCard();
        
    
    }

    @FXML
    private void exit(ActionEvent event)
    {
     Alert a = new Alert(Alert.AlertType.CONFIRMATION); 
     a.setTitle("Exit Application");
     a.setHeaderText("Confirm");
     a.setContentText("Press OK if you want to exit");
     a.showAndWait().ifPresent(response->
     {
      if(response==ButtonType.OK)
      System.exit(0);
     });
    }
   
        
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       
    }    
    
}
