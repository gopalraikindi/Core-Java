package org.example;

import java.util.Arrays;


//In Java, data types are divided into two categories: primitive data types and reference (or non-primitive) data types.
//There are eight primitive data types in Java:  byte ,short ,int , long ,float,double ,boolean, char
// Reference Data Types: Objects, arrays, enums, interfaces, and classes.


//Primitive datatypes divided as  Numerice datatypes,char datatypes,boolean datatypes
//Numerice datatypes(To represent numbers) two types , Integral datatypes(int ,short ,long ,byte) ,Floating point datatypes(boolean , float)
//char datatypes represent characters

//Byte: It's often used in specific scenarios where memory efficiency is crucial or when dealing with binary data, such as in file handling or network communication.
//whenever int is not enough to hold big values we should go for long data type(to count the no.of characters present in big file ,int may not enough the we can go with long
//If we want 5 to 6 decimal places of accuracy then we should go for flat or If we want 14 to 15 decimal places  of accuracy then we should go for double .


//boolean b=o (error:incompaible type) , boolean b=True (error:can't find symbol) ,boolean b=true(correct)
//the only allowed values for the boolean datatype are 'true' or 'false' where case is important .


public class DataTypesExample2 {

    public static void main(String[] args) {

        // Primitive data types
        byte apple = 100;
        short bananan = 10000;//not used now
        int green = 100000;
        long blue = 100000L;
        float red = 234.5f;
        double white = 123.4;
        boolean yellow = true;
        char black = 'A';

        System.out.println("byte: " + apple);
        System.out.println("short: " + bananan);
        System.out.println("int: " + green);
        System.out.println("long: " + blue);
        System.out.println("float: " + red);
        System.out.println("double: " + white);
        System.out.println("boolean: " + yellow);
        System.out.println("char: " + black);

        // Reference data types
        String strVar = "Hello, World!";
        int[] intArray = {1, 2, 3, 4, 5};
        Day dayVar = Day.MONDAY;

        System.out.println("String: " + strVar);
        System.out.println("Array: " + Arrays.toString(intArray));
        System.out.println("Enum: " + dayVar);
    }
}

// Enum example
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

