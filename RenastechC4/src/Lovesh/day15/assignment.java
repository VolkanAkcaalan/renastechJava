package Lovesh.day15;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Size");
        int size;
        size= scan.nextInt();
        System.out.println("Enter values");
        int values[]= new int[size];
        for(int i=0; i<values.length; i++){
           values [i] = scan.nextInt();

        }
        System.out.println("\nEntered num are:");
        for(int i=0; i<values.length; i++)
            sum+= values[i];
        System.out.println(sum);





    }
}
