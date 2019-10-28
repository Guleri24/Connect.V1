package sample;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
private Parent root;

    public JFXButton Continue;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
setButton();
    }
    public void setButton()  {
        Continue.setOnAction(e->{
            System.out.println("hello new Controller");
     ChooseController controller = new ChooseController();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Choose.fxml"));
            loader.setController(controller);
            try {
                loader.load();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
}
