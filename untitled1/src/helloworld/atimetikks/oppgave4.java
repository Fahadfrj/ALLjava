package helloworld.atimetikks;
import static javax.swing.JOptionPane.*;
public class oppgave4 {
    public static void main(String [] args){

        String radius;
        radius= showInputDialog("skriv inn bredden");
        double r , a;

        r = Double.parseDouble(radius);


        a = 2*r*3.14;

        System.out.println(" omkretsen  er = " + a);
        return;






    }
}
