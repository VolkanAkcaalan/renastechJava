package Sevgin1.day02;

public class c4_arithmetichOperators {

        public static void main(String[] args){
            int i1=1;
            int i2=2;

            double d1=1.5;
            double d2=2.5;

            //sum of 2 number
            System.out.println(i1+i2);
            System.out.println(d1+d2);
            System.out.println(i1+d1);


            //minus operator
            System.out.println(i1-i2);
            System.out.println(d1-d2);
            System.out.println(i1-d1);

            //multiple numbers
            System.out.println(i1*i2); //1*2=2
            System.out.println(d1*d2); //1.5*2.5=3.75

            //division
            System.out.println(i2/i1);
            System.out.println(20/10);    //2   2 numbers are int result will be int number
            System.out.println(20.0/10); //2.0 in here you have double number(decimal number 20.0) result also should be as double

            System.out.println(11/4.0);  // result is 2.75
            System.out.println(11/-4.0); // result is 2.75

            System.out.println("************************");
            //reminder
            System.out.println(10/2); // division returns 5
            System.out.println(10%2); //renider is 0 here

            System.out.println(10/3); // this is will return 3
            System.out.println(10%3);
            System.out.println(10.0 % 3);

        }
}
