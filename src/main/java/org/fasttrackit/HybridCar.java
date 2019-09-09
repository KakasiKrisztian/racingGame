package org.fasttrackit;

public class HybridCar extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating with " + speed + " for " + durationInHours + "h");
        double actualSpeed = 2 * speed;
        double distance = actualSpeed * durationInHours;

        setTraveledDistance(getTraveledDistance() + actualSpeed);

        System.out.println("Cheater!!!");
        return distance;



        }
        //co-variant return type - metoda suprascrisa poate fi un sub tip de al metodei
    // de exemplu hybridcar in loc de clone (object)

    @Override
    protected HybridCar clone() throws CloneNotSupportedException {
        return new HybridCar();
    }

    public void fly() {
        System.out.println("Yeey! Flying!");
    }
}

