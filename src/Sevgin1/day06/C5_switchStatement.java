package Sevgin1.day06;

public class C5_switchStatement {

    public static void main(String[] args) {
        // create a java program that will take numbers between 1-12
        // and print months name depends on number

        // ex
        // 1 -- jan
        // 5 -- may

        int month=7;
        String monthName ;

        switch (month) { //switch will ask for a variable
            case 1:
                monthName = "Jan"; // Switch will check cases and if it's match
                // then month name will be jan
                break; // if this case true then break the switch
            case 2:
                monthName = "Feb";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "Apr";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "Jun";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "Aug";
                break;
            case 9:
                monthName = "Sept";
                break;
            case 10:
                monthName = "Oct";
                break;
            case 11:
                monthName = "Nov";
                break;
            case 12:
                monthName = "Dec";
                break;
            default:
                monthName = "invalid number";
        }
                System.out.println(monthName);

                //without break statement

            char ch1= 'B';
            String result= "Hello";

            // 3 case which is A, B, C

            switch (ch1){
                case 'A':
                    result += "A";
                    break;
                case 'B':
                    result += "B";
                    break;
                case 'C':
                    result += 'C';
                    break;

                default:
                    result += "invalid";

            }

        System.out.println(result);





    }
}
