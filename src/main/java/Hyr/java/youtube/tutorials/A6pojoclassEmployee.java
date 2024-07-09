package Hyr.java.youtube.tutorials;

//this pojo class made by using getters and setters with constructor
//using constructor we can make pojo class in two ways , this is the first way .


public class A6pojoclassEmployee {

    private int id;
    private String name;
    public double salary;


// constructor does not have a return type . constructor naming convention should be same as the class name .

    public A6pojoclassEmployee(int id,String name,double salary) {
        this.id = id;
        this.name=name;
        this.salary=salary;
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
