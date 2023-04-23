package People;

public class Cashier extends Person {
    protected int salary;

    public Cashier(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println(name + "'s salary is " + salary);
        System.out.println();
    }
}

