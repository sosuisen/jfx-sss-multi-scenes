#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
module myapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens ${package} to javafx.fxml, javafx.graphics;
}
