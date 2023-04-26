package People;

public class Manager extends Person {
    protected int allowance;

    public Manager(String name, int age, int allowance) throws InvalidAllowanceException, InvalidAgeException {
        super(name, age);
        if (allowance < 10000 || allowance > 30000) {
            throw new InvalidAllowanceException();
        }
        this.allowance = allowance;
    }

    public void printSalary() {
        int salary = 75000 + allowance;
        System.out.println(name + "'s salary is " + salary);
        System.out.println();
    }
}