package com.example.parkering;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;



class Bil{
    public String bilNummer;
    public Date startTid;
    public int plass;
    public boolean kortTid;


    public Bil(String bilNummer, Date startTid, boolean kortTid) {
        this.bilNummer = bilNummer;
        this.kortTid = kortTid;
        this.startTid = startTid;

    }

    public String formaterKvittering(){
        Date n = new Date();

        String k ="";
        k+= "Kvittering for bil nummer = " + this.bilNummer + "\n";
        k+= "Start tid = " + new SimpleDateFormat("HH:mm").format(this.startTid) +" til " + new SimpleDateFormat("HH:mm").format(n) + "\n";
        k+= "betalt = " + this.avgift();
        return k;
    }

    public double getPris(){
        if (this.kortTid){
            return 20;
        }
        return 10;
    }
    public double avgift(){
        Date n = new Date();
        Long v = (n.getTime() - this.startTid.getTime())/3600000;

        return v*this.getPris();
    }
}

class Parkeringshus{

    public ArrayList<Bil> b = new ArrayList<>();


    public void reserverPlass(Bil enBil){
        this.b.add(enBil);

    }

    public String frigjørPlass(String bilNummeret){
        for(Bil k:b){
            if(k.bilNummer.equals(bilNummeret)){
                b.remove(k);
                return k.formaterKvittering();
            }



        }
        return "Bilen finnes ikke";

    }
}

public class HelloController {
        Parkeringshus pa = new Parkeringshus();
    @FXML
    private TextField blnr;

    @FXML
    private Button krt;

    @FXML
    private Button ku;

    @FXML
    private Button lng;

    @FXML
    private TextArea rs;

    @FXML
    void krt(ActionEvent event) {
        String f = blnr.getText();
        Date n = new Date();
        Bil p = new Bil(f,n,true);
        pa.reserverPlass(p);

    }

    @FXML
    void ku(ActionEvent event) {
        String f = blnr.getText();
        rs.setText(pa.frigjørPlass(f));
    }

    @FXML
    void lng(ActionEvent event) {
        String f = blnr.getText();
        Date n = new Date();
        Bil p = new Bil(f,n,false);
        pa.reserverPlass(p);
    }

    Date nå = new Date();
}
