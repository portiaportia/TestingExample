module com.library {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;
    requires junit;

    opens com.library to javafx.fxml;
    exports com.library;

    opens com.model to javafx.fxml;
    exports com.model;
}
