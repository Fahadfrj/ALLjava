package helloworld.atimetikks;
import static javax.swing.JOptionPane.*;
public class oppgave5 {
    public static void main(String [] args){

        String feh;
        feh = showInputDialog("Enter the degreee in F");
        double f, c;
      f= Double.parseDouble(feh);

        c = (f-32)/1.8;

        System.out.println(" in celius it is = " + c);




    }
}
