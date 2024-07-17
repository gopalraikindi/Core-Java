package W3school.java.tutorials;

import java.util.HashMap;

/*
In the ArrayList chapter, you learned that Arrays store items as an ordered collection, and you have to access them with an index number (int type).
A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values,
or the same type, like: String keys and String values.
 */
public class B9hashmap {
    public static void main(String[] args) {
        method1();

    }

    public static void method1() {
        HashMap<String ,String> a=new HashMap<String , String>();
        a.put("name" ,"gopal");
        a.put("area" , "suryapet");

        System.out.println(a);
        System.out.println(a.size());
        //System.out.println(a.remove("name"));
        System.out.println(a);
        System.out.println(a.get("name"));

        for(String i:a.keySet()){
            System.out.println("key:" + i  + "value:" +a.get(i));
        }


    }
}

