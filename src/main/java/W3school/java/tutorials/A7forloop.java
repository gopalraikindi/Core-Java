package W3school.java.tutorials;


//When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:
public class A7forloop {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
    }


    //for(starting;ending;inbetween) ,below code start with 0 and end with 5 and inbetween 0 to 5 what we need to happen we have to mention in the last stage .
    public static void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i +"a");
        }
    }

    public static void method2() {

        for(int i=1;i<=2;i++){
            System.out.println("outer:" +i);
            for(int j=1 ; j<=3;j++){
                //System.out.println("outer:" +i);
                System.out.println("inner:" +j);
        }
            //System.out.println("outer:" +i);
        }
    }

    public static void method3() {

        int[][] abc = {{1, 2, 3}, {5, 6, 7, 8}};

        for (int i = 0; i < abc.length; ++i) {
            System.out.println("outer:" + i);
        }
    }

    public static void method4() {
        int myNumbers[][] = {{1, 2, 3, 4}, {5, 6, 7}};

        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                //System.out.println("gopal:" + myNumbers[i].length);
                System.out.println(myNumbers[i][j]);
            }
        }
    }


}
