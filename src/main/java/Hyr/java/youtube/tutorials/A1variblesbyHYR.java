package Hyr.java.youtube.tutorials;

/*

1. Local Variables
Definition: Declared inside a method, constructor, or block.
Scope: Only accessible within the method, constructor, or block where it is declared.
Lifetime: Exists only during the execution of the method, constructor, or block.

2. Instance Variable(Non-Static field)
Definition: Declared inside a class but outside any method, constructor, or block.
Scope: Accessible throughout the class.
Lifetime: Exists for as long as the object exists.
Note: Each object has its own copy of instance variables.

3. Static Variables
Definition: Declared inside a class with the static keyword.
Scope: Accessible throughout the class and can be accessed without creating an instance of the class.
Lifetime: Exists as long as the class is loaded in memory.
Note: There is only one copy of a static variable shared among all instances of the class.

 */

public class A1variblesbyHYR {

    static int a = 10;//static variable

    String color="red";


    public static void main(String[] args){
        String s="gopal";//Local Varible
        System.out.println(s);
        System.out.println(a);

        String sa;//Local Varible initalizing in another way
        sa="rahul";
       // sa="gopal500";
        System.out.println(sa);

        //we will get this error when we exectute dircatly instance varible in main method without creatig the object , this is the error "Non-static field 'color' cannot be referenced from a static context"
        A1variblesbyHYR v=new A1variblesbyHYR();//creating the object using class name.
         System.out.println(v.color);


    }
}
