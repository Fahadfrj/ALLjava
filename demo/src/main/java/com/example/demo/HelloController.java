package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
class multi{

    public static String f(int x){
        int f = 5*x;

        return "the number is " + f;

    }


}

public class HelloController {
    public Button butn;
    @FXML
    private Label lab;
    @FXML
    public TextField txt;

    @FXML
    protected void onHelloButtonCl() {
        lab.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void btnclick(){
        int x = Integer.parseInt(txt.getText());
        lab.setText( multi.f(x));

    }
}