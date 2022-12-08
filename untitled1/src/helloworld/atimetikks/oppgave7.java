package helloworld.atimetikks;
import static javax.swing.JOptionPane.*;
public class oppgave7 {
    public static void main (String [] args){
        String npi , ns, np;
        npi = showInputDialog("enter number og pizza");
        ns = showInputDialog("enter numer slices per pizza");
        np = showInputDialog("enter number of people");

        int n1 , n2, n3 , r,f,f1;

        n1 = Integer.parseInt(npi);
        n2 = Integer.parseInt(ns);
        n3 = Integer.parseInt(np);
           r = n2*n1;
             f= r / n3;
             f1 = r%n3;
             System.out.println(" dersom de er " + n3 + " personer "+ "det skal vær " + f + " slices for hver og " + f1 +" til overs");

    }
}
