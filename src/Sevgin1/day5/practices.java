package Sevgin1.day5;

public class practices {
    public static void main(String [] args){

        int number=20;
        int number2=-number++ + number - ++number;

        System.out.println(number2); // -21

        //-20  + 21 - 22
        // 1-22
        //-21

        System.out.println(number); //22
        number =35;
        System.out.println(number); //35
        System.out.println(number2);

        int a= -10;
        int b= --a + a++ -a + --a*2 + 10/2 - 10%3 ;
        // -11 + -11 + 10 + -11*2 + 5 - 1
        //-30
        System.out.println(b);
    }
}
