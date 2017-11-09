package MenuBar;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Menus extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400, Color.WHITE);

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        // File menu - new, save, print, and exit
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem printMenuItem = new MenuItem("Print");
        MenuItem exitMenuItem = new MenuItem("Exit");


        //add the new menuitems to the fileMenu
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, printMenuItem,
                new SeparatorMenuItem(), exitMenuItem);

        Menu languageMenu = new Menu("Language");
        CheckMenuItem javaMenuItem = new CheckMenuItem("Java");
        CheckMenuItem pythonMenuItem = new CheckMenuItem("Python");
        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
        languageMenu.getItems().addAll(javaMenuItem, pythonMenuItem, htmlMenuItem);

        CheckMenuItem FXMenuItem = new CheckMenuItem("JavaFX");
        FXMenuItem.setSelected(true);
        languageMenu.getItems().addAll(new SeparatorMenuItem(), FXMenuItem);


        Menu tutorialMenu = new Menu("Tutorial");
        tutorialMenu.getItems().addAll(
                new MenuItem("Buttons"),
                new MenuItem("Menus"),
                new MenuItem("Images"));

        languageMenu.getItems().add(tutorialMenu);

        exitMenuItem.setOnAction(actionEvent -> Platform.exit());

        menuBar.getMenus().addAll(fileMenu, languageMenu);

        primaryStage.setTitle("Adding Menus");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
