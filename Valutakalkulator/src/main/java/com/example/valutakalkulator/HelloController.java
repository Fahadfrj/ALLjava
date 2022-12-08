package com.example.valutakalkulator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.*;

class valuta{
    private String val;
    private double value;

    public valuta(String v , double vv){
        this.val = v;
        this.value = vv;




    }

    public String getVal() {
        return val;
    }

    public double getValue() {
        return value;
    }
}
class valutac{
    private ArrayList<valuta> v = new ArrayList<>();

    public void fylllist(){
        valuta usd = new valuta("USD" , 10);
        valuta eur = new valuta("EUR" , 10);
        valuta dkk = new valuta("DKK" , 75);
        valuta ils = new valuta("ILS" , 34);

        this.v.add(usd);
        this.v.add(eur);
        this.v.add(dkk);
        this.v.add(ils);

    }
    public double beregn(String f , double va){

            for(valuta k:v){
                if(k.getVal().equals(f)){
                    return va * 100/k.getValue();


                }

            }

        return 0;


    }


}
public class HelloController {

    @FXML
    private TextField b;

    @FXML
    private Button bv;

    @FXML
    private Label rs;

    @FXML
    private Label txtb;

    @FXML
    private Label txtv;

    @FXML
    private TextField v;

    @FXML
    void regn(ActionEvent event) {
        valutac p= new valutac();
        p.fylllist();
        double l = Double.parseDouble(b.getText());
        String o = v.getText();

        rs.setText(" " + p.beregn(o, l));
    }

}
