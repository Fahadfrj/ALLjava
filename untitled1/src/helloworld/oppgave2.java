package helloworld;
import static javax.swing.JOptionPane.*;

public class oppgave2 {

    public static void main(String [] args){
        String t= showInputDialog("Skriv inn et tall");
          int t1;
        try{
             t1 = Integer.parseInt(t);



           }
            catch (Exception e){
            t1=0;
            System.out.println(t1);
            }
       System.out.println(t1 * 10);



    }


}
