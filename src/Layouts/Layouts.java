package Layouts;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Layouts extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        grid.setHgap(10);
        grid.setVgap(10);

        Group g = new Group();
        Button b1 = new Button("First Button");
        Button b2 = new Button("Second Button");
        Button b3 = new Button("Thrid Button");
        Button b4 = new Button("Fourth Button");


        GridPane.setConstraints(b1, 1, 1);
        GridPane.setConstraints(b2, 2, 1);
        GridPane.setConstraints(b3, 1, 2);
        GridPane.setConstraints(b4, 2, 2);


        grid.getChildren().addAll(b1, b2, b3, b4);
        b1.setLayoutX(200);
        b1.setLayoutY(150);

        Scene scene = new Scene(grid, 300, 400);

        primaryStage.setScene(scene);
        primaryStage.setTitle("This is Layout");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(true);
        primaryStage.show();


    }
}
