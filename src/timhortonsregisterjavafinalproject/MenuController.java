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
import javafx.scene.control.ComboBox;
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
     private Button cancel;
     @FXML
     private Button total;
     
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
     @FXML
     private ComboBox<String> payment;
     
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
     private void Total(ActionEvent event)
     {
         double total = 0;
         for(int i=0; i<cost.size();i++)
         {
             total = cost.get(i)+total;
         }
         screen.appendText("------------------------------------------------------\n");
         screen.appendText("\t\t\t\t\t\t\tTotal: $"+total);
     }
     
     @FXML
     private void French(ActionEvent event)
     {
         double cost =1.30;
         String name = "French Vanilla";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void Capp (ActionEvent event)
     {
         double cost =1.60;
         String name = "Cappauccino";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void Latte(ActionEvent event)
     {
         double cost =1.45;
         String name = "Latte";
         screen.appendText(name+"\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void HotChocolate(ActionEvent event)
     {
         double cost =1.50;
         String name = "Hot Chocolate";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void Original(ActionEvent event)
     {
         double cost =1.00;
         String name = "Orignal Blend";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void DarkRoast(ActionEvent event)
     {
         double cost =1.10;
         String name = "Dark Roast";
         screen.appendText(name+"\t\t\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void Decaf(ActionEvent event)
     {
         double cost =1.15;
         String name = "Decaf";
         screen.appendText(name+"\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void Tea(ActionEvent event)
     {
         double cost =1.70;
         String name = "Tea";
         screen.appendText(name+"\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void IcedCapp(ActionEvent event)
     {
         double cost =2.10;
         String name = "Iced Capp";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void IcedCoffee(ActionEvent event)
     {
         double cost =1.90;
         String name = "Iced Coffee";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     
     @FXML
     private void Lemonade(ActionEvent event)
     {
         double cost =2.45;
         String name = "Frozen Lemonade";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void Smoothie(ActionEvent event)
     {
         double cost =2.45;
         String name = "Fruit Smoothie";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
        
         
     }
     
      @FXML
   public void Cancel(ActionEvent event)
   {
           screen.clear();
       
   }
  
 
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        screen.setText("Item \t\t\t\t\t\t\t Cost\n");
        screen.appendText("________________________________________________________\n");
        screen.setEditable(false);
        
    }    
    
}
