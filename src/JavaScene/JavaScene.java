package JavaScene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaScene extends Application {

    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        javafx.scene.control.Label label1 = new Label("Welcome to first scene");
        javafx.scene.control.Button button1 = new javafx.scene.control.Button("Go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //Layout that stores childern item in vertical column
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(label1, button1);
        scene1 = new Scene(layout1, 200, 200);

        //Button2
        javafx.scene.control.Button button2 = new javafx.scene.control.Button("Go to scene 1");
        button2.setOnAction(e -> window.setScene(scene1));

        //Layout2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);

        scene2 = new Scene(layout2, 600, 300);

        window.setScene(scene1);
        window.setTitle("This is a title");
        window.show();
    }
}
