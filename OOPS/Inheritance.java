package OOPS;

class vehicle {
    String numberOfVehicle;

    public vehicle(String numberOfVehicle) {
        this.numberOfVehicle = numberOfVehicle;
    }

    public void printNumber() {
        System.out.println("The number of the vehicle is: " + numberOfVehicle);
    }

    public void honk() {
        System.out.println("HONK!!!!");
    }

}

class Car extends vehicle {
    Car(String numberOfCar) {
        super(numberOfCar);
    }

    @Override // POLY-MORPHISM;
    public void honk() {
        System.out.println("MOVE ASIDE!!!");
    }
}

class Bus {
    private String busNumber;

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public void getBusNumber() {
        System.out.println("The number of the bus is: " + busNumber);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car car = new Car("UP32KL5113");
        car.honk();
        car.printNumber();

        Bus bus = new Bus();
        bus.setBusNumber("UP32IO1234");
        bus.getBusNumber();
    }
}