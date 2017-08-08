/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3quardinlyttle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
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
 * @author peel
 */
public class Assignment3FXMLDocumentController implements Initializable
{
    
    @FXML
    private TextField course;
    @FXML
    private TextField quiz;
    @FXML
    private TextField assgn;
    @FXML
    private TextField finals;
    @FXML
    private TextArea info;
    @FXML
    private ComboBox<String> listing;
    @FXML
    private Button clear;
    @FXML
    private Button submit;

    
    File data = new File("Files/data.txt");//File to contain required data
    ArrayList<String> courselist = new ArrayList<>(); //Create list of courses
    ObservableList<String> items= FXCollections.observableArrayList(courselist);


    
    @FXML
    private void Submit (ActionEvent event)
    {
        PrintWriter output;
        if(course.getText().equals("")||finals.getText().equals("")||quiz.getText().equals("")||assgn.getText().equals(""))
        {
           try
           {
               Alert a = new Alert(Alert.AlertType.ERROR);//prompt user if no a field isnt input
               a.setTitle("Alert");
               a.setHeaderText("Alert");
               a.setContentText("Please enter information for ALL text fields.");
               a.showAndWait().ifPresent(response ->
               {
                  if(response==ButtonType.OK)
                      a.close();
               });
           }
           catch(Exception a)
           {
               
           }
        }
        else
        {
            String courseCode = course.getText();
            double assign = Double.parseDouble(assgn.getText());
            double finalsgrade= Double.parseDouble(finals.getText());
            double quizgrade = Double.parseDouble(quiz.getText());
            //            listing.getItems().addAll(courseCode);
            if(courselist.size()==0)
            {
                courselist.add(courseCode);
                ObservableList<String> items= FXCollections.observableArrayList(courselist);
                listing.setItems(items);
                
                  
            }
            else
            {
                for(int i = 0; i<courselist.size();i++)
                {
                    if(courseCode.equalsIgnoreCase(courselist.get(i)))
                    {
                        break;
                    }
                    else if(i==(courselist.size()-1))
                    {
                        courselist.add(courseCode);
                        ObservableList<String> items= FXCollections.observableArrayList(courselist);
                        listing.setItems(items);
                        
                       
                    }
                }
            }
                
            

            try
            {
                output = new PrintWriter(new BufferedWriter(new FileWriter(data, true)));
                output.println(courseCode+","+assign+","+quizgrade+","+finalsgrade);
                output.close();
                quiz.clear();
                assgn.clear();
                course.clear();
                finals.clear();


            }
            catch(Exception e)
            {
               info.setText("Error: Data Not Found");
               Alert a = new Alert(Alert.AlertType.ERROR);
               a.setTitle("Alert");
               a.setHeaderText("Alert");
               a.setContentText("ERROR: DATA NOT FOUND");
               a.showAndWait().ifPresent(response ->
               {
                   if(response==ButtonType.OK)
                       a.close();

               }
               );

            }
            
        }        
        
    }
    
    @FXML
    private void Display(ActionEvent event)
    {
       if(listing.getValue()!=null)
       {
        String currentcourse = listing.getValue().toString();
       Scanner scan;
       
       try
       {
           scan=new Scanner(data);
           scan.useDelimiter(System.getProperty("line.separator"));
           while(scan.hasNext())
           {
               Scanner sc=new Scanner(scan.next());
               sc.useDelimiter(",");
               if(sc.next().equals(currentcourse))
               {
                   double assign = sc.nextDouble();
                   double quiz = sc.nextDouble();
                   double finalgrade = sc.nextDouble();
                   double total = assign+quiz+finalgrade;
                   
                   info.appendText("\n"+currentcourse+":\n Assignment Grade: "+assign+"\t Quiz Grade: "+quiz+"\t Finals grade: "+finalgrade+"\t Total: "+total);
               }
           }
           scan.close();
           
       }
       catch(Exception e)
       {
           info.setText("Error: Data Not Found");
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
    }
    
    @FXML
    private void Clear(ActionEvent event)
    {
        quiz.clear();
        assgn.clear();
        course.clear();
        finals.clear();
        info.clear();

        
    }
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
       info.setEditable(false);
    }
 
}
