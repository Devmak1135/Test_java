import java.util.Scanner;

class usescanner{
         public static void main(String args[])
		 {
			 Scanner input = new Scanner(System.in);
             System.out.print("Enter your Name:");
             String user_name = input.next();
             System.out.println("Your Username is: "+user_name);

             System.out.print("Enter the age:");
			 int age = input.nextInt();
			 System.out.println("Your age is: "+age);
		 }			 
}
/*
OUTPUT:
Z:\JAVA>java usescanner
Enter your Name:Devmak
Your Username is: Devmak
Enter the age:20
Your age is: 20
*/
