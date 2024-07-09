package Hyr.java.youtube.tutorials;


//this pojo class made by using getters and setters with constructor
//using constructor we can make pojo class in two ways , this is the second way .
public class A7pojoclassEmployee {

    private int id;
    private String name;
    public double salary;



    public A7pojoclassEmployee(){
        id=10;
        name="rahul";
        salary=55;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
