package Controls;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Controls extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setMinWidth(600);
        grid.setMaxHeight(400);

        grid.setVgap(5);
        grid.setHgap(20);
        grid.setGridLinesVisible(false);


        TableView table = new TableView();
        table.setMinHeight(300);
        table.setMinWidth(5500);

        TableColumn column1 = new TableColumn("Priority");
        TableColumn column2 = new TableColumn("Description");
        TableColumn column3 = new TableColumn("Progress");
        table.getColumns().addAll(column1, column2, column3);
        GridPane.setConstraints(table, 1, 1, 3, 1);


        //code to create TextBox
        TextField taskName = new TextField();
        taskName.setPromptText("Enter Task Name");
        taskName.setText("Default Text");
        taskName.setMinWidth(300);
        GridPane.setConstraints(taskName, 2, 2);

        //code to create combo box

        ComboBox priority = new ComboBox();
        priority.getItems().addAll("High", "Low", "Medium");
        priority.setPromptText("Enter Priority");
        GridPane.setConstraints(priority, 1, 2);

        //code for Button

        Button addButton = new Button("Add");
        addButton.setMinWidth(100);
        GridPane.setConstraints(addButton, 3, 2);

        Button cancelButton = new Button("Cancel");
        addButton.setMinWidth(100);
        GridPane.setConstraints(cancelButton, 3, 3);

        //code for HBOX
        HBox progressArea = new HBox();
        progressArea.getChildren().addAll(new Label("Progress"), new Spinner<Integer>(0, 100, 0), new CheckBox("Complete"));
        progressArea.setAlignment(Pos.CENTER_RIGHT);
        progressArea.setSpacing(10);
        GridPane.setConstraints(progressArea, 1, 3, 2, 1);


        grid.getChildren().addAll(table, taskName, priority, addButton, cancelButton, progressArea);

        Scene scene = new Scene(grid, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("This is a title");
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
