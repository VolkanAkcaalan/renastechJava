package Sevgin1.day03;

public class C3_postPreCondition {

    public static void main(String [] args){

        // pre  : this will change the value of number immediately
        // post : firs won't gonna change anything on the variable , at the end it will change it

        int x=10;
        System.out.println(x)  ; //10
        System.out.println(++x); // pre condition will increase the number 11
        System.out.println(x)  ; //11
        System.out.println(++x); //12

        System.out.println(+x); // this wont change number value it is effecting either positive or negative

        int y =20 ;

        System.out.println(y);
        System.out.println(--y); // pre condition will decrease the number 19

        //post
        int z=10;
        System.out.println(z++); // post will increase the number on text steps not immediately
        System.out.println(z);

        int w =20;
        System.out.println(w--); //post will decrease the number on text steps not immediately
        System.out.println(w--); //it will be still 19 on next line will be 18

        System.out.println("*********************");
        int i1= 15;
        System.out.println( -- i1); //14
        System.out.println (i1++);  //14
        System.out.println(i1);     //15
        System.out.println(++ i1);  //16

    }
}
