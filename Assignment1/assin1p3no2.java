import java.util.Scanner;
class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1 for Monday, 2 for Tuesday, etc.): ");
        int dayNumber = input.nextInt();

        String day;
        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid input! Please enter a number between 1 and 7.";
                break;
        }

        System.out.println(day);

    }
}
/*
OUTPUT:
C:\dev\Java>javac assin1p3no2.java

C:\dev\Java>java DayOfWeek
Enter a number (1 for Monday, 2 for Tuesday, etc.): 6
Saturday

C:\dev\Java>java DayOfWeek
Enter a number (1 for Monday, 2 for Tuesday, etc.): 7
Sunday

C:\dev\Java>java DayOfWeek
Enter a number (1 for Monday, 2 for Tuesday, etc.): 10
Invalid input! Please enter a number between 1 and 7.

C:\dev\Java>java DayOfWeek
Enter a number (1 for Monday, 2 for Tuesday, etc.): 8
Invalid input! Please enter a number between 1 and 7.

C:\dev\Java>java DayOfWeek
Enter a number (1 for Monday, 2 for Tuesday, etc.): 0
Invalid input! Please enter a number between 1 and 7.
*/
