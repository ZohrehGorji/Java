package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import java.awt.*;
import java.security.PrivateKey;
import java.sql.Timestamp;
import java.time.LocalDate;

public class Main extends Application {



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

      //  Parent root = FXMLLoader.load(Main.class.getResource("sample.fxml"));

        primaryStage.setTitle("Planner");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.centerOnScreen();
        Controller controller=new Controller();

        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("sample.fxml"));
        fxmlLoader.setControllerFactory(param -> param.isInstance(controller)?controller:null);
        primaryStage.setScene(new Scene(fxmlLoader.load()));

        primaryStage.show();
        primaryStage.toFront();
    }
}
