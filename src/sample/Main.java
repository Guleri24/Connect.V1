package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;

        MainFxml();
    }

    private static void MainFxml() throws Exception {
        AnchorPane MainLayout = FXMLLoader.load(Main.class.getResource("Main.fxml"));
        Scene scene = new Scene(MainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static void Choose() throws IOException {
        AnchorPane ChooseLayout = FXMLLoader.load(Main.class.getResource("Choose.fxml"));
        Scene scene = new Scene(ChooseLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static void View() throws IOException {
        WebView view = new WebView();
        WebEngine engine = view.getEngine();
        engine.loadContent("<html> \n" +
                "<style type=\"text/css\"> \n" +
                "\n" +
                "                body\n" +
                "                { background-color:  #ffd5d5;\n" +
                "                } \n" +
                "                h1{\n" +
                "                     text-align: center;\n" +
                "                     font-size: 50px;\n" +
                "                     color: #45454d;\n" +
                "                }\n" +
                "                h2{\n" +
                "                    text-align: center;\n" +
                "                    color: #45454d;\n" +
                "                }\n" +
                "                </style>\n" +
                "                <h1> Welcome to Connect </h1>\n" +
                "                <h2> Connecting people with stories.</h2>\n" +
                "                <body>\n" +
                "                    \n" +
                "            \n" +
                "                </body> </html>");
        BackgroundFill background_fill = new BackgroundFill(Color.PINK,
                CornerRadii.EMPTY, Insets.EMPTY);
        // create Background
        Background background = new Background(background_fill);

        BorderPane borderPane = new BorderPane();

        // Top
        HBox hBox = new HBox();
        hBox.setPrefSize(868.0, 42.0);
        MenuButton Stories = new MenuButton("Stories");
        MenuItem View_Overcoming_monster = new MenuItem("Overcoming the monster");
        View_Overcoming_monster.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/1zAMIuF0MnICBnCspylcadCmIFcQ7vEWR?usp=sharing");
        });
        MenuItem View_Comedy = new MenuItem("Comedy");
        View_Comedy.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/1xdJ50rXCaDT4ldmbfMV2UnVAoZGd2jDZ?usp=sharing");
        });
        MenuItem View_Rags_Rags = new MenuItem("Rags to Riches");
        View_Rags_Rags.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/11qR1z6Y7IBDlBaCE9fR8BTKDpwZlDt9l?usp=sharing");
        });
        MenuItem View_Quest = new MenuItem("The Quest");
        View_Quest.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/17ldeRUfEti2aDKeGzOvy4TrNionP7mWn?usp=sharing");
        });
        MenuItem View_Voyage_Return = new MenuItem("Voyage and Return");
        View_Voyage_Return.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/1XcGCsiZMT0wMVkhujQRx2TVU6lZd18vk?usp=sharing");
        });
        MenuItem View_Rebirth = new MenuItem("Rebirth");
        View_Rebirth.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/14Gt-C4mJeP3h2CGNJKIYfAkF-ttoNxo1?usp=sharing");
        });
        MenuItem View_Tragedy = new MenuItem("Tragedy");
        View_Tragedy.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/1nut8tJt5qqCLOcoZb3s6FTGlufFshG5r?usp=sharing");
        });
        MenuItem View_Blue = new MenuItem("Blue");
        View_Blue.setOnAction(e->{
            engine.load("https://drive.google.com/drive/folders/18baEyCpKqoNmvzMzDgvnbXxUBXIxlpkf?usp=sharing");
        });
        Stories.getItems().addAll(View_Overcoming_monster, View_Comedy, View_Rags_Rags, View_Quest, View_Voyage_Return, View_Rebirth, View_Tragedy, View_Blue);
        Stories.setPrefSize(116.0, 40.0);
        HBox.setMargin(Stories, new Insets(20, 20, 20, 20));
        ObservableList<javafx.scene.Node> list = hBox.getChildren();
        list.addAll(Stories);
        hBox.setBackground(background);



        borderPane.setTop(hBox);
        // Centre
        borderPane.setCenter(view);

        // Bottom
        AnchorPane pane = new AnchorPane();
        pane.setPrefSize(868.0, 17.0);
        pane.setBackground(background);
        borderPane.setBottom(pane);


        Scene scene = new Scene(borderPane, 868.0, 529.0);
        primaryStage.setScene(scene);
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
