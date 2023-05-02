package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.People.*;
import org.example.Products.*;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) throws InvalidHoursException, InvalidSalaryException, InvalidAllowanceException, InvalidAgeException {

        Person p = new Person("Julia", 30);
        p.sayHello();
        System.out.println();
        Person julia = new Person("Julia", 30);
        logger.info(julia.toString());
        System.out.println();
        logger.info("p.equals(julia): " + p.equals(julia));
        System.out.println();
        logger.info("p.hashCode(): " + p.hashCode());
        System.out.println();

        Cashier c = new Cashier("Mia", 25, 45000);
        c.sayHello();
        c.printSalary();
        System.out.println();
        Cashier c1 = new Cashier("Tom", 25, 29000);
        Cashier c2 = new Cashier("Jerry", 30, 30000);
        Cashier c3 = new Cashier("Bella", 20, 30000);

        logger.info("Number of cashiers: " + Cashier.getNumberOfCashiers());
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

        Manager m = new Manager("Anya", 39, 20000);
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

        logger.info("Butter: " + butter.getName() + ", " + butter.getLocation() + ", salt content: " + butter.getSaltContent());
        butter.fat();
        System.out.println();
        logger.info("Cheese: " + cheese.getName() + ", " + cheese.getLocation() + ", type: " + cheese.getType());
        cheese.fat();
        System.out.println();
        logger.info("Milk: " + milk.getName() + ", " + milk.getLocation() + ", fat content: " + milk.getFatContent());
        milk.fat();
        System.out.println();
        logger.info("Yogurt: " + yogurt.getName() + ", " + yogurt.getLocation() + ", flavor: " + yogurt.getFlavor());
        yogurt.fat();
        System.out.println();

        Butter1 butter1 = new Butter1("yellow", 7, 5);
        logger.info("Butter1 color: " + butter1.getColor());
        logger.info("Butter1 width: " + butter1.getWidth());
        logger.info("Butter1 height: " + butter1.getHeight());

        double area = butter1.getArea();
        logger.warn("Area of square Butter1: " + area);
        System.out.println();

        Cheese1 cheese1 = new Cheese1("white", 5);
        logger.info("Cheese1 color: " + cheese1.getColor());
        logger.info("Cheese1 Radius :" + cheese1.getRadius());
        logger.info("Area of Round Cheese1: " + cheese1.getArea());
        System.out.println();

        logger.warn("HELLO MAVEN!");
        System.out.println();

        LinkedListExample<String> list = new LinkedListExample<>();
        list.add("Milk");
        list.add("Cream");
        list.add("Butter");
        list.add("Cheese");
        list.add("Cheddar");
        list.add("Blue Cheese");
        logger.info("Original list: " + list);

        list.remove("Butter");
        logger.info("List after removing Butter: " + list);

        String cream = list.get(2);
        logger.info("Cream: " + cream);
    }
}


