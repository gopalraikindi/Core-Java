package litquetions;

public class Findlowestage {

    public static void main(String[] args) {

        int[] ages={97,20,25,37,42,13,89};

         int  lowestage=ages[0];

         for(int age:ages){
             //System.out.println(age);97,20,25,37,42,13,89

             if(lowestage>age){
                // System.out.println(age);

                 lowestage=age;
             }

         }

        System.out.println(lowestage);


    }
}
