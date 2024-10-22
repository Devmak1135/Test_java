public class person {
    private String name;
    private int age;
    private String gender;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Setter for gender
    public void setGender(String gender) {
        this.gender = gender;
    }

    // Main Method for testing
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        person p = new person();

        // Input the properties
        System.out.print("Enter name: ");
        p.setName(input.nextLine());

        System.out.print("Enter age: ");
        p.setAge(input.nextInt());
        input.nextLine();  // Consume newline

        System.out.print("Enter gender: ");
        p.setGender(input.nextLine());

        // Display the properties
	System.out.println("-----------------------");
	System.out.println("The Details of The person entered is:");
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Gender: " + p.getGender());

        // Set new properties
	System.out.println("-----------------------");
        System.out.print("Enter new name: ");
        p.setName(input.nextLine());

        System.out.print("Enter new age: ");
        p.setAge(input.nextInt());
        input.nextLine();  // Consume newline

        System.out.print("Enter new gender: ");
        p.setGender(input.nextLine());

        // Display the updated properties
	System.out.println("-----------------------");
	System.out.println("The Updated Details of The person are:");
        System.out.println("Updated Name: " + p.getName());
        System.out.println("Updated Age: " + p.getAge());
        System.out.println("Updated Gender: " + p.getGender());

        
    }
}
/*
OUTPUT:
C:\dev\Java>javac p2.java

C:\dev\Java>java person
Enter name: Dev
Enter age: 19
Enter gender: Male
-----------------------
The Details of The person entered is:
Name: Dev
Age: 19
Gender: Male
-----------------------
Enter new name: Devika
Enter new age: 24
Enter new gender: Female
-----------------------
The Updated Details of The person are:
Updated Name: Devika
Updated Age: 24
Updated Gender: Female
*/
