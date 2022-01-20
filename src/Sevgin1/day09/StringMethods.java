package Sevgin1.day09;

public class StringMethods {

   // isEmpty             Checks whether a string is empty or not                         boolean
   // length()            Returns the length of a specified string                        int
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

        // isEmpty             Checks whether a string is empty or not                         boolean

        String str= "dhfsjghds";

        System.out.println(str.isEmpty());

        String str2= "" ;

        boolean b1= str2.isEmpty();

        if (b1){
            System.out.println("str2 is empty");
        }else{
            System.out.println("str2 is not empty");
        }
        String str3= " ";

        System.out.println(str3.isEmpty());

        // length()            Returns the length of a specified string                        int

        String world1= "dgjkcljghfdkjgkjgnfdkljgdnkjgdsngkjs";


        System.out.println("length of world is:"+ world1.length());


        int b= world1.lastIndexOf("s");
        System.out.println("last index of word is : " +b);


        char c=world1.charAt(35);
        System.out.println("last letter of index : " +c);


        String text="fsjkhfkjsdnfdsljkngaljknjlgdl" ;


        System.out.println("length of text is: "+text.length());
        System.out.println("Last index of text is: "+(text.length()-1));
        System.out.println("Last letter of text is: " + text.lastIndexOf("l"));


    }
}
