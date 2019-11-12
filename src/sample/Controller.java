package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Dialog;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.Window;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Button start;
    public Button About;
    public Button Overcoming_the_monster;
    public Button Rags_to_Riches;
    public Button Comedy;
    public Button The_Quest;
    public Button Voyage_and_Return;
    public Button Tragedy;
    public Button Rebirth;
    public Button Blue;
    public WebView view;
    public Button Start;


    public void setStart(ActionEvent event) {
      start.setOnAction(e->{
          try {
              Main.Choose();
          } catch (IOException ex) {
              ex.printStackTrace();
          }
      });
    }

    public void setChoose(ActionEvent event) throws IOException {

        Start.setOnAction(e->{
            try {
                Main.View();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        });
    }

    public void setAbout(ActionEvent event) {
        About.setOnAction(e->{
            Dialog dialog = new Dialog();
            dialog.isResizable();
            dialog.setContentText("Connect: connecting people by stories. \n " +
                    "In this desktop application users can share and read stories of various type: \n" +
                    " includes: Quest, Tragedy, Romance, Blue and many more. \n\n\n");
            Window window = dialog.getDialogPane().getScene().getWindow();
            window.setOnCloseRequest(w -> window.hide());
            dialog.showAndWait();
        });
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
