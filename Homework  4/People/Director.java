package People;

public final class Director extends Person {
    protected final int bonus;

    public Director(String name, int age, int bonus) {
        super(name, age);
        this.bonus = bonus;
    }
    public final void printSalary() {
        int salary = 80000 + bonus;
        System.out.println(name + "'s salary is " + salary);
        System.out.println();
    }
}
