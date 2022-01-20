package Sevgin1.day04;

public class C3_ifStatement {

    public  static void main(String [] args) {

        boolean bool1 = 10 > 5; //true
        boolean bool2 = false;

        if (bool1) { // this is opening bracket for if
            System.out.println("print me");
            System.out.println("Hello");

        }// this is closing bracket for if

        if (!bool2) { // since this condition id false java won't check inside of this if

            System.out.println("print me 2");
            System.out.println("Hello 2");

        }
        System.out.println("Hello 3");

        if (2==2) { // true condition
            // it is gonna go inside if since it is true
            System.out.println(4);
        }

        if (2!=2) { // false condition then java won't check your inside of your if statement
            System.out.println(5);
        }


    }

}
