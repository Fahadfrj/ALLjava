module com.example.eksamen1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eksamen1 to javafx.fxml;
    exports com.example.eksamen1;
}