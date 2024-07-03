package org.example;


//the main advantage of the array is we can represent multiple values under the same name.
//main disadvantage of the array is , Once we created array we can not increase or decrease the size.We can solve this issue by using collections .

//Declaration:
//single dimension array declaration: int[] a; or int a[] or int []a;
//two dimension array declaration: int[][] a; or int[] a[];  or int [][]a; or int []a[]; or int[] a[];
//3 dimension array declaration ;int[][][] a;  or int[] a[][]; or int a[][][];


//Construction
//int[] a=new int[3];  3 is the size of an array
//at the time of construction compusory we should specify the size otherwise we will get compiletime error.

//Intialization
//a[0]=10; and a[1]=20;

//we can declare, construct,intialize an array into single line
//for int type: int[] c={10,20,30};
//for char type: char[] ch={'a','e','i','o'}; for char single quotes used.
//for string type: String[] st={"gopal","rahul"}; for string double quotes used .






//TO specify array size of int allowed datatypes are byte-short and char-int ,see the below class example
//byte-short and char-int-long-double
//for int type arrays before int datatype all datatypes are allowed .

public class A5arrays3 {

    public static void main(String[] args){
        int[] a=new int[10];
        int[] b=new int['a'];//string
        byte ab=10;//byte
        int[] c=new int[ab];
        short sk=20;//short
        int[] d=new int[sk];

    }

}
