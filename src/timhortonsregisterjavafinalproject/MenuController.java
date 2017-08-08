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
 *
// * @author Simarpreet Kaur, Quardin Lyttle
 */
public class MenuController implements Initializable
{

 @FXML
 private Button back;
 @FXML
 private Button french;
 @FXML
 private Button capp;
 @FXML
 private Button latte;
 @FXML
 private Button hotchocolate;
 @FXML
 private Button original;
 @FXML
 private Button darkroast;
 @FXML
 private Button decaf;
 @FXML
 private Button tea;
 @FXML
 private Button icecapp;
 @FXML
 private Button icecoffee;
 @FXML
 private Button lemonade;
 @FXML
 private Button smoothie;
 
 
 
 @FXML
 public void Back(ActionEvent event)
 {
     TimHortonsRegisterJavaFinalProject.LaunchRegister();
 
     
 }
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
