package Sevgin1.day08;

public class StringMethods {

                    /*

        Method              Description                                                     Return Type
        CharAt()            Returns the character at the specified index (position)         char
        concat()            Appends a string to the en of another string                    String
        contains()          Checks whether a string ends with the sequence characters       boolean
        endsWith()          Checks whether a string ends with the specified character(s)    boolean
        equals()            Compares two strings. Returns true if the strings are equal,
                            and false if not                                                boolean
        equalsIgnoreCase()   Compares two strings, ignoring case considerations              boolean
        indexOf             Returns the position of the first found occurrence
                            of specified characters in a string                             int
        isEmpty             Checks whether a string is empty or not                         boolean
        lastIndexOf()       Returns the position of the last found occurrence of
                            specified characters in a string                                int
        length()            Returns the length of a specified string                        int
        replace()           Searches a string for a specified value, and returns
                            a new string where the specified values are replaced            String
        replaceFirst()      Replaces the first occurrence of a substring that matches the
                            given regular expression with the given replacement             String

        startsWith()        Checks whether a string starts with specified characters        boolean
        substring()         Extracts the characters from a string,
                            beginning at a specified start position,
                            and through the specified number of character                   String
        toLowerCase()       Converts a string to lower case letters                         String
        toUpperCase()--       Converts a string to upper case letters                       String
        trim()              Removes whitespace from both ends of a string                   String

                    */

    public static void main(String[] args) {
            //charAt()              Returns the character at the specified index  (position)         char

            String str = "Hello ";
            //  012345
            //index numbers starts from 0 in java
            char ch = str.charAt(0);
            System.out.println(ch);
            System.out.println(str.charAt(2));

            String firstName = "Volkan";
            String lastName = "Akcaalan";

            System.out.println(firstName + lastName);
            System.out.println(firstName.concat(lastName));    //concat method will ask what to concat with firstName

            //concat()            Appends a string to the en of another string                    String

            String fullName = firstName.concat(lastName);
            System.out.println(fullName);
            System.out.println(fullName.concat(" Ozer"));


            String myStr="Feyzeddin";
            String myStr2="Donmez";
            int score=90;

            System.out.println("**********************");

            System.out.println(myStr.concat(" " + myStr2));
            System.out.println(myStr.concat(" ").concat(myStr2));
            System.out.println(myStr.concat(" ").concat(myStr2).concat(" his score is: ").concat(""+score));

            System.out.println(myStr.charAt(3)); //Feyzeddin //z
            System.out.println(myStr.concat(myStr2).charAt(23)); //FeyzeddinDonmez //m

            // contains()          Checks whether a string ends with the sequence characters       boolean

            System.out.println("*************************");

            //contains method will check if string contains given value
            //if it contains it will return true
            //if it is not then it will be false
            String ss1="Java n Ja";
            System.out.println(ss1.contains("j")); //small case j which we don't have inside ss1 false
            System.out.println(ss1.contains("a")); //true
            System.out.println(ss1.contains("Ja")); //true
            System.out.println(ss1.contains("Ja ")); //no space inside of ss1 it will false
            System.out.println("*********************");
            System.out.println(ss1.contains("J"));   //true
            System.out.println(ss1.contains("va"));  //true
            System.out.println(ss1.contains("Jv"));  //Jv will be new string and we don't see Jv together inside ss1 false

            boolean example=ss1.contains(" ");
            System.out.println(example);


            //endsWith()          Checks whether a string ends with the specified character(s)    boolean
            // if your string ends with given condition it will be true
            // if it is not then you will have false

            System.out.println("*****************************");
            String ss2="Java 23 Hello";
            System.out.println(ss2.endsWith("Java")); // at the end we don't have Java false
            System.out.println(ss2.endsWith("o"));
            System.out.println(ss2.endsWith("lo"));
            System.out.println(ss2.endsWith("hello")); //small h will be false
            System.out.println(ss2.endsWith("23 Hello"));
            System.out.println(ss2.endsWith("Java 23 Hello"));


    }

}
