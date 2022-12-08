package helloworld;
import static javax.swing.JOptionPane.*;
public class logisk {

    public static void main(String [] args){
         String t,t1;
         int tt,tt1;
         t= showInputDialog("Enter a number");
         t1= showInputDialog("Enter another number");
         tt= Integer.parseInt(t);
        tt1= Integer.parseInt(t1);



        if(tt==tt1){

             System.out.println("the two number are equal");
         }
        if(tt!=tt1){

            System.out.println("the two number are not equal");
        }if(tt>tt1){

            System.out.println("the first number is bigger");
        }
        if(tt<tt1){

            System.out.println("the second number is bigger");
        }



    }

}
