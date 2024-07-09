package Hyr.java.youtube.tutorials;

public class A9pojoclassEmployee {

    private int id = 0;
    public String name;
    protected double salary;

    public static void main(String[] args) {
        A9pojoclassEmployee employee = new A9pojoclassEmployee();
        employee.setId(1);
        employee.name = "John Doe";
        employee.salary = 50000.0;

        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.name);
        System.out.println("Salary: " + employee.salary);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}