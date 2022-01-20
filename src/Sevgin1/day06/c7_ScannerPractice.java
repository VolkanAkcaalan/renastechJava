package Sevgin1.day06;

import java.util.Scanner;

public class c7_ScannerPractice {

    public static void main(String[] args) {


        Scanner inputNumber=new Scanner(System.in);
        //Scanner is ready with object calls input number
        //you can call any method from scanner by using object
        //first number

        System.out.println("Insert First number");
        int number= inputNumber.nextInt();
        System.out.println("You have insert number"+ number);

        if ( number %2==0){
            System.out.println("is even number");

        }else{
            System.out.println("is odd number");
        }

        Scanner scan=new Scanner (System.in);
        //new variable called scan from scanner class

        System.out.println("Enter first number");
        short num1= scan.nextShort();
        System.out.println("Enter second number");
        short num2= scan.nextShort();
        System.out.println("Enter third number");
        short num3= scan.nextShort();

        int max= (num1 >= num2 && num1>=num3) ? num1 :(num2>= num1 && num2>= num3)? num2
                : num3;
        System.out.println("max number is"+max);

        System.out.println( (num1+num2+num3)/2);


    }

}
