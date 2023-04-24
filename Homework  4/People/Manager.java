package People;

public class Manager extends Person {
    protected int allowance;

    public Manager(String name, int age, int allowance) {
        super(name, age);
        this.allowance = allowance;
    }

    public void printSalary() {
        int salary = 75000 + allowance;
        System.out.println(name + "'s salary is " + salary);
        System.out.println();
    }
}