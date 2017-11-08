package Controls.DropDown;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DropDownExample extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("DropDown Demo");
        button = new Button("Click Me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getitems returns the observableList object
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Bananas");
        choiceBox.getItems().addAll("Grapes", "PineApple");
        //set default value
        choiceBox.setValue("Apple");


        VBox layout = new VBox(10);

        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(button, choiceBox);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
