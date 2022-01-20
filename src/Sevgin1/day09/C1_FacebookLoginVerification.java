package Sevgin1.day09;

import java.util.Scanner;

public class C1_FacebookLoginVerification {

    // create a logic that will check login function of facebook
    // correct username =renastech
    // correct password =renastech1234

    public static void main(String[] args) {

        String expectedUserName = "Renastech" ;
        String expectedPassword = "Renastech1234" ;

        Scanner scan=new Scanner(System.in) ;

        System.out.println("Enter user name");
        String inputUserName = scan.next();

        System.out.println("Enter password");
        String inputPassword = scan.next();

        if (expectedUserName.equals(inputUserName) && expectedPassword.equals(inputPassword) ) {

            System.out.println("You have logged in Successfully");

        } else {

            System.out.println("Login function is failed");
            System.out.println("Invalid credentials ");
            System.out.println("Credentials are "+ inputUserName +" and "+ inputPassword);

        }

    }
}
