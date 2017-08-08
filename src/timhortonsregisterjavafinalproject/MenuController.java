/*
Simarpreet Kaur, Quardin Lyttle
Object Oriented Program 2 Java- PROG 24178 - P11 12248 / 106
Computer Engineering Tech
Sheridan College
 */
package timhortonsregisterjavafinalproject;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

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
     private TextArea screen;
     
     ArrayList<String> order = new ArrayList<>();
     ArrayList<Double> cost = new ArrayList<>();
 
 
    public void OrderList(String name,Double price)
     {
         order.add(name);
         cost.add(price);
     }
    
     @FXML
     public void Back(ActionEvent event)
     {
         TimHortonsRegisterJavaFinalProject.LaunchRegister();


     }
     @FXML
     private void French(ActionEvent event)
     {
         double cost =1.30;
         String name = "French Vanilla";
         screen.appendText(name+"\t\t\t"+cost);
         OrderList(name,cost);
         
     }
     
     
 
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
