package Durga.youtube.tutorials.java;

// identifier is just a name , Either it is class name or varible name or method name
//we can not use reserved words as identifiers(like datatypes=int,String,Long)
//identifiers should not start with digits(you can mention like this 'gopal12345')
//identifiers do not have any limitations for length
//java identifiers are case sensitive(Number,NUMBER=both words are not duplicate ,different words)


public class A1Identifiers1 {

    // Instance variable (field) identifier
    private String name;

    // Static variable (class variable) identifier
    private static int count;

    private String Number;

    private String NUMBER;

    // Constructor identifier
    public A1Identifiers1(String name) {
        this.name = name;
        count++; // Increment the static count variable
    }

    // Getter method identifier for name
    public String getName() {
        return name;
    }

    // Setter method identifier for name
    public void setName(String name) {
        this.name = name;
    }

    // Static method identifier to get count
    public static int getCount() {
        return count;
    }

    // Main method identifier - the entry point of the program
    public static void main(String[] args) {
        A1Identifiers1 obj1 = new A1Identifiers1("Alice");
        A1Identifiers1 obj2 = new A1Identifiers1("Bob");

        // Using method identifiers to get and set values
        System.out.println("Object 1 Name: " + obj1.getName());
        System.out.println("Object 2 Name: " + obj2.getName());

        // Using the static method identifier to get the count
        System.out.println("Total Objects Created: " + A1Identifiers1.getCount());

        // Using the setter method to change the name
        obj1.setName("Charlie");
        System.out.println("Object 1 New Name: " + obj1.getName());
    }
}
