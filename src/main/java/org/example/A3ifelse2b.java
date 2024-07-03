package org.example;

public class A3ifelse2b {

    public static void main(String[] args) {
        int x=0;

        //If you write if(x) it gives incompatible error
        //If you write if(x=1) it gives incompatible error
        //we have to write in double equals

        if(x==1)
        {
            System.out.print("Hello");

        }
        else {
            System.out.println("Hi");


        }
    }

}
