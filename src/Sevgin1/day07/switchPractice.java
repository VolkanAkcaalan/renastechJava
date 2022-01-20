package Sevgin1.day07;

public class switchPractice {

    public static void main(String[] args) {


        int day=5;

        String dayType;
        String dayName;

        switch (day){
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";

            default:
                dayName ="Invalid dayName";
        }

        switch (day){

            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                dayType= "Weekday";
                break ;
            case 6:
            case 7:
                dayType="Weekend";
                break;
            default:
                dayType="Invalid dayType";

        }

        System.out.println(day + "is a" + dayName);
        System.out.println(day + "is a" + dayType);
        System.out.println(dayName+ "is a" +dayType);
    }
}
