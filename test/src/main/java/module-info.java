module com.raivens.test {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.raivens.test to javafx.fxml;
    exports com.raivens.test;
}
