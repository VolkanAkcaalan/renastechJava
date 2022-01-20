package Sevgin1.day02;

public class C1_PrintVSPrintln {

    //first thing you need to do create main method to be able to run your code


    public static void main(String[] args){
        //first line
        System.out.println("this is println"); //println breaks the line
        // second line
        System.out.print("--this is print"); // print never breaks the line it continues the line that you have
        //second line
        System.out.print("-- continue print");
        //second line
        System.out.println("println 2");

        //after print line line will move to 3
        //third line
        System.out.print("print2");
        //third line
        System.out.println("println 3"); //line will breaked

        //4 line
        System.out.println("println 4"); //this line will break the line
        //after here what you print it will be on next line
        System.out.print("print3");// this line won't break the line

    }
}

/*

consule output should be same order as given below

   First Name : Volkan , ID : 123567
   Company name : Scotia bank
   Salary : 120K
 */