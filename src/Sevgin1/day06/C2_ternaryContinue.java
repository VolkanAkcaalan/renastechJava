package Sevgin1.day06;

public class C2_ternaryContinue {

    //this task :
    //crate a java program that takes score of student and prints the grade of student
    //between 100 to 85 is grade A
    //between 70 to 84 is grade B
    //between 60 to 69 is grade C
    //between 40 to 59 is grade D
    //between 0 to 39 is grade F
    //if number is not between 0-100 grade 0 ,,"invalid number"

    public static void main(String [] args){

        int score=63;

        char grade='0';
        String str="";

        if (score<=100 && score>=85){
            grade='A';
        }else if (score<=84 && score >=70){
            grade='B';
        }else if (score<=69 && score>=60){
            grade='C';
        }else if (score<=59 && score>=40){
            grade='D';
        }else if (score<=39 && score>0){
            grade='F';

        }else {
            grade='0';
            str="invalid number";
        }
        System.out.println("Student grade is:"+grade);
        System.out.println(str);

        char grade2= (score<=100 && score>=85) ? 'A' : (score<=84 && score >=70) ? 'B'
                : (score<=69 && score>=60) ? 'C' : (score<=59 && score>=40) ? 'D'
                : (score<=39 && score>0) ? 'F' :'0' ;

        System.out.println("Grade2 is : " +grade2);
    }
}
