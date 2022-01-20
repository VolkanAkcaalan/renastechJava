package Sevgin1.day03;

public class practice {

    public static void main(String [] args){

        //create 3 different number
        //second number should be = first number + 7
        //third number should be = second number + 8
        // ex: x=25, y=32, z=40
        // ex: x20 , y=27, z=35
        int x=25;
        //y=32
        int y = x+7; // 25 + 7 = 32
        //z=40
        int z= y+8;  // (x+7) + 8 = 40

        // print c,y,z
        System.out.println("X is :" + x);
        System.out.println("Y is :" +y);
        System.out.println("Z is:" +z);

        //sum of three numbers
        System.out.println( "sum of x,y,z is:" + x+y+z);
        //text +number = text
        System.out.println("sum of x,y,z is:"+ (x+y+z) );
        //sum of x,y,z is:+(25+32+40 == sum of x,y,z is : + (97)

        //if the x is divisible by 2,3,5

        // 3.check if x is divisible by 2,3,5 (check for each number)
        // if it is divisible print : x is divisible by 2 true
        // if it is not divisible print : x is divisible by 2 false

        // if number is divisible by another number when you divide should have reminder as a 0
        // example 10 is divisible by 2 reminder will be 0  10 % 2 = 0
        //x;25

        boolean divisibleBy2= x % 2 == 0 ; // if reminder 0 this should be true if is is not then this should be false
        boolean divisibleBy3= x % 3 == 0 ;
        boolean divisibleBy5= x % 5 == 0 ;

        System.out.println(" is divisibleBy2 : " +divisibleBy2);
        System.out.println(" is divisibleby3 : " +divisibleBy3);
        System.out.println(" is divisibleby5 : " +divisibleBy5);


    }
}
