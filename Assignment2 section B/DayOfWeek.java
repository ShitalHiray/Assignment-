/*Write a program that uses a nested switch statement to print out the day of the week based on an
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
is a weekday or weekend. */

//Program Code:

public class DayOfWeek {
    public static void main(String[] args) {
        int day = 5; 
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                switch (day) {
                    case 1:
                        System.out.println("Monday - Weekday");
                        break;
                    case 2:
                        System.out.println("Tuesday - Weekday");
                        break;
                    case 3:
                        System.out.println("Wednesday - Weekday");
                        break;
                    case 4:
                        System.out.println("Thursday - Weekday");
                        break;
                    case 5:
                        System.out.println("Friday - Weekday");
                        break;
                }
                break;
            case 6:
            case 7:
                switch (day) {
                    case 6:
                        System.out.println("Saturday - Weekend");
                        break;
                    case 7:
                        System.out.println("Sunday - Weekend");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }
    }
}


//Output:Friday - Weekday