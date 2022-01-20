package classAssignment;

import java.util.Scanner;

public class mainPerson {


    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.println("Enter the amount of purchase");
            PreferredCustomer b1=new PreferredCustomer("Kadir","Manolya cicek sokak",8003276587l,193764826,true, scan.nextDouble());

              System.out.println(b1.toString());




    }
}
