package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

public class Main extends Application {

    @FXML
    Button start;
    @Override
    public void start(Stage primaryStage) throws Exception{
       FXMLLoader firstLoader = new FXMLLoader(getClass().getResource("Choose.fxml"));
       Parent firstPane = firstLoader.load();
       Scene firstScene = new Scene(firstPane,600,400);

       FXMLLoader secondLoader = new FXMLLoader(getClass().getResource("Choose.fxml"));
       Parent secondPane  = secondLoader.load();
       Scene secondScene = new Scene(secondPane,600,400);

       Controller controller = (Controller)firstLoader.getController();
       controller.setSecondScene(secondScene);

       primaryStage.setTitle("Connect");
       primaryStage.setScene(firstScene);
       primaryStage.show();


    }
    public void onCLick(ActionEvent event){
        start.setOnAction(e->{
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}
