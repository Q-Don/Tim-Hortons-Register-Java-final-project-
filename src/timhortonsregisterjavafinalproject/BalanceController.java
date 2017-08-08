/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timhortonsregisterjavafinalproject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Owner
 */
public class BalanceController implements Initializable 
{
    @FXML 
    private TextField txtsearch;
    @FXML 
    private TextArea tarea;
    @FXML 
    private Button Search;
    @FXML
    private Button back;
    @FXML 
    private Label Searchemail;
    
  File data = new File("src/Tim Card Data/timCardData.txt");
    
     @FXML
    private void Display(ActionEvent event)
    {
       if(txtsearch.getText()!=null)
       {
        String email = txtsearch.getText();
       Scanner scan;
       
       try
       {
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
                   
                   tarea.appendText("\n Your Email:"+email+"\n Name: "+fname+ " "+ lname+"\n Your Balance: "+inibal);
               }
           }
           scan.close();
           
       }
       catch(Exception e)
       {
           tarea.setText("Error: Data Not Found");
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
           Alert a = new Alert(Alert.AlertType.ERROR);
           a.setTitle("Alert");
           a.setHeaderText("Alert");
           a.setContentText("Please enter email address.");
           a.showAndWait().ifPresent(response ->
           {
               if(response==ButtonType.OK)
                   a.close();
           });
       }
    }
    
    @FXML
    public void Back(ActionEvent event)
    {
        TimHortonsRegisterJavaFinalProject.balanceStage.hide();
    }
  
@FXML
    public void CLEAR(ActionEvent event)
    {
    tarea.clear();
    txtsearch.clear();
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        tarea.setEditable(false);
    }    
    
}
