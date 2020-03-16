package Connect.V1;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        MainFxml();
    }

    @FXML
    private static void MainFxml() throws Exception {
        BorderPane MainLayout = FXMLLoader.load(Main.class.getResource("Main.fxml"));
        Scene scene = new Scene(MainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    static void Choose() throws IOException {
        BorderPane ChooseLayout = FXMLLoader.load(Main.class.getResource("Choose.fxml"));
        Scene scene = new Scene(ChooseLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @FXML
    static void View() throws Exception{
        BorderPane ViewLayout = FXMLLoader.load(Main.class.getResource("View.fxml"));
        Scene scene = new Scene(ViewLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
