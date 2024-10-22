import java.util.Scanner;

class Degree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float cel, fah, temp;
        
        System.out.print("\n(1) Celsius To Fahrenheit.\n(2) Fahrenheit To Celsius.\nEnter Choice: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter Temperature in Celsius: ");
                cel = input.nextFloat();
                temp = (cel * 9 / 5) + 32;
                System.out.println("The Temperature in Fahrenheit is " + temp);
                break;
                
            case 2:
                System.out.print("Enter Temperature in Fahrenheit: ");
                fah = input.nextFloat();
                temp = (fah - 32) * 5 / 9;
                System.out.println("The Temperature in Celsius is " + temp);
                break;
                
            default:
                System.out.println("Invalid Choice!!");
        }
       
    }
}	
/*
OUTPUT:
C:\dev\Java>javac assin1p1no3.java

C:\dev\Java>java Degree

(1) Celsius To Fahrenheit.
(2) Fahrenheit To Celsius.
Enter Choice: 1
Enter Temperature in Celsius: 40
The Temperature in Fahrenheit is 104.0
*/
