module com.example.tallerbacktracking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tallerbacktracking to javafx.fxml;
    exports com.example.tallerbacktracking;
}