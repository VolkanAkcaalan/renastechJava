package Sevgin1.day06;

public class c3_nestedIf {

    ////This task :
    // create a java program that takes score of student and prints the grade of student
    //between 100 to 51 is grade A
    //between 0 to 50 is grade B
    //if number is not between 0-100 grade 0 ,,"invalid number"
    // if students absent
    //if number is valid number

    public static void main(String[] args) {


        int score = 80;

        String attend = "Yes";
        String result = "";

        if (attend == "Yes") {
            if (score >= 51 && score <= 100) {
                result = "Student score is" + score + "Grade is A";
            } else if (score >= 0 && score <= 50) {
                result = "Student score is" + score + "Grade is B";
            } else {
                result = "invalid number passed check the score !!!!!!" + "Score is :" + score;
            }

        }else if ( attend=="No"){
            result="Student was absent";

        }else {
            result= "Invalid characters for Attendance please check attend variable : " +attend;

        }
        System.out.println(result);
    }
}
