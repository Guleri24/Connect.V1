package sample;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
private Parent root;

    public JFXButton Continue;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
setButton();
    }
    public void setButton(){
        Continue.setOnAction(e->{

        });
    }
}
