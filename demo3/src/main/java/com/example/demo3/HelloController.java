package com.example.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button btn;

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
    void trykk(ActionEvent event) {
            String f = txt1.getText();
            String f2 = txt2.getText();
            lbl1.setText(f);
            lbl2.setText(f2);
            btn.setText(f+f2);

    }

}
