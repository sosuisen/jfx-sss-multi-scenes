module myapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.pkg to javafx.fxml, javafx.graphics;
}
