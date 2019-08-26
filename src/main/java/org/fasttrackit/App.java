package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {


            Car car = new Car();
            car.name = "Dacia";
            car.fuelLevel = 60;
            car.mileage = 8.5;
            car.doorCount = 5;
            car.maxSpeed = 180;
            car.fuelType = "Gasoline";

            Engine engine = new Engine();
            engine.manufacturer = "Renault";
            engine.capacity = 1600;

            car.engine = engine;

        System.out.println(car.name);
        System.out.println(car.travelDistance);
        System.out.println(car.running);


        Car car2 = new Car();
        car2.name = "Golf";
        car2.fuelLevel = 55;
        car2.mileage = 7.5;
        car2.doorCount = 3;
        car2.maxSpeed = 195;
        car2.fuelType = "Diesel";

        car.name = "Skoda";

//        car.name = null;

        //concatenare = lipire cu operatorul +
        System.out.println("Car2 name: " + car2.name);
        System.out.println("Car1 name: " + car.name);

        car = car2;





    }
}
