package helloworld.klasser;
import static  javax.swing.JOptionPane.*;

   class book{
      String tittel , forfatter;
      int pris , ISBn;

      public  String getforfatter(){
           String f = this.tittel;
           return f;

       }
       public  int getpris(){
           int p = this.pris;
           return p;

       }
       public  int getIBS(){
           int i = this.ISBn;
           return i;

       }



       public void setTittel(String tittel) {
           this.tittel = tittel;
       }

       public void setISBn(int ISBn) {
           this.ISBn = ISBn;
       }

       public String getTittel() {
           return tittel;
       }
       public int getpriss(int ibs){
          this.ISBn = ibs;

          return this.pris;


       }
   }

  class getbook{





  }
public class fr1 {
    public static void main (String [] args){
        String x;
         int f;

        while(true){
            x = showInputDialog("Enter 1 to add a new book or 2 to get info about a book or 3 to close");
            f = Integer.parseInt(x);


            if(f==1){
                String n = showInputDialog("Enter the name of the book you will add");
                String  fo = showInputDialog("Enter the writers name you will add");
                String p  = showInputDialog("Enter the price of the book you will add");
                String  i = showInputDialog("Enter the IBMsnumber of the book you will add");

                int pr,ib;


                pr = Integer.parseInt(p);
                ib = Integer.parseInt(i);


                book book1 = new book();
                book1.setTittel(n);
                book1.forfatter = fo;
                book1.pris = pr;
                book1.setISBn(ib);



             System.out.println("the book has been added");
            }

            if(f==2){
               String n = showInputDialog("Enter the no of the book");
                  int io = Integer.parseInt(n);

               book.setISBn(io);


               System.out.println(book1.getpriss(io));


            }
            if(f==3){
                 break;
            }



        }






    }


}
