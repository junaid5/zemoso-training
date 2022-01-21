package com.company;

public class Main {

    public static void main(String[] args) {

        Car c= new Car(new Engine());
        Tesla t = new Tesla(new Engine());
        t.selfDrive();
    }
}

interface Cars{
    public void accelerate();
    public void fillTank();
    public void enginOn();
}

class Car implements Cars{
    public Engine e;

    public Car(Engine engine) {
        this.e = engine;
    }

    public void accelerate() {
        System.out.println("accelerating the car....");
    }

    public void fillTank() {
        System.out.print("filling the tank...");
    }

    @Override
    public void enginOn() {
        e.startEngine();
    }

}

class Tesla extends Car {
    public Tesla(Engine engine) {
        super(engine);
    }

    public void selfDrive() {
        System.out.println("self driving mode on.");
    }

}

class Engine {
    public void startEngine() {
        System.out.println("Starting engine...");
    }
}
