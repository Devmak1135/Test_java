class pattern2{
     public static void main(String args[])
	 {
		 int n = Integer.parseInt(args[0]);
		 System.out.print("Enter the limit:-"+n);
		 
		 for(int i=0;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
		   System.out.println();
		 }
	 }
}
/*
OUTPUT:-
E:\Devcs5>java pattern2 10
Enter the limit:-10
*
**
***
****
*****
******
*******
********
*********
**********
*/
