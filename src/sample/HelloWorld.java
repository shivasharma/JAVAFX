package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        Button button = new Button();
        button.setText("Say Helle JAVAFX");

        button.setOnAction(e -> System.out.println("Hello World"));

        StackPane root = new StackPane();
        root.getChildren().add(button);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello world");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
