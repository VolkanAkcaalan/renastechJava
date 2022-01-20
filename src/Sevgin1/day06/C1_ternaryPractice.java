package Sevgin1.day06;

public class C1_ternaryPractice {

    public static void main(String[] args) {

        //Task1 :create a java project that will check if number is even or odd

        int number;

        number = 25;
        String result = "";

        //let's try with if statement

        if (number % 2 == 0) {
            result = "number is even";

        } else {
            result ="number is odd";
        }

        System.out.println(result);

        //ternary practise
        //if   ?
        //else :

        String result2= (number % 2== 0) ?" Number is even" : " Number is odd" ;
        System.out.println(result2);

        //Task2 :create a java program that will check if number is divisible by 2 and 5 at the same time
        int i1=10;
        int i2=15;

        boolean divisibleBy2and5= ( (i1*i2) %2==0 && (i1*i2) %5==0) ? true : false ;
        System.out.println( (i1*i2)+ "is divisible by 2 and 5 :" + divisibleBy2and5);


    }
}
