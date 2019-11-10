package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.net.URL;
import java.security.KeyStore;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    // Choose.fxml
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

    //view.fxml
    public MenuItem View_Comedy;
    public MenuItem View_Rags_Rags;
    public MenuItem View_Quest;
    public MenuItem View_Voyage_Return;
    public MenuItem View_Tragedy;
    public MenuItem View_Blue;
    public MenuItem View_Overcoming_monster;
    public MenuItem View_Rebirth;
    @FXML
    WebView view;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    public void setStart() {
        start.setOnAction(event -> {
            try {
                Main.showChoose();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }


    @FXML
    public void setAbout(ActionEvent event) {
        About.setOnAction(event1 -> {
            Dialog dialog = new Dialog();
            dialog.setContentText("Hello this is Connect");
            Window window = dialog.getDialogPane().getScene().getWindow();
            window.setOnCloseRequest(e -> window.hide());
            dialog.showAndWait();
        });
    }

    @FXML
    public void setChoose() {
        Overcoming_the_monster.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
          } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Comedy.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Rags_to_Riches.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        The_Quest.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Voyage_and_Return.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Tragedy.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        Blue.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public void setMenu() {
        View_Overcoming_monster.setOnAction(event -> {
            try {
                String url = "https://www.youtube.com";
                Main.View();
                System.out.println("hello Overcoming");
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

        View_Comedy.setOnAction(event -> {
            try {
                String url = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                Main.View();
                System.out.println("hello Comedy");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        View_Rebirth.setOnAction(event -> {
            try {
                String url = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                Main.View();
                System.out.println("hello Comedy");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        View_Rags_Rags.setOnAction(event -> {
            try {
                String url = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                Main.View();
                System.out.println("hello Rags");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        View_Quest.setOnAction(event -> {
            try {
                String url = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                Main.View();
                System.out.println("hello Quest");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        View_Voyage_Return.setOnAction(event -> {
            try {
                String url = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                Main.View();
                System.out.println("hello Voyage");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        View_Tragedy.setOnAction(event -> {
            try {
                String url = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                Main.View();
                System.out.println("hello Tragedy");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        View_Blue.setOnAction(event -> {
            try {
                String url = "<html><h1>Hello</h1><h2>Hello</h2></html>";
                Main.View();
                System.out.println("hello Blue");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }
}
