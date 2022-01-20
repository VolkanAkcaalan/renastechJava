package Sevgin1.day09;

public class StringMethods2 {

        // replace()           Searches a string for a specified value, and returns
        //                     a new string where the specified values are replaced            String
        // replaceFirst()      Replaces the first occurrence of a substring that matches the
        //                     given regular expression with the given replacement             String

        // startsWith()        Checks whether a string starts with specified characters        boolean
        // substring()         Extracts the characters from a string,
        //                     beginning at a specified start position
        //                     and through the specified number of character                   String
        // toLowerCase()       Converts a string to lower case letters                         String
        // toUpperCase()       Converts a string to upper case letters                         String
        // trim()              Removes whitespace from both ends of a string                   String

    public static void main(String[] args) {

        // replace()           Searches a string for a specified value, and returns
        //                     a new string where the specified values are replaced            String

        String str="Hello World 123 Hello world 123" ;

        System.out.println(str.replace("e","x"));// Hxlle World 123 Hxlle world 123

        System.out.println(str.replace("World","Planet")); // Hello Planet 123 Hello world 123
        //second world is small but our target was World

        str= str.replace("World","Planet") ;//now we reassigned str
        //str will change here

        System.out.println("*******************************");
        System.out.println(str);
        str= "parvina" ;
        System.out.println(str);

        // replaceFirst()      Replaces the first occurrence of a substring that matches the
        //                     given regular expression with the given replacement             String

        System.out.println("************************************");

        String str2= "Planet is beautiful planet aeee 123 321 123" ;

        System.out.println(str2.replaceFirst("a","x"));// This will only replace first matching
        System.out.println(str2.replace("a","x"));//This will replace all a with x
        System.out.println(str2);

        System.out.println(str2.replace("123","555"));

        //  startsWith()        Checks whether a string starts with specified characters        boolean
        //  endsWith()          Checks whether a string ends with the specified character(s)    boolean
        //  if your string ends with given condition it will be true
        //  if it is not then you will have false

        System.out.println("*****************************");
        String ss2="Java 21 Hello 47 Java" ;

        //Print true if string start java and if ends java
        //Print false if string doesn't start java and ends java
        //if first print is not true no need to check to second one

        boolean b1=ss2.startsWith("Java") && ss2.endsWith("Java") ;
        boolean b2=ss2.startsWith("Java 21") && ss2.endsWith("47 Java") ;

        if (b1) {
            System.out.println(b1 + " b1 is true");
            if (b2) {
                System.out.println(b2 + " b2 is true");
            } else {
                System.out.println(b2 + " b2 is false");
            }
        }else{
            System.out.println(b1+ "b1 is false");
        }

        // substring()         Extracts the characters from a string,
        //                     beginning at a specified start position
        //                     and through the specified number of character                   String

        //we have 2 methods
        //first substring (beginning index, ending index)
        //this will give start index until end index (excluded last index )
        //second substring (beginning index), this will give print star index from give index to end of the sentence

        String Java="Hello World Java" ;
                   //012345678910

        // I want to print World Java
        System.out.println(Java.substring(6));// World Java
        // Print World
        System.out.println(Java.substring(6,10));//Worl
        System.out.println(Java.substring(6,11));//World
        //Print Hello
        System.out.println(Java.substring(0,5));//Hello
        System.out.println(Java.substring(0,4));//Hell




    }

}
