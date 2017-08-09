/*
Simarpreet Kaur, Quardin Lyttle
Object Oriented Program 2 Java- PROG 24178 - P11 12248 / 106
Computer Engineering Tech
Sheridan College
 */
package timhortonsregisterjavafinalproject;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

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
     private Button purchase;
     /////////////////////////////////
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
     
     ///////////////////////////////////////
     @FXML
     private Button cookies;
     @FXML
     private Button donuts;
     @FXML
     private Button muffins;
     @FXML
     private Button timbits;
     
     ///////////////////////////////////////
     
     @FXML
     private Button bagelbelt;
     @FXML
     private Button hashbrown;
     @FXML
     private Button snacks;
     @FXML
     private Button oatmeal;
     @FXML
     private Button wrap;
     @FXML
     private Button sandwich;
     
     //////////////////////////////////////
     @FXML
     private TextArea screen;
     @FXML
     private ComboBox<String> payment;
     @FXML
     private Label lbl1;
     @FXML
     private Label lbl2;
     @FXML
     private TextField txt1;
     @FXML
     private TextField txt2;
     
     ArrayList<String> order = new ArrayList<>();
     ArrayList<Double> cost = new ArrayList<>();
     ArrayList<String> methodpay = new ArrayList<>();
     ObservableList<String> payments= FXCollections.observableArrayList(methodpay);
     
    private Double fTotal = 0.0;
    File data = new File("src/Tim Card Data/timCardData.txt");
     

     
 
 
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
         screen.appendText("\t\t\t\t\t\t\tTotal: $"+total+"\n\n");
         fTotal = total;
     }
   
     ///////////////////////////////////////////////////////
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
         screen.appendText(name+"\t\t\t\t\t\t\t\t$"+cost+"\n");
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
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
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
         screen.appendText(name+"\t\t\t\t\t\t\t\t$"+cost+"\n");
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
         screen.appendText(name+"\t\t\t\t\t$"+cost+"\n");
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
     ///////////////////////////////////////////////////////
     @FXML
     private void Cookies(ActionEvent event)
     {
         double cost =1.00;
         String name = "Cookie";
         screen.appendText(name+"\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }

     @FXML
     private void Donuts(ActionEvent event)
     {
         double cost =0.60;
         String name = "Donut";
         screen.appendText(name+"\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }

     @FXML
     private void Muffins(ActionEvent event)
     {
         double cost =0.90;
         String name = "Muffin";
         screen.appendText(name+"\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }

   
     @FXML
     private void Timbits(ActionEvent event)
     {
         double cost =0.50;
         String name = "Timbits";
         screen.appendText(name+"\t\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     /////////////////////////////////////////////////////////
     @FXML
     private void Bagelbelt(ActionEvent event)
     {
         double cost =2.30;
         String name = "Begal Belt";
         screen.appendText(name+"\t\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }
     
     @FXML
     private void Hashbrown(ActionEvent event)
     {
         double cost =2.50;
         String name = "Homestyle Hash Brown";
         screen.appendText(name+"\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }

     @FXML
     private void Snacks(ActionEvent event)
     {
         double cost =1.50;
         String name = "Breakfast Snacks";
         screen.appendText(name+"\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }

     
     @FXML
     private void Oatmeal(ActionEvent event)
     {
         double cost =2.00;
         String name = "Homestyle Oatmeal";
         screen.appendText(name+"\t\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }

     
     @FXML
     private void Wrap(ActionEvent event)
     {
         double cost =3.00;
         String name = "Grilled Sausage Wrap";
         screen.appendText(name+"\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }


     @FXML
     private void Sandwich(ActionEvent event)
     {
         double cost =2.70;
         String name = "Hot Breakfast Sandwich";
         screen.appendText(name+"\t\t\t\t$"+cost+"\n");
         OrderList(name,cost);
         
     }

     
    ///////////////////////////////////////////////////////// 
   @FXML
   public void Cancel(ActionEvent event)
   {
        screen.clear();
        screen.setText("Item \t\t\t\t\t\t\t Cost\n");
        screen.appendText("________________________________________________________\n");
        order.removeAll(order);
        cost.removeAll(cost);
        txt1.clear();
        txt2.clear();
       
   }
   
   @FXML
   public void Pay(ActionEvent event)
   {
       if(payment.getValue().toString()=="Cash")
       {
           lbl1.setText("Cash Amount");
           lbl2.setText("");
           txt1.setDisable(false);
           txt2.setDisable(true);
       }
       else if(payment.getValue().toString()=="Tim Card")
       {
           lbl1.setText("Email address:");
           lbl2.setText("First Name:");
           txt1.setDisable(false);
           txt2.setDisable(false);
       }
       else if(payment.getValue().toString()=="Credit Card")
       {
           lbl1.setText("Credit Card Number:");
           lbl2.setText("Name on Credit Card:");
           txt1.setDisable(false);
           txt2.setDisable(false);
       }
       else if(payment.getValue().toString()=="Debit Card")
       {
           lbl1.setText("Debit Card Number:");
           lbl2.setText("Name on Credit Card:");
           txt1.setDisable(false);
           txt2.setDisable(false);
       }
   }
   
   @FXML
   private void Purchase(ActionEvent event)
   {
       if(txt1.getText()!=null&&fTotal>0)
       {
         if(payment.getValue().toString()=="Cash")
            {
                Double cash = Double.parseDouble(txt1.getText());
                if((cash-fTotal)>=0&&fTotal>0)
                    {
                    screen.appendText("\nCash: $"+cash);
                    screen.appendText("\nChange: $"+(cash-fTotal));
                    }
                else
                    {
                    Alert a = new Alert(Alert.AlertType.ERROR);//prompt user if no a field isnt input
                    a.setTitle("Alert");
                    a.setHeaderText("Alert");
                    a.setContentText("NOT ENOUGH FUNDS TO COMPLETE TRANSACTION");
                    a.showAndWait().ifPresent(response ->
                    {
                        if(response==ButtonType.OK)
                          a.close();
                    });
                    }
               
           }
       
           else if(payment.getValue().toString()=="Credit Card"&&txt2.getText()!=null)
               {
                   screen.appendText("\n Transaction Complete");
                   screen.appendText("\n$"+fTotal+"was charged to your card.");
                   screen.appendText("\nCard Number:"+txt1.getText());
                   screen.appendText("\nName on Card:"+txt2.getText());
               }

           else if(payment.getValue().toString()=="Debit Card"&&txt2.getText()!=null)
               {
                   screen.appendText("\n Transaction Complete");
                   screen.appendText("\n$"+fTotal+"was charged to your card.");
                   screen.appendText("\nCard Number:"+txt1.getText());
                   screen.appendText("\nName on Card:"+txt2.getText());
               }
           else if(payment.getValue().toString()=="Tim Card"&&txt2.getText()!=null)
            {

                String email = txt1.getText();
                Scanner scan;

                try
                    {
                        int i =1;
                        scan=new Scanner(data);
                        scan.useDelimiter(System.getProperty("line.separator"));
                        while(scan.hasNext())
                        {
                            Scanner sc=new Scanner(scan.next());
                            sc.useDelimiter(",");
                            if(sc.next().equalsIgnoreCase(email))
                            {

                                String fname = sc.next();       
                                String lname = sc.next();
                                double inibal = sc.nextDouble();

                                if(inibal>=fTotal)
                                {
                                    inibal=inibal-fTotal;
                                    screen.appendText("\nPayment successful. Your new balance is: $"+inibal);
                                    screen.appendText("\nName: "+fname+" "+lname+"\nEmail: "+email+"\n");
                                    i=0;

                                }
                                else if(fTotal>inibal)
                                {
                                    screen.appendText("Insuffucient funds on Tim Card\n");
                                    i=2;
                                }
                            }
                        }
                        if(i==1)
                        {
                            screen.appendText("Please Register a Tim Card if you wish to use these services.\n");
                        }
                        else if(i==2)
                        {
                            screen.appendText("Please Reload Card.\n");
                        }
                        scan.close();

                    }
                catch(Exception e)
                    {
                        Alert a = new Alert(Alert.AlertType.ERROR);
                        a.setTitle("Alert");
                        a.setHeaderText("Alert");
                        a.setContentText("ERROR: DATA NOT FOUND");
                        a.showAndWait().ifPresent(response ->
                            {
                                if(response==ButtonType.OK)
                                a.close();

                            });
                    }
            }
         else
           {
               screen.appendText("PLEASE ENTER SECOND VALUE\n");
           }
       }
       else
       {
           screen.appendText("PLEASE ENTER VALUES\n");
           screen.appendText("PLEASE TOTAL BEFORE PURCHASE\n");
       }
       
   }  
   
  
 
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        screen.setText("Item \t\t\t\t\t\t\t Cost\n");
        screen.appendText("________________________________________________________\n");
        screen.setEditable(false);
        
        methodpay.add("Cash");
        methodpay.add("Credit Card");
        methodpay.add("Tim Card");
        methodpay.add("Debit Card");
        
        ObservableList<String> payments= FXCollections.observableArrayList(methodpay);
        payment.setItems(payments);
        
        lbl1.setText("");
       lbl2.setText("");
       txt1.setDisable(true);
       txt2.setDisable(true);
    }    
    
}
