package W3school.java.tutorials;

//method overloading means method names are same but parameters are different .If parameters are same we will get duplication error.
public class B3methodoverloading {
    public static void main(String[] args) {
        method1(5,6);
        method1(5.5,5.6);
        System.out.println(method1(5,6));
        System.out.println(method1(5.5,5.6));

    }

    public static int method1(int x ,int y) {
        return(x+y);
    }

    public static double method1(double x ,double y) {
        return(x+y);
    }
}
