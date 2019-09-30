package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {

        Game game = new Game();
        game.start();

//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//        engine.capacity = 1600;
//
//
//        Car car = new Car(engine);
//        car.setName ("Dacia");
//        car.setFuelLevel(60);
//        car.setMileage(8.5);
//        car.doorCount = 5;
//        car.setMaxSpeed(180);
//        car.setFuelType("Gasoline");
//
//        System.out.println("Car object: " + car.toString());
//
//
//        System.out.println(car.getName());
//        System.out.println(car.getTraveledDistance());
//        System.out.println(car.isRunning());
//
//        car.accelerate(60, 1);
//
//        Engine engine2 = new Engine();
//                engine2.manufacturer = "VW";
//                engine2.capacity = 1600;
//
//
//
//        Car car2 = new Car(engine2);
//        car2.setName("Golf");
//        car2.setFuelLevel(55);
//        car2.setMileage(7.5);
//        car2.setMaxSpeed(195);
//        car2.setFuelType("Diesel");
//        car2.doorCount = 3;
//
//        car.setName("Skoda");
//
////        car.name = null;
//
//        //concatenare = lipire cu operatorul +
//        System.out.println("Car2 name: " + car2.getName());
//        System.out.println("Car1 name: " + car.getName());
//
//       // car = car2;
//        System.out.println("Modulo examples:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        System.out.println("Please enter some text");
//        Scanner scanner = new Scanner(System.in);
//        String text = scanner.nextLine();
//        System.out.println("Imput from user: " + text);
//
////        System.out.println("Static variables example:");
////        //we should only call static variables from the class itself (Car),
////        //not from a variable containing an objectof that class
////
////        car.totalCount = 1;
////
////        System.out.println("Total count in car: " + car.totalCount);
////
////        car2.totalCount = 12;
////        System.out.println("Total count in car after setting car2: " + car.totalCount);
////        System.out.println("Total count in car2: " + car2.totalCount);
////        System.out.println("Total count in Car class: " + Car.totalCount);

//        Vehicle hybridCar = new HybridCar();
//        hybridCar.setName("cheater");
//
//        //method implementation is from object's class not from variable's class
//
//        hybridCar.accelerate(60, 1);
//        System.out.println("Fuel level: " + hybridCar.getFuelLevel());
//        System.out.println("Traveled distance: " + hybridCar.getTraveledDistance());
//
//        //variable type decides what methods can be invoked,
//        //tipul obiectului decide implementarea metodei
//
//        //type casting
//        //Asa anunti ca hybridCar sa foloseasca metoda din HybridCar si nu din Vehicle
//        ((HybridCar) hybridCar).fly();


    }
}
