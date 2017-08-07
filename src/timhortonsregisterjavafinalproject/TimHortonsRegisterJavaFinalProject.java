/*
Simarpreet Kaur, Quardin Lyttle
Object Oriented Program 2 Java- PROG 24178 - P11 12248 / 106
Computer Engineering Tech
Sheridan College
 */
package timhortonsregisterjavafinalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Simarpreet Kaur, Quardin Lyttle
 */
public class TimHortonsRegisterJavaFinalProject extends Application
{
    static Stage stage1=new Stage();
    static Stage stage2=new Stage();
    static Stage stage3=new Stage();
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent registerRoot = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Parent timCardRoot= FXMLLoader.load(getClass().getResource("TimCard.fxml"));
        Parent menuRoot = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        
        Scene scene1 = new Scene(registerRoot);
        Scene scene2 = new Scene(timCardRoot);
        Scene scene3 = new Scene (menuRoot);
        
        stage1.setScene(scene1);
        stage1.show();
        stage1.setTitle("Tim Hortons");
        stage2.setScene(scene2);
        stage2.setTitle("Tim Card");
        stage3.setScene(scene3);
        stage3.setTitle("Menu");
    }
    
    public static void LaunchTimCard()
    {
        stage2.show();
        stage1.hide();
        stage3.hide();
    }
    
    public static void LaunchRegister()
    {
        stage1.show();
        stage2.hide();
        stage3.hide();
    }
    
    public static void LaunchMenu()
    {
        stage3.show();
        stage1.hide();
        stage2.hide();
    }
            
            
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
