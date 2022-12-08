module com.example.valutakalkulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.valutakalkulator to javafx.fxml;
    exports com.example.valutakalkulator;
}