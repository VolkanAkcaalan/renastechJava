package Sevgin1.day04;

public class C4_minMaxNumbers {

    public static void main(String [] args){

        // x y z
        // min number
        // create a logic that will going to print minumum number between 3 numbers


        int x=245;
        int y=-500;
        int z=0;

        boolean xMin= x<y && x<z; // false && false = false
        //x has to smaller then y and smaller then z
        boolean yMin= y<x && y<z ; // true && true = true
        //if y is minimum number then y has to be smaller then x and z
        boolean zMin= z<x && z<y ; // true && false == false

        if (xMin) { // false
            //java won't check inside of if
            System.out.println(x + " is the minimum number between " + x + "," + y + "," + z );
        }
        if (yMin) { //true
            System.out.println(y + " is the minimum number between " + x + "," + y + "," + z );
        }
        if (zMin) { // false
            //java won't check inside of if
            System.out.println(z + " is the minimum number between " + x + "," + y + "," + z );
        }

        int a=500;
        int b=200;
        int c=100;

        boolean aMax= a>b && a>c; //true
        boolean bMax= b>a && b>c; //false
        boolean cMax= c>a && c>b; // false

        if (aMax) {
            System.out.println(a + "is the maximum number between" + a + "," + b + "," + c);
            if (bMax) {
                System.out.println(b + "is the maximum number between" + a + "," + b + "," + c);
                if (cMax) {
                    System.out.println(b + "is the maximum number between" + a + "," + b + "," + c);

                }

            }
        }


    }
}
