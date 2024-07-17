package W3school.java.tutorials;

import java.util.ArrayList;
import java.util.Collections;

public class B8arraylistlooping {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        ArrayList<String> a=new ArrayList<>();
        a.add("kohli");
        a.add("chokli");
        a.add("dhoni");
        a.add("dhobi");

       // System.out.println(a);

        for(int i=0 ;i<a.size() ;i++){
            System.out.println(a.get(i));
        }

        Collections.sort(a);

        for(int i=0 ;i<a.size() ;i++){
            System.out.println("sorting order: " + a.get(i));
        }

        for(String b:a){
            System.out.println(b);
        }


    }
}
