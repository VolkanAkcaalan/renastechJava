package Sevgin1.day08;

public class StringMethods2 {


    public static void main(String[] args) {

        // equals()                   Compares two strings. Returns true if the strings are equal,
        //                            and false if not                                                boolean
        //equalsIgnoreCa()            Compares two strings, ignoring case considerations              boolean


        String str1="Hello";
        String str2="Hello"; // this comes from string pool
        String str3=new String("Hello"); // This come from java heap
        String str4=new String("World");

        //equals method will only care exact match value
        //not the memory (object type)

        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println(str1.equals(str3)); //true

        System.out.println(str1==str3);//false different object
        System.out.println(str1==str2);//true


        String s1= "Java";
        String s2= "java";
        String s3= "jaVa";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        boolean b1= s3.equalsIgnoreCase(s1) ;
        boolean b2= s2.equalsIgnoreCase(s1) ;
        boolean b3= s2.equals(s1) ;

        if (b1) {
            System.out.println("b1 is true");
            if (b2){
                System.out.println("b2 is true");
                if(b3){
                    System.out.println("b3 is true");

                }else {
                    System.out.println("b3 is false");

                }
            }else{
                System.out.println("b2 is false");
            }
        }else{
            System.out.println("b1 is false");
        }
        //without using brackets
        //If you have less lines you can use
        //prefer way is to use bracket
        //bracket will give you more concrate result
        if(b3) System.out.println("hello b1");
        else System.out.println("hello b1 false");


    }


}
