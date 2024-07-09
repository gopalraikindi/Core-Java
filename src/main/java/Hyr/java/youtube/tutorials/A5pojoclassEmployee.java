package Hyr.java.youtube.tutorials;

//this pojo class made by using getters and setters without constructor
// private fields we can access in 2 ways , either by constructor or using getter and setter methods .

public class A5pojoclassEmployee {

    private int id;
    private String name;
    public double salary;

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





















