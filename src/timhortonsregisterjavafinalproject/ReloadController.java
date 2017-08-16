/*
Simarpreet Kaur, Quardin Lyttle
Object Oriented Program 2 Java- PROG 24178 - P11 12248 / 106
Computer Engineering Tech
Sheridan College
 */
package timhortonsregisterjavafinalproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
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
        ArrayList<String> info = new ArrayList<>();
        String line = null;
        String fname;      
        String lname;
        double inibal = 0;     

        

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

                        fname = sc.next();       
                        lname = sc.next();
                        inibal = sc.nextDouble();     
                        reload = reload+inibal;
                        
                        screen.setText("Reload Successful.\nNew Amount= $"+reload);
                    }
                }

                scan.close();
                
                FileReader fr = new FileReader(data);
                BufferedReader br = new BufferedReader(fr);
                while((line = br.readLine()) != null)
                {
                    if(line.contains(email))
                    {
                        line = line.replace(String.valueOf(inibal),String.valueOf(reload));
                    }
                    info.add(line);
                }
                fr.close();
                br.close();
                
                FileWriter fw = new FileWriter(data);
                BufferedWriter out = new BufferedWriter(fw);
                for(String s : info)
                {
                    out.write(s);
                    out.write("\n");
                }
                out.flush();
                out.close();
                
                

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
