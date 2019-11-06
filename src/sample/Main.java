package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class Main extends Application {
private static Stage primaryStage;
private static AnchorPane mainLayout;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage = primaryStage;
        showMain();
    }

private static void showMain() throws Exception{
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(Main.class.getResource("Main.fxml"));
    mainLayout=loader.load();
    Scene scene = new Scene(mainLayout,600,400);
    primaryStage.setScene(scene);;
    primaryStage.setResizable(false);
    primaryStage.show();
}
public static void showChoose() throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("Choose.fxml"));
        mainLayout=loader.load();
        Scene scene = new Scene(mainLayout,600,400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
}
public static void View(WebView view) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("view.fxml"));
    BorderPane viewLayout = loader.<BorderPane>load();
         Scene scene = new Scene(viewLayout,600,400);
         primaryStage.setScene(scene);
         primaryStage.setResizable(true);
         primaryStage.show();
}
}