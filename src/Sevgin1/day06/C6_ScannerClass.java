package Sevgin1.day06;

import java.util.Scanner;

public class C6_ScannerClass {

    public static void main(String[] args) {

        // scanner will ask you put input for the function
        // each time you run you can put different inputs you want to try

        // first of all scanner is a library under java
        // library has ready methods created inside


        Scanner input = new Scanner (System.in);
        //we have scanner object calls input

        System.out.println("insert your byte number");

        byte b1= input.nextByte();
        //nextByte method will ask you for a number, then it will accept that one
        //then assign to b1 variable as byte

        System.out.println("b1 is" + b1);

        int i1= input.nextInt();
        //nextByte method will ask you for a number, then it will accept that one
        //then assign to i1 variable as int

        System.out.println("i1 is"+ i1);

    }
}
