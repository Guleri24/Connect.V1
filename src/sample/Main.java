package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Connect");
        Parent root = FXMLLoader.load(getClass().getResource("Connect.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
/*primaryStage.setTitle("Registration Form JavaFX Application");
GridPane gridPane = createRegistrationFormPane();
addUIControls(gridPane);
        Scene scene = new Scene(gridPane,800,500);
        primaryStage.setScene(scene);
primaryStage.show();

    }
private GridPane createRegistrationFormPane(){
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(40,40,40,40));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

    ColumnConstraints columnConstraints = new ColumnConstraints(100,100,Double.MAX_VALUE);
    columnConstraints.setHalignment(HPos.CENTER);
    ColumnConstraints columnConstraints1 = new ColumnConstraints(100,100,Double.MAX_VALUE);
    columnConstraints1.setHgrow(Priority.ALWAYS);
    gridPane.getColumnConstraints().addAll(columnConstraints,columnConstraints1);
    return gridPane;
}

private void addUIControls(GridPane gridPane) {
    Label headerLabel = new Label("Registration Form");
    headerLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
    gridPane.add(headerLabel, 0, 0, 2, 1);
    GridPane.setHalignment(headerLabel, HPos.CENTER);
    GridPane.setMargin(headerLabel, new Insets(20, 0, 20, 0));

    Label nameLabel = new Label("Full name");
    gridPane.add(nameLabel, 0, 1);

    TextField nameField = new TextField();
    nameField.setPrefHeight(40);
    gridPane.add(nameField, 1, 1);

    Label emailLabel = new Label("Email ID:");
    gridPane.add(emailLabel, 0, 2);

    TextField emailField = new TextField();
    emailField.setPrefHeight(40);
    gridPane.add(emailField, 1, 2);

    Label passwordLabel = new Label("Password :");
    gridPane.add(passwordLabel, 0, 3);

    PasswordField passwordField = new PasswordField();
    passwordField.setPrefHeight(40);
    gridPane.add(passwordField, 1, 3);

    Button submitButton = new Button("Submit");
    submitButton.setPrefSize(100, 40);
    submitButton.setDefaultButton(true);

    gridPane.add(submitButton, 0, 4, 2, 1);
    GridPane.setHalignment(submitButton, HPos.CENTER);
    GridPane.setMargin(submitButton, new Insets(20, 0, 20, 0));

    submitButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if (nameField.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error!", "please your name");
                return;
            }
            if (emailField.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error", "Please enter your email ID");
                return;
            }
            if (passwordField.getText().isEmpty()) {
                showAlert(Alert.AlertType.ERROR, gridPane.getScene().getWindow(),
                        "Form Error", "Please enter a password");
                return;
            }
            showAlert(Alert.AlertType.CONFIRMATION, gridPane.getScene().getWindow(),
                    "Registration Successful!", "Welcome " + nameField.getText());
        }
    });
}

    private void showAlert(Alert.AlertType alertType, Window owner, String title, String message){
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();


    }*/

    public static void main(String[] args) {
        launch(args);
    }
}
