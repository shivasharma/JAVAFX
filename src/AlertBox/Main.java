package AlertBox;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;
    Button button1;
    Button button2, button3;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Alert Modal");
        button1 = new Button("Click Me");
        button2 = new Button("Open confirmation dialog");
        button3 = new Button("Close Program");

        GridPane grid = new GridPane();
        grid.add(button1, 1, 1);
        grid.add(button2, 2, 1);
        grid.add(button3, 2, 2);
        button1.setOnAction(e -> AlertBox.display("Title of the window", "This is alert box message"));


        button2.setOnAction(e -> {
            boolean result = ConfirmBox.display("Title of the window", "Are you sure do you want close?");
            System.out.println(result);
        });

        button3.setOnAction(e -> closeProgram());

        Scene scene = new Scene(grid, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram() {
        System.out.println("Program Close");
        window.close();
    }
}
