package FXML;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class simpleuiController {

    @FXML
    public TextField textField;

    public void initialized() {
        textField.setText("This is set through controller");
    }
}
