package W3school.java.tutorials;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
First, the pattern is created using the Pattern.compile() method. The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive. The second parameter is optional.

The matcher() method is used to search for the pattern in a string. It returns a Matcher object which contains information about the search that was performed.

The find() method returns true if the pattern was found in the string and false if it was not found.
*/

public class C4RegExpatterns {

    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        Pattern a=Pattern.compile("gopal", Pattern.CASE_INSENSITIVE);
        Matcher b=a.matcher("GOPAL");

        //System.out.println(b);
        boolean x=b.find();
        if(x){
            System.out.println("Match Found");
        }else{
            System.out.println("No Match Found");
        }
    }
}
