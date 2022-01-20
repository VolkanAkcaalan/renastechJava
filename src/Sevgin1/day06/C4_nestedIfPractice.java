package Sevgin1.day06;

public class C4_nestedIfPractice {

    public static void main(String [] args){

        //create a java program to check if person is eligible to give blood
        //requirement to give blood :
                 //person needs to be older than 18
                 //person weight needs to be more than 50

        //expected output :
        //if person age smaller and equal to 18
           //print : "Person needs to be older than 18"
        //if person is eligable
              //"Person is eligible to give blood"


        //example test data is ramazan age is 15 weight is 150

        String personName= "Ali Riza";
        int age=28;
        double weight= 78;

        String result="";

        if(age>18) {
            if (weight > 50.0) {
                result = personName + "is eligible to give blood";
            } else if (weight <= 50.0) {
                result = personName + "is not eligible give to blood";
            }

        } else {
            result = personName+ "needs to be older then 18";
        }

        System.out.println(result);
    }
}