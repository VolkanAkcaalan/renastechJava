package classAssignment;
            /*

             Write a Java class Book with following features:
             Instance variables :
             title for the title of book of type String.
             author for the author’s name of type String.
             price for the book price of type double.
              */
public class Book{

             public static void main(String[] args) {
              BookType b=new BookType();


                 System.out.println("Title of book : "+ b.title);
                 System.out.println("Author's name : "+ b.authorsName);
                 System.out.println("Price : "+b.price);
                 b.powerOn();
    }


}

class BookType{

            String title="Crime and Punishment";
            String authorsName="Fyodor Dostoevsky";
            double price= 16.98;

            void powerOn(){
                System.out.println("System on");

            }



            }











