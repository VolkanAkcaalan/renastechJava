package Sevgin1.day08;

public class StringMethods3 {

    //   CharAt()            Returns the character at the specified index (position)         char
    //   indexOf             Returns the position of the first found occurrence
    //                       of specified characters in a string                             int
    //   isEmpty             Checks whether a string is empty or not                         boolean
    //   lastIndexOf()       Returns the position of the last found occurrence of
    //                       specified characters in a string                                int


    public static void main(String[] args) {

        String sentence= "Hello world, you are great world. lo lo" ;
        System.out.println(sentence.charAt(2)); //l
        System.out.println(sentence.charAt(3)); //l
        System.out.println(sentence.indexOf("l")); //check and returns first matching index first matching index first l 2
        System.out.println(sentence.indexOf("lo")); // second l 3
        System.out.println(sentence.indexOf("lo "));// second l 3
        System.out.println(sentence.indexOf(" lo"));// index of last space before lo

        // pointing first l from hello
        System.out.println(sentence.indexOf("e") + 2);

        //pointing second l from hello
        System.out.println(sentence.indexOf("e") + 2);

        //catching last l from sentence
        System.out.println(sentence.indexOf(". lo") + 2);
        System.out.println(sentence.indexOf(" lo") + 1);

        //   lastIndexOf()       Returns the position of the last found occurrence of
        //                       specified characters in a string                                int
        // String sentence= "Hello world, you are great world. lo lo" ;

        System.out.println(sentence.lastIndexOf("l"));

        int firstL=sentence.indexOf("l");
        int lastL=sentence.lastIndexOf("l");
        int secondL=sentence.indexOf("lo");
        int beforeLastL=sentence.lastIndexOf(". lo")+2;

        System.out.println(firstL + "," + lastL + "," + secondL + "," + beforeLastL);


    }
}
