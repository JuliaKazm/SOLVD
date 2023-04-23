package People;

public class Worker extends Employee {
    private int shift;
    private boolean isTrained;
    private String machine;

    public Worker(String name, int age, String address, int employeeId, String department, double salary, int shift, boolean isTrained, String machine) {
        super(name, age, address, employeeId, department, salary);
        this.shift = shift;
        this.isTrained = isTrained;
        this.machine = machine;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }
}
