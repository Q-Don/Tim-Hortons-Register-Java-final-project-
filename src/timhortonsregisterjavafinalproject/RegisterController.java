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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 *
 * @author Simarpreet Kaur, Quardin Lyttle
 */
public class RegisterController implements Initializable
{
    
    @FXML
    private Label label;
    @FXML
    private TextArea tarea;//testing more stuff.
    @FXML
    private Label lBL;//Testing this thing here.
    
    @FXML
    private Label lBL123;//Testing this thing here.
    
    @FXML
    private Label lbl456;//Testing this thing here.
   
     @FXML
    private Label lbltim;//Testing this thing here.
   
   
    @FXML
    private void Display(ActionEvent event)
    {
        tarea.appendText("Test");//More testing
        label.setText("Hello World");//Do you get?
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       
    }    
    
}
