import java.util.Scanner;

class Var {
    public static void main(String[] args) {
        int num1;
        double num2;
        char char_var;
        boolean bool;
        Scanner input = new Scanner(System.in);

        // Input values
        System.out.print("Enter The Number as Integer: ");
        num1 = input.nextInt();
        System.out.print("Enter The Number as Floating Value: ");
        num2 = input.nextDouble();
        System.out.print("Enter The Character: ");
        char_var = input.next().charAt(0);
        System.out.print("Enter The Bool(True/False): ");
        bool = input.nextBoolean();

        // Menu driven program
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Integer Arithmetic Operations");
            System.out.println("2. Character Arithmetic Operations");
            System.out.println("3. Double Arithmetic Operations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Integer's Arithmetic Operations:");
                    System.out.println("Addition: " + (num1 + (int) num2));
                    System.out.println("Subtraction: " + (num1 - (int) num2));
                    System.out.println("Multiplication: " + (num1 * (int) num2));
                    System.out.println("Division: " + (num1 / (int) num2));
                    break;

                case 2:
                    System.out.println("Character's Arithmetic Operations:");
                    System.out.println("Addition: " + ((int) char_var + (int) num2));
                    System.out.println("Subtraction: " + ((int) char_var - (int) num2));
                    System.out.println("Multiplication: " + ((int) char_var * (int) num2));
                    System.out.println("Division: " + ((int) char_var / (int) num2));
                    break;

                case 3:
                    System.out.println("Double's Arithmetic Operations:");
                    System.out.println("Addition: " + (num2 + num2));
                    System.out.println("Subtraction: " + (num2 - num2));
                    System.out.println("Multiplication: " + (num2 * num2));
                    System.out.println("Division: " + (num2 / num2));
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
/*
OUTPUT:
C:\dev\Java>javac assin1no1.java

C:\dev\Java>java Var
Enter The Number as Integer: 20
Enter The Number as Floating Value: 30.34
Enter The Character: D
Enter The Bool(True/False): True

Menu:
1. Integer Arithmetic Operations
2. Character Arithmetic Operations
3. Double Arithmetic Operations
4. Exit
Enter your choice: 1
Integer's Arithmetic Operations:
Addition: 50
Subtraction: -10
Multiplication: 600
Division: 0

Menu:
1. Integer Arithmetic Operations
2. Character Arithmetic Operations
3. Double Arithmetic Operations
4. Exit
Enter your choice: 2
Character's Arithmetic Operations:
Addition: 98
Subtraction: 38
Multiplication: 2040
Division: 2

Menu:
1. Integer Arithmetic Operations
2. Character Arithmetic Operations
3. Double Arithmetic Operations
4. Exit
Enter your choice: 3
Double's Arithmetic Operations:
Addition: 60.68
Subtraction: 0.0
Multiplication: 920.5156
Division: 1.0

Menu:
1. Integer Arithmetic Operations
2. Character Arithmetic Operations
3. Double Arithmetic Operations
4. Exit
Enter your choice: 4
Exiting...
*/
