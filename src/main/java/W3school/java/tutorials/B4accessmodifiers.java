package W3school.java.tutorials;

//public--The code is accessible for all classes .
//private--The code is only accessible within the declared class .
//protected--The code is accessible in the same package and subclasses.
//A static method means that it can be accessed without creating an object of the class, unlike public:
//If you don't want other classes to inherit from a class, use the final keyword:
public class B4accessmodifiers {


    //If you don't want the ability to override existing attribute values, declare attributes as final:
    public static void main(String[] args) {
        B4accessmodifiers myObj = new B4accessmodifiers();
      //  myObj.x = 50; // will generate an error: cannot assign a value to a final variable
      //  myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
       // System.out.println(myObj.x);
    }


    public void FinalAccessModifier() {
        final int x = 10;
        final double PI = 3.14;


    }
}
