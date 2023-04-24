import java.util.Objects;
import People.*;
import Products.*;

public class Main {
        public static void main(String[] args) {

                Person p = new Person("Julia", 30);
                p.sayHello();
                System.out.println();
                Person julia = new Person("Julia", 30);
                System.out.println(julia.toString());
                System.out.println();
                System.out.println("p.equals(julia): " + p.equals(julia));
                System.out.println();
                System.out.println("p.hashCode(): " + p.hashCode());
                System.out.println();

                Cashier c = new Cashier("Mia", 25, 45000);
                c.sayHello();
                c.printSalary();
                System.out.println();
                Cashier c1 = new Cashier("Tom", 25, 29000);
                Cashier c2 = new Cashier("Jerry", 30, 30000);
                Cashier c3 = new Cashier("Bella", 20, 30000);

                System.out.println("Number of cashiers: " + Cashier.getNumberOfCashiers());
                c.printSalary();
                c1.printSalary();
                c2.printSalary();
                c3.printSalary();
                System.out.println();

                Worker w = new Worker("Tom", 35, 8);
                w.sayHello();
                w.printSalary();

                Director d = new Director("Jose", 45, 50000);
                d.sayHello();
                d.printSalary();

                Manager m = new Manager("Anya", 40, 20000);
                m.sayHello();
                m.printSalary();

                Dairy[] dairyArray = new Dairy[3];
                Butter butter = new Butter("Brand Kerry-gold", "Dairy Farm K", 10, 2);
                Cheese cheese = new Cheese("Brand Kerry-gold", "Dairy Farm K", "Cheddar", 30);
                Milk milk = new Milk("Brand Kerry-gold", "Dairy Farm K", 1);
                Yogurt yogurt = new Yogurt("Brand Kerry-gold", "Dairy Farm K", "Strawberry", 10);

                dairyArray[0] = butter;
                dairyArray[1] = cheese;
                dairyArray[2] = yogurt;

                for (Dairy dairy : dairyArray) {
                System.out.println(dairy.getName() + " is stored in " + dairy.getLocation());

                if (dairy instanceof FatContent) {
                    FatContent fatContentDairy = (FatContent) dairy;
                    fatContentDairy.fat();
                }
                System.out.println();
                }

                System.out.println("Butter: " + butter.getName() + ", " + butter.getLocation() + ", salt content: " + butter.getSaltContent());
                butter.fat();
                System.out.println();
                System.out.println("Cheese: " + cheese.getName() + ", " + cheese.getLocation() + ", type: " + cheese.getType());
                cheese.fat();
                System.out.println();
                System.out.println("Milk: " + milk.getName() + ", " + milk.getLocation() + ", fat content: " + milk.getFatContent());
                milk.fat();
                System.out.println();
                System.out.println("Yogurt: " + yogurt.getName() + ", " + yogurt.getLocation() + ", flavor: " + yogurt.getFlavor());
                yogurt.fat();
                System.out.println();

                Butter1 butter1 = new Butter1("yellow", 7, 5);
                System.out.println("Butter1 color: " + butter1.getColor());
                System.out.println("Butter1 width: " + butter1.getWidth());
                System.out.println("Butter1 height: " + butter1.getHeight());

                double area = butter1.getArea();
                System.out.println("Area of square Butter1: " + area);
                System.out.println();

                Cheese1 cheese1 = new Cheese1("white", 5);
                System.out.println("Cheese1 color: " + cheese1.getColor());
                System.out.println("Cheese1 Radius :" + cheese1.getRadius());
                System.out.println("Area of Round Cheese1: " + cheese1.getArea());

        }
    }


