package Hyr.java.youtube.tutorials;

public class A4this {
    int a=10;
    int s=20;

    /*
1-->Here we have two non-static variables , main method is static ,If we want to call non-static varibles to static
method we need to create a object using that obeject we can access the non-static varibles .

 public static void main (String[] args){
        A4this A=new A4this();//creating object
        System.out.println(A.s);//accessing 's' varible from the object 

2-->there is a one non-static method ,the purpose of this method is call 'instance varibles' from this method .
Here two-ways are there to call instance varibles from thr non-static method .

CASE 1:
you can call by creating the object

 public void sai(){
        A4this A=new A4this();
        System.out.println(A.a);
    }

CASE 2:
you can call by using 'this' keyword

 public void rahul(){
        System.out.println(this.a);
    }

CASE 3:
==>When we need to create the object ?
if we want call the instance varible(non-static) to static method we need create the object otherwise no need to create.
==>when we need to use the 'this' keyword ?
If we want to call the instance varible(non-static) to non-static methods we can use 'this'   keyword(CASE-2 Example),
otherwise we can call by using object also(CASE-1 Example) but creating the object means we are creating new storage .

3-->Basically 'this' keyword used  to call the class level instance varibles to non static methods .

4-->If we want to call the non-static methods to main method (static-method) we need to create the and call from that object.
       public static void main (String[] args){
                A4this A=new A4this();
                A.rahul();

5-->There is a scenario ,we created two instance varibles with the names 'a' and 'b' , we created one method and assign two
parameters also with the same names 'a'  ans 'b' ,If we do not this keyword it directly take the values from  the
main method if we menthion 'this' keyword it the  values from the instance varibles .

 public void gopal(int a,int s){
        System.out.println(a);
    }

    public void gopal1(int a,int s){
        System.out.println(this.a);
    }

 */

    public static void main (String[] args){
        A4this A=new A4this();
        System.out.println(A.s);

          A.gopal(5,7);
        A.gopal1(5,7);
          A.rahul();
          A.sai();


    }


    public void sai(){
        A4this A=new A4this();
        System.out.println(A.a);
    }
    public void rahul(){
        System.out.println(this.a);
    }

    public void gopal(int a,int s){
        System.out.println(a);
    }

    public void gopal1(int a,int s){
        System.out.println(this.a);
    }

}
