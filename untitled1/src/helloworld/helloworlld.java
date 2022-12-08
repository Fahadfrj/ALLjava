package helloworld;
import static javax.swing.JOptionPane.*;


public class helloworlld {
    public static void main(String [] args){
        int x=1;
        while(x != 2){
            String fornavn = showInputDialog("Fornavn ?");
            String etternavn = showInputDialog("Ettenavn?");
            String alder = showInputDialog("Aldern?");
            String address = showInputDialog("addressen?");
            String postnr = showInputDialog("postnr?");
            if(address == "oslo"){
                x++;
            }
            showMessageDialog(null, "Navnet : " + fornavn +" "+  etternavn + "\n" + "Addres :" + address + "\n" + "postnummeret : " + postnr + "\n" + "Alder : "+ alder);


        }



    }

}


