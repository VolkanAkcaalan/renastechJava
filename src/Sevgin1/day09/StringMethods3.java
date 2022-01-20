package Sevgin1.day09;

public class StringMethods3 {

    // toLowerCase()       Converts a string to lower case letters                         String
    // toUpperCase()       Converts a string to upper case letters                         String
    // trim()              Removes whitespace from both ends of a string              //   String

    public static void main(String[] args) {

        String word= "Volkan Akcaalan" ;

        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());

        String word2="aYDIN bAYSOZ" ;

        String firstName=(word2.substring(0,1).toUpperCase().concat(word2.substring(1,5).toLowerCase()));
        String lastName=(word2.substring(6,7).toUpperCase().concat(word2.substring(7,12).toLowerCase()));

        System.out.println(firstName.concat(" ").concat(lastName));

        // trim()              Removes whitespace from both ends of a string               // String

        String Name="     Volkan     Akcaalan    " ;

        System.out.println(Name.trim());
        System.out.println(Name.replace(" ",""));
        System.out.println(Name.replaceFirst(" ",""));
        Name=Name.replaceFirst(" ", "");
        System.out.println(Name);
        Name=Name.replaceFirst(" ","");
        System.out.println(Name);






    }
}
