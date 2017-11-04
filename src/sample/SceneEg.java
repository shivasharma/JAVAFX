package sample;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class SceneEg extends Application {


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.BLACK);

        //add a leaf node
        Circle cir = new Circle(200, 200, 100);
        cir.setFill(Color.CORAL);
        root.getChildren().add(cir);

        primaryStage.setTitle("JavaFX Scene Graph Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
