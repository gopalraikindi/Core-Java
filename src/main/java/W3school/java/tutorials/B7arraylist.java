package W3school.java.tutorials;

import java.util.ArrayList;

public class B7arraylist {

    public static void main(String[] args) {
        B7arraylist b=new B7arraylist();
         b.method1();

    }

    public  void method1() {
        ArrayList<String> a=new ArrayList<String>();
        a.add("gopal");
        a.add("rahul");
        System.out.println("all values:" + a);

        a.add(0,"sai");
        System.out.println("changing position:" + a);

        System.out.println("position place:" +a.get(1));
        a.set(1,"nano");
        System.out.println("position place:" +a.get(1));

        System.out.println("position place:" +a.get(2));

        System.out.println("removing item:" +a.remove(0));

        System.out.println("size" + a.size());

       a.clear();
       System.out.println( "all values:" +a);

    }
}
