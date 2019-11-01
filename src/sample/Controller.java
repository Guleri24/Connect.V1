package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    private Scene secondScene;

    public void setSecondScene(Scene scene) {
        secondScene = scene;
    }

    public void openSecondScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        primaryStage.setScene(secondScene);
    }

    @FXML
    Button Overcoming_the_monster, Rags_to_Riches, The_Quest, Voyage_and_Return, Comedy, Tragedy, Rebirth, Blue;

    public void onClick(ActionEvent event) throws IOException {
        Overcoming_the_monster.setOnAction(e -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view.fxml"));
            Parent pane;
            try {
             pane = loader.load();
                Scene scene = new Scene(pane,1000,500);
                setSecondScene(scene);
            } catch (IOException ex) {
                ex.printStackTrace();
            }


        });
        Rags_to_Riches.setOnAction(e -> {
            System.out.println("rags");
        });
        Rebirth.setOnAction(e -> {
            System.out.println("Rebirth");
        });
        Comedy.setOnAction(e -> {
            System.out.println("comedy");
        });
        Blue.setOnAction(e -> {
            System.out.println("blue");
        });
        The_Quest.setOnAction(e -> {
            System.out.println("qiest");
        });


    }

}

