package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.stage.Window;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
@FXML
    public Button start;
    public Button About;
    @FXML
private Main main;
@Override
    public void initialize(URL location, ResourceBundle resources){

}
@FXML
 public void setStart(){
    start.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            try {
                Main.showChoose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });

}
@FXML
public void setAbout(ActionEvent event){
    About.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Dialog dialog = new Dialog();
            dialog.setContentText("Hello this is Connect");
            Window window = dialog.getDialogPane().getScene().getWindow();
            window.setOnCloseRequest(e->window.hide());
            dialog.showAndWait();
        }
    });
}
@FXML
    public void onClick(ActionEvent event) {
    System.out.println("Hello FX");
    }
}
