package sample;

import javafx.application.Application;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.event.ActionEvent;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Connect");
      /*  WebView webView = new WebView();
        WebEngine engine = webView.getEngine();
        Button button = new Button("load");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                engine.load("https://www.google.com");
            }
        });

        Button button1 = new Button("Execute javaScript");
        button1.setOnAction(event -> {
            engine.executeScript("window.location= \"https://www.youtube.com/\";");
        });

        Button button2 = new Button("Load Local");
        button2.setOnAction(event -> {
            engine.loadContent("<html><body><p>hello negi </p><h2>hello</h2></body></html>");
        });

        Button button3 = new Button("Reload");
        button3.setOnAction(e->{
        engine.getHistory();
        engine.reload();
        });
        VBox root = new VBox();
        root.getChildren().addAll(button,button1,button2,button3,webView);

        //Parent root = FXMLLoader.load(getClass().getResource("Connect.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);*/
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
