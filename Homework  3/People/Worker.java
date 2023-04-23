package People;

public class Worker extends Person {
    protected int hours;

    public Worker(String name, int age, int hours) {
        super(name, age);
        this.hours = hours;
    }

    public void printSalary() {
        int salary = hours * 15;
        System.out.println(name + "'s salary per days is " + salary);
        System.out.println();
    }
}