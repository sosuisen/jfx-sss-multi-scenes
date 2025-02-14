module myapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml, javafx.graphics;
}
