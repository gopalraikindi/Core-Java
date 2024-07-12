package W3school.java.tutorials;

public class A9returnvalue {
    public static void main(String[] args) {
        method1();
        System.out.println(method1());
        method2(10);
        System.out.println(method2(10));
    }

    public static int method1() {
        return 10;
    }

    public static int method2(int x) {
        return 29;
    }
}
