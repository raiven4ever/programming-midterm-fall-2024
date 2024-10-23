module com.raivens.test2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.raivens.test2 to javafx.fxml;
    exports com.raivens.test2;
}
