import People.Employee;
import People.Person;
import People.Manager;
import People.Supplier;
import People.Worker;
import Products.Dairy;
import Products.Milk;
import Products.Cheese;
import Products.Yogurt;
import Products.Butter;

    public class Main {
        public static void main(String[] args) {

            Person person = new Person("Angelina Jolie", 30, "815 Jog St.");
            Employee employee = new Employee("Julia Roberts", 25, "115 Military St.", 1001, "Sales", 54000.0);
            Supplier supplier = new Supplier("Brad Pitt", 40, "79 Palmetto St.", 2001, "CocaCola Inc.", "artificial colors");
            Worker worker = new Worker("Julia Kazmina", 35, "57 Maple Ave.", 1002, "Production", 85000.0, 1, true, "Lathe");
            Manager manager = new Manager("Jose Canavire", 45, "515 Pine St.", 1003, "Operations", 110000.0, "Quality Assurance", true, "ISO 9001 Certification");

            System.out.println("Person:");
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress());
            System.out.println();

            System.out.println("Employee:");
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Address: " + employee.getAddress());
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println();

            System.out.println("Supplier:");
            System.out.println("Name: " + supplier.getName());
            System.out.println("Age: " + supplier.getAge());
            System.out.println("Address: " + supplier.getAddress());
            System.out.println("Supplier ID: " + supplier.getSupplierId());
            System.out.println("Company: " + supplier.getCompany());
            System.out.println("Product: " + supplier.getProduct());
            System.out.println();

            System.out.println("Worker:");
            System.out.println("Name: " + worker.getName());
            System.out.println("Age: " + worker.getAge());
            System.out.println("Address: " + worker.getAddress());
            System.out.println("Employee ID: " + worker.getEmployeeId());
            System.out.println("Department: " + worker.getDepartment());
            System.out.println("Salary: " + worker.getSalary());
            System.out.println("Shift: " + worker.getShift());
            System.out.println("Trained: " + worker.isTrained());
            System.out.println("Machine: " + worker.getMachine());
            System.out.println();

            System.out.println("Manager:");
            System.out.println("Name: " + manager.getName());
            System.out.println("Age: " + manager.getAge());
            System.out.println("Address: " + manager.getAddress());
            System.out.println("Employee ID: " + manager.getEmployeeId());
            System.out.println("Department: " + manager.getDepartment());
            System.out.println("Salary: " + manager.getSalary());
            System.out.println("Team: " + manager.getTeam());
            System.out.println("Executive: " + manager.isExecutive());
            System.out.println("Project: " + manager.getProject());
            System.out.println();

            Butter butter = new Butter("Brand Kerry-gold", "Dairy Farm K", 10);
            Cheese cheese = new Cheese("Brand Kerry-gold", "Dairy Farm K", "Cheddar");
            Milk milk = new Milk("Brand Kerry-gold", "Dairy Farm K", 3);
            Yogurt yogurt = new Yogurt("Brand Kerry-gold", "Dairy Farm K", "Strawberry");

            System.out.println("Butter: " + butter.getName() + ", " + butter.getLocation() + ", salt content: " + butter.getSaltContent());
            System.out.println();
            System.out.println("Cheese: " + cheese.getName() + ", " + cheese.getLocation() + ", type: " + cheese.getType());
            System.out.println();
            System.out.println("Milk: " + milk.getName() + ", " + milk.getLocation() + ", fat content: " + milk.getFatContent());
            System.out.println();
            System.out.println("Yogurt: " + yogurt.getName() + ", " + yogurt.getLocation() + ", flavor: " + yogurt.getFlavor());

        }
    }

