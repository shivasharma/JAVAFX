package FormData;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FormData extends Application {

    Stage window;
    Scene scene;
    javafx.scene.control.Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("This is a form");

        //form
        javafx.scene.control.TextField nameInput = new javafx.scene.control.TextField();

        button = new Button("Click here");
        javafx.scene.control.Label label = new Label();
        button.setOnAction(e -> {
            isInt(nameInput, nameInput.getText());
            label.setText(nameInput.getText());

        });

        //Layouts
        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(nameInput, button, label);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println(" User age is" + age);
            return true;
        } catch (NumberFormatException e) {

            System.out.println("Error" + message + "is not a number");

        }
        return false;
    }
}
