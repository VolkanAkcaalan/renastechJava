package OOP;

public class Main {

    public static void main(String[] args) {

        Book b1=new Book("Harry Potter", "J. K. Rowling", 180);
        System.out.println(b1.toString());


        Dog b2=new Dog("Golden",5,"Gold","small");
        System.out.println(b2.toString());

        Employee b3=new Employee("Volkan",32,"Software Engineer",111.5);
        System.out.println(b3.print());

        Light b4= new Light();
        System.out.println("b1.getTitle() = " + b1.getTitle());


    }
}
