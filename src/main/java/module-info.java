module org.openjfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens Aplikation to javafx.fxml;
    exports Aplikation;
}