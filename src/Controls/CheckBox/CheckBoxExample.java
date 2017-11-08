package Controls.CheckBox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckBoxExample extends Application {

    Stage window;
    Scene scene;
    Button button;
    Label lable;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("CheckBox Example");

        //checkboxes
        CheckBox checkBox1 = new CheckBox("Bacon");
        CheckBox checkBox2 = new CheckBox("Tuna");
        checkBox2.setSelected(true);

        //button
        button = new Button("Order Now");
        button.setOnAction(e -> handleOptions(checkBox1, checkBox2));

        //Label
        lable = new Label("This is label");

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(checkBox1, checkBox2, button, lable);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    //click handle method
    private void handleOptions(CheckBox checkBox1, CheckBox checkBox2) {
        String message = "";
        if (checkBox1.isSelected()) {
            lable.setText(message += "Bacon");
        }
        if (checkBox2.isSelected()) {
            lable.setText(message += "Tuna");
        }
    }
}
