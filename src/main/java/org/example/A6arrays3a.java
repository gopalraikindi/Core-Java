package org.example;

public class A6arrays3a {

    public static void main(String[] args){
        int[] a=new int [3];//array by default initalize with 0 values
        System.out.println(a[0]);
        System.out.println(a[1]);

        int[] b=new int [3];//here we constructing the array
        b[0]=5;//we initalize the arry
        b[1]='a';
        System.out.println(b[0]);

        int[] c={10,20,30};//here we declare,construct,initalize the array in single line
        System.out.println(c[0]);

        String[] st={"gopal","rahul"};
        System.out.println(st[1]);

        int[][] abc=new int[2][];// Declare a 2D array with 2 rows

        abc[0] = new int[3]; // Initialize the first row with 3 columns
        abc[1] = new int[2]; // Initialize the second row with 2 columns

        abc[0][0]=1;
        abc[0][1]=2;
        abc[0][2]=3;
        abc[1][0]=6;
        abc[1][1]=7;
        System.out.println(abc[1][0]);


        int[][] ab={{1,2,3},{6,7}};
        System.out.println(ab[1][0]);

    }
}
