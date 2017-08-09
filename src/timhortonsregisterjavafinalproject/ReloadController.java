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
 *
 * @author Simarpreet Kaur, Quardin Lyttle
 */
public class ReloadController implements Initializable
{

    @FXML 
    private Button Buy;
    @FXML
    private Button Back;
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
    private TextArea screen;
   @FXML 
    private TextField txtemail;
   @FXML 
    private TextField txtinibal;
   
   File data = new File("src/Tim Card Data/timCardData.txt");

   
   @FXML
   public void Cancel(ActionEvent event)
   {
       TimHortonsRegisterJavaFinalProject.reloadStage.close();
       txtemail.clear();
       txtinibal.clear();
       
   }

   @FXML
   public void Reload(ActionEvent event)
   {
       
       double reload = Double.parseDouble(txtinibal.getText());
        String email = txtemail.getText();
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
                        reload = reload+inibal;
                        screen.setText("Reload Successful.\nNew Amount= $"+reload);
                    }
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
   @FXML
   public void Back(ActionEvent event)
   {
       TimHortonsRegisterJavaFinalProject.LaunchTimCard();
   }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
       Buy.setText("Reload");
       balance.setText("RELOAD AMOUNT");
    }    
    
}
