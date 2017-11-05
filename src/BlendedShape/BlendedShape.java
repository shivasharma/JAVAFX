package BlendedShape;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class BlendedShape extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    static Node blendModeObject() {

        Group g = new Group();

        Circle cir = new Circle(50, 50, 25);
        cir.setFill(Color.DARKCYAN);
        cir.setBlendMode(BlendMode.MULTIPLY);


        Rectangle rec = new Rectangle(50, 50, 50, 50);
        rec.setFill(Color.RED);


        Rectangle r = new Rectangle(170, 50, 50, 50);
        r.setFill(Color.BROWN);

        Rectangle r3 = new Rectangle(50, 150, 50, 50);
        r.setFill(Color.YELLOWGREEN);


        Circle cir2 = new Circle(170, 50, 25);
        cir.setFill(Color.CORAL);

        Circle cir3 = new Circle(50, 150, 25);
        cir.setFill(Color.NAVY);

        g.setBlendMode(BlendMode.SRC_ATOP);
        g.getChildren().addAll(rec, cir, cir2, r, r3, cir3);
        return g;
    }

    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        root.getChildren().add(blendModeObject());
        Scene sc = new Scene(root, 300, 300);
        primaryStage.setTitle("Blended Shapes");
        primaryStage.setScene(sc);
        primaryStage.show();

    }
}
