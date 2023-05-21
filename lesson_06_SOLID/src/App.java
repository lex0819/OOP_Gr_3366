import Liskov.*;
import engine.Auto;
import engine.DieselEngine;
import engine.PetrolEngine;
import vehicle.*;
import employee.*;
import shape.*;

import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {

        Employee employee01 = new Employee("Paul", new Date(1980, 3, 15), 1500);
        Calculate salary01 = new Calculate(employee01.getBaseSalary(), 13);
        System.out.println("========= employee ==========");
        System.out.println(employee01.getEmpInfo() + " получил " + salary01.calculateNetSalary() + "\n");


        Car car01 = new Car(120);
        Bus bus01 = new Bus(100);

        System.out.println("========= vehicles ==========");
        System.out.println("car " + car01.calculateAllowedSpeed());
        System.out.println("bus " + bus01.calculateAllowedSpeed() + "\n");

        Circle circle01 = new Circle(5);
        Cube cube01 = new Cube(4);

        System.out.println("========= shapes ==========");
        System.out.println("circle " + circle01.area());
        System.out.println("cube area " + cube01.area());
        System.out.println("circle volume " + cube01.volume() + "\n");


        Square square01 = new Square(11);
        Rectangle rectangle01 = new Rectangle(9, 7);


        System.out.println("========= Liskov ==========");
        System.out.println("square " + square01.area());
        System.out.println("rectangle " + rectangle01.area() + "\n");


        PetrolEngine petrol = new PetrolEngine();
        DieselEngine diesel = new DieselEngine();
        Auto auto01 = new Auto(petrol);
        Auto auto02 = new Auto(diesel);

        System.out.println("========= engines ==========");
        auto01.start();
        auto02.start();
    }
}
