package Durga.youtube.tutorials.java;
 import java.lang.Integer;
//In the case of  object type arrays as arrayelement we can provide either declared type or it's child class objects .
//Number type:int , short ,long ,byte .If we use other types Number type of array it gives error.

//In the case of abstract class type arrays , it's child class objects  are allowed .
//In the case of interface type arrays , it's implementation class objects are allowed.



public class A9arrays3d {

    public static void main (String[] args){
        Number[] n=new Number[3];
        n[0]=new Integer(1);
        n[1]=new Double(10.5);
        //n[2]=new String("gg"); //String gives error for number type
        //n[3]=new Number(5); //It gives error because we need to give child objects not parent
        System.out.println(n[1]);


        Runnable[] r=new Runnable[5];
        r[0]=new Thread();
        //r[1]=new String("gopal"); //It gives incompatible type error.

    }
}
