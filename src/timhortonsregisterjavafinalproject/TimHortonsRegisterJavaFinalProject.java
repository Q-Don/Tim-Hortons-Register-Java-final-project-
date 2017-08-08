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
    static Stage registerStage = new Stage();
    static Stage timCardStage = new Stage();
    static Stage menuStage = new Stage();
    static Stage newCardStage = new Stage();
    @Override
    public void start(Stage stage) throws Exception
    {
        Parent registerRoot = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Parent timCardRoot= FXMLLoader.load(getClass().getResource("TimCard.fxml"));
        Parent menuRoot = FXMLLoader.load(getClass().getResource("Menu.fxml"));
        Parent newCardRoot = FXMLLoader.load(getClass().getResource("NewCard.fxml"));
        
        Scene scene1 = new Scene(registerRoot);
        Scene scene2 = new Scene(timCardRoot);
        Scene scene3 = new Scene (menuRoot);
        Scene scene4 = new Scene(newCardRoot);
        
        registerStage.setScene(scene1);
        registerStage.show();
        registerStage.setTitle("Tim Hortons");
        timCardStage.setScene(scene2);
        timCardStage.setTitle("Tim Card");
        menuStage.setScene(scene3);
        menuStage.setTitle("Menu");
        newCardStage.setScene(scene4);
        newCardStage.setTitle("Buy New Card");
    }
    
    public static void LaunchTimCard()
    {
        timCardStage.show();
        registerStage.hide();
        menuStage.hide();
    }
    
    public static void LaunchRegister()
    {
        registerStage.show();
        timCardStage.hide();
        menuStage.hide();
    }
    
    public static void LaunchMenu()
    {
        menuStage.show();
        registerStage.hide();
        timCardStage.hide();
    }
            
            
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
