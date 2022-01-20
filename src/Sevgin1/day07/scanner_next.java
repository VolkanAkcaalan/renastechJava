package Sevgin1.day07;

import java.util.Scanner;

public class scanner_next {

    public static void main(String[] args) {
        //for the string to able to use scanner you need to call next method
        //2 way to create next and nextline


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.next();
        System.out.println(firstName);

        System.out.println("Enter last name");
        String lastName = input.next();
        System.out.println(lastName);


        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        System.out.println("Grade for student");
        int grade = input.nextInt();

        System.out.println(fullName + " grade is : " + grade);

        System.out.println("letter grade for student");
        String gradeLetter = input.next();
        System.out.println(gradeLetter);

    }
}
