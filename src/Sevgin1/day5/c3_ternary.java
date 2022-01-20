package Sevgin1.day5;

public class c3_ternary {
    public static void main(String [] args){

       // this is just another way of using if else block

       //create a project that will print me max number between 2 number
       int number1= 25;
       int number2= 35;
       int max ;
       String message="";

       if (number1>number2){
           max=number1;
       }else {
           max=number2;

       }
            message = "Maximum number is :" + max;
          System.out.println(message);

          //ternary
          //if     ?
          //else :

        int max2;

        max2= (number1> number2) ? number1 : number2 ; //ternary (different way of if else block)

        // if present    ??
        // else presents :
        System.out.println(max2);

        String result ="" ;

        result= (false) ? "JAVA" : "PYTHON";

        System.out.println(result);
    }
}
