module com.sosuisha {
    requires static lombok;

    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.sosuisha to javafx.fxml, javafx.graphics;
}
