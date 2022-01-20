package Sevgin1.day02;

public class C2_escapeSequences {

    public static void main(String[] args){
        System.out.println("Renastech");

        // \t text --> this will give an extra space in your code
        System.out.println("\tRenastech");
        System.out.println("\t\t\tRenastech");

        // \n mean new line --> text will be displayed on new line
        System.out.println("Hello World");
        System.out.println("Hello \nWorld");
        System.out.println("Hello \n\tWorld");


        // \\ -- This will print single slash on the \ consule
        System.out.println("\\");

        System.out.println("/");

        // you have text inside text you want to use "" :
        System.out.println("today is \"saturday \"  ");

        // to have single qoute
        System.out.println("today is \'saturday\'  ");


    }
}
