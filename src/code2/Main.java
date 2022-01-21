package code2;

public class Main {
    public static void main(String args[]){

    }
}

interface IEngine{
    public void engineOn();
}

interface AcceleratingCar{
    public void accelerate();
}

class AccelerateCar implements AcceleratingCar{

    @Override
    public void accelerate() {
        System.out.println("accelerating the car..");
    }
}

class Car{
    public IEngine engine;
    Car(IEngine engine){
        this.engine=engine;
    }
    public void engineOn() {
        engine.engineOn();
    }
}

class FuelCar extends Car{

    FuelCar(Engine engine) {
        super(engine);
    }

    public void fillTank(){
        System.out.println("filling the tank..");
    }
}

class Tesla extends Car{

    Tesla(Engine engine) {
        super(engine);
    }
    public void chargeCar(){
        System.out.println("charging the car..");
    }
}

class Engine implements IEngine{

    @Override
    public void engineOn() {
        System.out.println("starting the engine..");
    }
}
