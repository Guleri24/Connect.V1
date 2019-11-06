package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.web.WebView;
import javafx.stage.Window;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Button start;
    public Button About;
    public Button Overcoming_the_monster;
    public Button Comedy;
    public Button Rags_to_Riches;
    public Button The_Quest;
    public Button Voyage_and_Return;
    public Button Tragedy;
    public Button Rebirth;
    public Button Blue;
    @FXML
    public WebView view;
    private Main main;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void setStart() {
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
    public void setAbout(ActionEvent event) {
        About.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Dialog dialog = new Dialog();
                dialog.setContentText("Hello this is Connect");
                Window window = dialog.getDialogPane().getScene().getWindow();
                window.setOnCloseRequest(e -> window.hide());
                dialog.showAndWait();
            }
        });
    }

    @FXML
    public void setOvercoming_the_monster() {
        Overcoming_the_monster.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    view.getEngine().load("http://www.java2s.com/Code/Java/JavaFX/Menuitemeventhandler.htm");
                    Main.View(view);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    @FXML
    public void setComedy() {

    }

    @FXML
    public void setRags_to_Riches() {

    }

    @FXML
    public void setThe_Quest() {

    }

    @FXML
    public void setVoyage_and_Return() {

    }

    @FXML
    public void setTragedy() {

    }

    @FXML
    public void setRebirth() {

    }

    @FXML
    public void setBlue() {

    }
}
