package W3school.java.tutorials;

import java.util.ArrayList;
import java.util.Iterator;

public class C3iterator {

    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(12);
        a.add(9);

        Iterator<Integer> it = a.iterator();
        System.out.println(it);

        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
            if(i < 10){
                it.remove();
                System.out.println(i);
            }
        }
    }

    }


