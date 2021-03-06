package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Title of the window");
        button=new Button();
        button.setText("Click Me");

        StackPane layout=new StackPane();
        layout.getChildren().add(button);

        Scene scence=new Scene(layout,200,300);
        primaryStage.setScene(scence);
        primaryStage.show();
        button.setOnAction(this);


        //Anynomous inner class
       /* button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("button click");
            }
        });*/

        //Lambda Syntax
        button.setOnAction(e -> {
            System.out.println("This is test1");
            System.out.println("This is test2");
        });
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("Button clicked");

        }
    }
}
