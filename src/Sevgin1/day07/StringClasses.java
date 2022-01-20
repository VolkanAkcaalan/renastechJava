package Sevgin1.day07;

public class StringClasses {
    public static void main(String[] args) {
        /*
        in java string is an object that represents a sequence of characters.
        The java.lang.String class is used to create a string object.

        How to create a string object?
        There are two ways to create String object:

        1.By string literal
        2.By new keyword
         */
        //create an string object 1.By string literal
        //Java String literal is created by using double quotes. For example:
        //
        //String str1="Hello"
        //Each time you create a string literal, the JVM checks the "string constant pool"first.
        //If the string already exists in the pool, a reference to the pooled instance is returned.
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        //For example:
        String str1="Hello"; // first it will check the pool and since I don't have Hello it is going to
        // If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
        String str2="Hello"; // it doesn't create a new instance
        //If the string already exists in the pool, a reference to the pooled instance is returned.

        //Why Java uses the concept of String literal?
        //To make Java more memory efficient
        // (because no new objects are created if it exists already in the string constant pool)

        //2.By new keyword
        String str3=new String("Hello");
        //String str3=new String("Hello");//creates two objects and one reference and one reference variable
        //In such case, JVM will create a new string object in normal (non-pool) java heap memory,

        System.out.println(str3);
        //and the literal "Hello" will be placed in the string constant pool.
        //The veriable str3 will refer to the object in a heap (non-pool).

        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false we have 2 different objects so that is why it's false

        //what is the differences between == vs string.equal methods

        String s1="New York"; // placed on string constant pool
        s1="Virginia";
        s1="Istanbul";
        s1="New York";
        s1="Mardin";
        //in java string objects are immutable.
        System.out.println(s1);


    }
}
