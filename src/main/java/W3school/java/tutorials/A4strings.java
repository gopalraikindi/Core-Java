package W3school.java.tutorials;

public class A4strings {
    static String s="gopal";
    static String a="Rohit";
    static String b="Sharma";

    static int c=10;
    static int d=20;
    static int z=c+d;


    public static void main(String[] args) {
        method1();
        method2();
        method3();
    }

    public static void method1() {
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.indexOf("a"));
        //Java counts positions from zero.

    }

    public static void method2() {
        System.out.println(a+" "+b);
        System.out.println(a.concat(b));

    }

    public static void method3() {
        System.out.println(z);
        System.out.println(s+c);

    }
}
