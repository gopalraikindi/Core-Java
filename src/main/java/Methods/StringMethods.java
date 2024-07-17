package Methods;
public class StringMethods {
    static String s = "gopal";

    public static void main(String[] args) {
        method1();  // length()
        method2();  // charAt(int index)
        method3();  // substring(int beginIndex)
        method4();  // substring(int beginIndex, int endIndex)
        method5();  // contains(CharSequence s)
        method6();  // equals(Object anObject)
        method7();  // equalsIgnoreCase(String anotherString)
        method8();  // startsWith(String prefix)
        method9();  // endsWith(String suffix)
        method10(); // indexOf(int ch)
        method11(); // indexOf(String str)
        method12(); // lastIndexOf(int ch)
        method13(); // lastIndexOf(String str)
        method14(); // toUpperCase()
        method15(); // toLowerCase()
        method16(); // trim()
        method17(); // replace(char oldChar, char newChar)
        method18(); // replace(CharSequence target, CharSequence replacement)
        method19(); // isEmpty()
        method20(); // split(String regex)
        method21(); // concat(String str)
        method22(); // compareTo(String anotherString)
    }

    public static void method1() {
        int len = s.length();
        System.out.println(len); // Expected output: 5
    }

    public static void method2() {
        char c = s.charAt(0);
        System.out.println(c); // Expected output: 'g'
    }

    public static void method3() {
        String s1 = s.substring(3);
        System.out.println(s1); // Expected output: "al"
    }

    public static void method4() {
        String s1 = s.substring(1, 4);
        System.out.println(s1); // Expected output: "opa"
    }

    public static void method5() {
        boolean contains = s.contains("op");
        System.out.println(contains); // Expected output: true
    }

    public static void method6() {
        boolean equals = s.equals("gopal");
        System.out.println(equals); // Expected output: true
    }

    public static void method7() {
        boolean equalsIgnoreCase = s.equalsIgnoreCase("GOPAL");
        System.out.println(equalsIgnoreCase); // Expected output: true
    }

    public static void method8() {
        boolean startsWith = s.startsWith("go");
        System.out.println(startsWith); // Expected output: true
    }

    public static void method9() {
        boolean endsWith = s.endsWith("pal");
        System.out.println(endsWith); // Expected output: true
    }

    public static void method10() {
        int indexOf = s.indexOf('p');
        System.out.println(indexOf); // Expected output: 2
    }

    public static void method11() {
        int indexOf = s.indexOf("pa");
        System.out.println(indexOf); // Expected output: 2
    }

    public static void method12() {
        int lastIndexOf = s.lastIndexOf('p');
        System.out.println(lastIndexOf); // Expected output: 2
    }

    public static void method13() {
        int lastIndexOf = s.lastIndexOf("pa");
        System.out.println(lastIndexOf); // Expected output: 2
    }

    public static void method14() {
        String upperCase = s.toUpperCase();
        System.out.println(upperCase); // Expected output: "GOPAL"
    }

    public static void method15() {
        String lowerCase = s.toLowerCase();
        System.out.println(lowerCase); // Expected output: "gopal"
    }

    public static void method16() {
        String trimmed = s.trim();
        System.out.println(trimmed); // Expected output: "gopal"
    }

    public static void method17() {
        String replaced = s.replace('o', 'a');
        System.out.println(replaced); // Expected output: "gapal"
    }

    public static void method18() {
        String replaced = s.replace("opal", "ocean");
        System.out.println(replaced); // Expected output: "gocean"
    }

    public static void method19() {
        boolean isEmpty = s.isEmpty();
        System.out.println(isEmpty); // Expected output: false
    }

    public static void method20() {
        String[] parts = s.split("o");
        for (String part : parts) {
            System.out.println(part); // Expected output: "g" and "pal"
        }
    }

    public static void method21() {
        String concatenated = s.concat("xyz");
        System.out.println(concatenated); // Expected output: "gopalxyz"
    }

    public static void method22() {
        int compareTo = s.compareTo("gopal");
        System.out.println(compareTo); // Expected output: 0
    }
}