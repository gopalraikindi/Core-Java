package W3school.java.tutorials;

/*
In Java, there are two types of casting:

Widening Casting (automatically) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type
double -> float -> long -> int -> char -> short -> byte

 */

public class A3typecasting {

    public static void main(String[] args) {
        WideningCasting1();
        NarrowingCasting1();
        WideningCasting2();
        WideningCasting3();


    }

    public static void WideningCasting1(){
        int a=10;
        double d=a;
        System.out.println(a);
        System.out.println(d);
    }

    public static void NarrowingCasting1(){
        double d=10.25;
        int a=(int)d;
        System.out.println(d);
        System.out.println(a);
    }



    public static void WideningCasting2(){
        int maxScore = 500;
        int userScore = 423;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate */
    float percentage = (float) userScore / (float)maxScore * 100.0f;

    System.out.println("User's percentage is " + percentage);
    }

    public static void WideningCasting3(){
        int maxScore = 500;
        //we need to convert the int to float
        float a=maxScore;


        int userScore = 423;
        float b=userScore;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate */
        float percentage = b / a * 100;

        System.out.println("User's percentage is " + percentage);
    }



}
