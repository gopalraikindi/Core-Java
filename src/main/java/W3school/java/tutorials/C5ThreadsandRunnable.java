package W3school.java.tutorials;

/*
Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.

There are two ways to create a thread.
It can be created by extending the Thread class and overriding its run() method:
 */
public class C5ThreadsandRunnable extends Thread {
    public static void main(String[] args) {
        C5ThreadsandRunnable a=new C5ThreadsandRunnable();
        gopal b=new gopal();
        a.run();
        b.run();
    }
    public void run(){
        System.out.println("Hi , i am gopal");
    }

}


//Another way to create a thread is to implement the Runnable interface:
 class gopal implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

/*
Differences between "extending" and "implementing" Threads:
The major difference is that when a class extends the Thread class, you cannot extend any other class, but by implementing the Runnable interface,
it is possible to extend from another class as well, like: class MyClass extends OtherClass implements Runnable.
 */
