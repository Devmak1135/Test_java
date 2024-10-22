class EvenOdd {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

    }
}
/*
OUTPUT:
C:\dev\Java>javac assin1p3no1.java

C:\dev\Java>java EvenOdd
Enter a number: 9234
9234 is even.

C:\dev\Java>java EvenOdd
Enter a number: 3241245
3241245 is odd.
*/
