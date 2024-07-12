package W3school.java.tutorials;

//Loops can execute a block of code as long as a specified condition is reached.
//In Java, a while loop repeatedly executes a block of statements as long as a given condition is true.
public class A6whileloop {

    public static void main(String[] args) {
        method1();
        method2();
        method3();


    }

    public static void method1() {
        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }
    }

    public static void method2() {
        int i=0;
        while (i<=10){
            System.out.println(i);
            i +=2;
        }
    }
    public static void method3() {
    int countdown = 3;
    while (countdown > 0) {
        System.out.println(countdown);
        countdown--;
    }
    System.out.println("Happy New Year!!");
}
}
