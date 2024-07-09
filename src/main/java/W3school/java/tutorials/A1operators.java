package W3school.java.tutorials;

public class A1operators {
    public static void main(String[] args){
        firstmethod();
        secondmethod();
        thirdmethod();
        fifthmethod(50 , 60);
        fourthmethod();


    }

    public static void firstmethod(){
        int sum1 = 100 + 50;
        int sum2 = sum1 + 250;
        int sum3 = sum2 + sum2;
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

    }

    // x += 3 , this means x=x+3
    //x*=3 , this means x=x*3
    public static void secondmethod(){
        int x = 5;
        x += 3;
        System.out.println(x);

    }




    public static void thirdmethod(){
        int x = 5;
        int y = 3;
        System.out.println(x > y);

    }

    // ==	Equal to	x == y
    // !=	Not equal	x != y
    //>	Greater than	x > y
    // <	Less than	    x < y
    //   >=	Greater than or equal to	x >= y
    //   <=	Less than or equal to	    x <= y

    public static void fifthmethod(int x ,int y) {

        if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is not equal to y");
        }


        if (x != y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is equal to y");
        }


        if (x > y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is equal to y");
        }
    }
        //string added to integere
        public static void fourthmethod() {
            String a = "10";
            int b = 20;
            String z = a + b;

            System.out.println(z);



    }


       // && 	Logical and	Returns true if both statements are true	            x < 5 &&  x < 10  &&--(and)--it works like 'and'
      //  || 	Logical or	Returns true if one of the statements is true	        x < 5 || x < 4    ||---(or)--it works like 'or'
      //  !	    Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)



}
