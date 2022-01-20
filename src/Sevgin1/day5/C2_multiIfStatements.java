package Sevgin1.day5;

public class C2_multiIfStatements {

    public static void main(String [] args) {

        //multi if else blocks
        //let's say you have 2 number
        //you want to check if they are equal, small, big

        int x = 15;
        int y = 23;
        // create check if x is smaller then y or bigger then y or equal to y
        if (x == y) { // java will first check this block
           System.out.println(x+ " is equal to" +y);
        }else if(x > y){ //check this one one second part
            System.out.println(x+ "is bigger than" +y);
        }else if (x<y){  // last it will check else block
            System.out.println(x+ " is smaller then " +y);
        }

        // starting point is o                               print you are at starting point
        // ending point is 10                                print you are at ending   point
        // between those number (0-10) will be on my way     print you are on your way

        int number=3;

        if (number==0) {
        System.out.println("you are at starting point");


        } else if (number==0){
            System.out.println("you are at ending point");
        } else  if  (number >0){
            System.out.println("you are on your way");
        }

    }
}
