package helloworld.atimetikks;
import static javax.swing.JOptionPane.*;
public class oppgave3 {
    public static void main(String [] args){

    String bredde , lengde;
    bredde= showInputDialog("skriv inn bredden");
    lengde= showInputDialog("skriv inn lengden");
     int b , l;
     double a;
        b = Integer.parseInt(bredde);
        l= Integer.parseInt(lengde);



         a = b*l;

         System.out.println(" arealet er = " + a);
         return;






    }
}
