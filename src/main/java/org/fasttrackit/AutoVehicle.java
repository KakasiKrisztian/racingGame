package org.fasttrackit;

public class AutoVehicle extends Vehicle {
    //has a relationship
    Engine engine;

   /* public AutoVehicle (Engine engine) {
        this.engine = engine;

    */
    //alt + insert

    public AutoVehicle(Engine engine) {
        this.engine = engine;
    }
    //constructor overloading
    public AutoVehicle() {
        this.engine = new Engine();

        //this(new Engine()); - acelasi efect ca linia de mai sus

    }

}
