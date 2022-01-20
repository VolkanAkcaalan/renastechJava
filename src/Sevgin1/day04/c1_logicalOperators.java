package Sevgin1.day04;

public class c1_logicalOperators {
    public static void main(String [] args) {

        // && -- and
        // || -- or
        // !  -- not (opposite)

        // && -- and
        System.out.println( (5>3) && (3>5) ); // (true && false) -- false
        System.out.println( (10>1) && (20>5)); // (true && true) -- true
        System.out.println( (2==3) && (3==3) ); // (false && true) -- false
        System.out.println( (2!=2) && (3>10) ); // false && false -- false
        // if you are using and operator if your all conditions are true you will see result as true
        // other then that always false
        //true && false && false

        // || -- or

        System.out.println( (5>3) || (3>5) ); // (true || false) -- true
        System.out.println( (10>1) || (20>5)); // (true || true) -- true
        System.out.println( (2==3) || (3==3) ); // (false || true) -- true
        System.out.println( (2!=2) || (3>10) ); // false || false -- false

        // ! -- (opposite)
        boolean bool1=true;
        boolean bool2= ! (10 != 15); //!(true) == false

        System.out.println("**************");
        System.out.println(bool1 && bool2); // true && false == false

        boolean bool3= !!!!!!bool1; //!!!!!! true

        // !!!!! false
        // !!!!  true
        //ture

        boolean bool4= !(10 >= 10); // !(true) == false

        System.out.println("******************");
        System.out.println( (bool3 || bool4) && true);
        // ( (true || false) && true )   (true || false)== true
        // (true && true)
        // true
         System.out.println( ("ramazan" == "sibel ") || ("sibel" == "sibel") );


    }
}
