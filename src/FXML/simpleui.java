package FXML;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;

public class simpleui extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        HBox box = FXMLLoader.load(getClass().getResource("simpleui.fxml"));
        Scene scene = new Scene(box);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
