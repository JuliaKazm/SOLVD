package People;

public class Manager extends Employee {
    private String team;
    private boolean isExecutive;
    private String project;

    public Manager(String name, int age, String address, int employeeId, String department, double salary, String team, boolean isExecutive, String project) {
        super(name, age, address, employeeId, department, salary);
        this.team = team;
        this.isExecutive = isExecutive;
        this.project = project;
    }
    public String getTeam() {
        return team;
    }

    public void setTeam(int shift) {
        this.team = team;
    }

    public boolean isExecutive() {
        return isExecutive;
    }

    public void isExecutive(boolean executive) {
        isExecutive = executive;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String machine) {
        this.project = project;
    }
}