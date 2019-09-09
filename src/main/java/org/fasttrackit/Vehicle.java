package org.fasttrackit;


public class Vehicle {
    //Denumire constante = DENUMIRE_CONSTANTA

    private static int totalCount;

    private String name;
    private double mileage;
    private double maxSpeed;
    private String fuelType;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        System.out.println(name + " is accelerating with " + speed + " km/h for " + durationInHours + " h. ");

        double distance = speed * durationInHours;

        System.out.println("Distance: " + distance);

        traveledDistance = traveledDistance + distance;

        //traveled Distance += distance - same result

        double usedFuel = distance * mileage / 100;

        System.out.println("Used fuel: " + usedFuel);
        fuelLevel -= usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);


        return distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public static int getTotalCount() {
        return totalCount;
    }

    public void setRunning(boolean running) {
        this.running = running;


    }
}
