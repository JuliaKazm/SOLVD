package People;

public class Cashier extends Person {
    protected int salary;
    private static int numberOfCashiers =0;

    static {
        System.out.println("Initializing Cashier class...");
        numberOfCashiers = 0;
    }

    public Cashier(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
        numberOfCashiers++;
    }

    public void printSalary() {
        System.out.println(name + "'s salary is " + salary);
    }
    public static int getNumberOfCashiers() {
        return numberOfCashiers;
    }
}

