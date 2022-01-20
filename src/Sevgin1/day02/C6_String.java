package Sevgin1.day02;

public class C6_String {

    public static void main(String[] args){

        String name="Volkan";
        String companyName="Amazon";
        String companyName2="Renastech";
        double salary=110000.00;

        System.out.println("Name : " + name + " Company name :" + companyName + " Salary : "+ salary);

        //printing them in new lines
        System.out.println("Name : " + name + "\nCompany name :" + companyName + "\nSalary : "+ salary);

        // to make println concat different variables you need to use  +



        String number="100000"; // this is still word. it has multiple

        System.out.println(salary +10 );// 110010.00
        System.out.println(number + 10 );// 100000+10

        int i1=7;
        int i2=8;

        String s1="7";
        String s2="8";

        System.out.println(i1+i2); // 7 + 8==15 both are number it is going to sum them
        System.out.println(s1+s2); // 7+8== 78 if we have string it is going to concat them

        System.out.println(s1+i1); // 7(word)+7(number) = 77

        System.out.println(i1+10); //17
        System.out.println(s1+10); //710

    }
}

     // create 3 name and assign any name
     // create 3 age number assign any number you want to
     // print those age with person name Demhat age is 20
     // also sum those three person age 20 + 30 + 40
     // print "Sum of persons Age = 90 ;





