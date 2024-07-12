package Hyr.java.youtube.tutorials;

public class A3methodcreation {

     static int currentbalance=1000;
    public static void main(String[] args){
        deposit();
        checkbalance();
        deposit1(500);
        withdraw(300);
        checkbalance();


    }

    public  static void deposit(){
        int a=500;
        currentbalance=currentbalance+a;
        System.out.println(currentbalance);

    }

    public  static void deposit1(int amount){
        currentbalance=currentbalance+500;
        System.out.println(currentbalance);

    }

    public static void withdraw(int amount){

        currentbalance=currentbalance-amount;
        System.out.println(currentbalance);
    }

    public static int checkbalance(){
        System.out.println(currentbalance);

        return currentbalance;
    }

}
