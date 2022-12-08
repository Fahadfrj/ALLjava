package com.example.demo1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label lbl;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private TextField txt1;

    @FXML
    private TextField txt2;

    @FXML
    void trykkmeg(ActionEvent event) {
        String f = txt1.getText();
        String f2 = txt2.getText();
        lbl1.setText(f);
        lbl2.setText(f2);

    }

}
