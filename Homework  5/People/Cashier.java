package People;

public class Cashier extends Person {
    protected int salary;
    private static int numberOfCashiers =0;

    static {
        System.out.println("Initializing Cashier class...");
        numberOfCashiers = 0;
    }

    public Cashier(String name, int age, int salary) throws InvalidSalaryException, InvalidAgeException {
        super(name, age);
        if (salary < 10000 || salary > 50000) {
            throw new InvalidSalaryException();
        }
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

