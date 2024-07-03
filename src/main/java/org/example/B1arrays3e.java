package org.example;

//pending topic page number:37

public class B1arrays3e {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}; // Declare and initialize an integer array
        char[] ch = {'a', 'b'}; // Declare and initialize a character array

        int[] b = a; // Assign the reference of array 'a' to 'b'

        // Demonstrating that 'a' and 'b' reference the same array
        System.out.println("Elements of array 'a':");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Elements of array 'b':");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Modify the array through 'b'
        b[0] = 10;

        System.out.println("After modifying 'b', elements of array 'a':");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("After modifying 'b', elements of array 'b':");
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

