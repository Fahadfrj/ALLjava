package helloworld.atimetikks;
import static javax.swing.JOptionPane.*;
public class oppgave1 {
    public static void main(String [] args){
        String navn , alder;

        navn = showInputDialog("Enter the name");
        alder= showInputDialog("Enter the age");
        int age= Integer.parseInt(alder);
        int born = 2022 - age;
        int age67 = born+67;


        showMessageDialog(null, "" + navn + " is "+ alder+" years old" +" and had been born in the year: "+ born + " he will be 67 in the year: " + age67);


    }

}
