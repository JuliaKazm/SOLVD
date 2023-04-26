package People;

public class Worker extends Person {
    protected int hours;

    public Worker(String name, int age, int hours) throws InvalidHoursException, InvalidAgeException {
        super(name, age);
        if (hours < 0 || hours > 24) {
            throw new InvalidHoursException();
        }
        this.hours = hours;
    }

    public void printSalary() {
        int salary = hours * 15;
        System.out.println(name + "'s salary per days is " + salary);
        System.out.println();
    }
}