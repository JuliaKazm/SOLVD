package People;
public class Employee extends Person {
    private int employeeId;
    private String department;
    private double salary;

    public Employee(String name, int age, String address, int employeeId, String department, double salary) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}