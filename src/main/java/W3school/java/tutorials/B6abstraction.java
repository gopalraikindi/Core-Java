package W3school.java.tutorials;

/*
The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:
 */
public abstract class B6abstraction {

     public abstract void method1();       // Abstract method (does not have a body)

     public void method2(){
          System.out.println("hi");
     }
}


//sub-class
class pig extends B6abstraction{
    public void method1() {
         System.out.println("The pig says: wee wee");
    }
}


class dog {
     public static void main(String[] args) {
          pig nokia=new pig();
          nokia.method1();
          nokia.method2();
     }
}

