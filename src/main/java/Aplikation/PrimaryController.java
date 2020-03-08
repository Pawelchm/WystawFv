package Aplikation;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class PrimaryController {


    @FXML
    public void switchToWindow() throws IOException {
        App.setRoot("Window");
    }
}
