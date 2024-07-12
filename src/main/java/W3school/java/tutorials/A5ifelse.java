package W3school.java.tutorials;

public class A5ifelse {

    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();

    }

    public static void method1() {
        if(20>18){
            System.out.println("20 is greater than 18");
        }

        }
    public static void method2() {
        int a=20;
        int b=18;
        if(a>b){
            System.out.println("a is greater than b");

        }

    }
    public static void method3() {
        float a=12.30f;
        if(a>23.30){
            System.out.println("ok");
        }else{
            System.out.println("Not ok");

        }

    }

   //Use 'else if' to specify a new condition to test, if the first condition is false
   public static void method4() {
        float a=12.30f;
        if(a>23.30){
            System.out.println("ok");
        }else if(a>13.30){
            System.out.println("ok ok");
        }else{
            System.out.println("Not ok");
        }

    }

    public static void method5() {
        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 0) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else {
            System.out.println("The value is 0.");
        }
    }


    public static void method6() {
        int myNum = 10; // Is this a positive or negative number?

        if (myNum > 100) {
            System.out.println("The value is a positive number.");
        } else if (myNum < 0) {
            System.out.println("The value is a negative number.");
        } else if(myNum<11) {
            System.out.println("The value is 0.");
        }else{
            System.out.println("bye bye");
        }
    }

}
