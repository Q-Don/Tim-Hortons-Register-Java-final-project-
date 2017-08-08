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
import javafx.scene.control.Button;

/**
 * Tim Card FXML Controller class
 *
 * @author Simarpreet Kaur, Quardin Lyttle
 */
public class TimCardController implements Initializable
{

   @FXML
   private Button reload;
   @FXML
   private Button back;
   @FXML
   private Button balance;
   @FXML
   private Button buy;
   
   @FXML
   public void Back(ActionEvent event)
   {
       TimHortonsRegisterJavaFinalProject.LaunchRegister();
       
   }
   
   @FXML
   public void Buy(ActionEvent event)
   {
       TimHortonsRegisterJavaFinalProject.newCardStage.show();
   }
           
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
