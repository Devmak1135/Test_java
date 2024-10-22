import java.util.Scanner;

class assin1no2{
     public static void main(String args[])
	 {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.print("\n Enter the Length of Rectangle:");
	   float len = input.nextFloat();
	   
	   System.out.print("\nEnter the width of Rectangle:");
	   float width = input.nextFloat();
	   
	   //System.out.println(len+" "+width);
	   
	   float area = len*width;
	   float perimeter=2*(len+width);
	   
	   //AREA AND PERIMETER
	   System.out.println("\nThe Area of the Rectangle is: "+area);
	   System.out.println("The Perimeter of the Rectangle is: "+perimeter);
	   
	 }
}
/*
OUTPUT:
C:\dev\Java>javac assin1no2.java

C:\dev\Java>java assin1no2

 Enter the Length of Rectangle:20.55

Enter the width of Rectangle:12.21

The Area of the Rectangle is: 250.9155
The Perimeter of the Rectangle is: 65.52
*/
