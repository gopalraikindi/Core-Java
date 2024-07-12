package W3school.java.tutorials;

public class B1exceptions {

    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }
    }
}


