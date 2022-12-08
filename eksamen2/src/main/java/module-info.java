module com.example.eksamen2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.jetbrains.annotations;


    opens com.example.eksamen2 to javafx.fxml;
    exports com.example.eksamen2;
}