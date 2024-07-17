package W3school.java.tutorials;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Iterator;

/*
An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
It is called an "iterator" because "iterating" is the technical term for looping.
To use an Iterator, you must import it from the java.util package.
 */
public class C2iterator {

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        ArrayList<String>  a=new ArrayList<String>();
        a.add("gopal");
        a.add("rahul");

        Iterator<String> x=a.iterator();

        while(x.hasNext()){
            System.out.println(x.hasNext());
            System.out.println(x.next());

            /*
Condition (iterator.hasNext()):
The while loop continues as long as hasNext() returns true, meaning there are more elements to iterate over.Retrieving Elements .

(iterator.next()):
Inside the loop, next() is called to get the next element in the iteration.The retrieved element is stored in the variable element.
             */
        }
    }

}
