package Lab7;
class Vehicle {
    String brand;
    int wheels;
    Vehicle(String brand, int wheels) {
        this.brand = brand;
        this.wheels = wheels;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
    }
    void maxSpeed() {
        System.out.println("Max speed not defined for Vehicle");
    }
}
class Car extends Vehicle {
    int speed;
    Car(String brand, int wheels, int speed) {
        super(brand, wheels);  
        this.speed = speed;
    }
    void maxSpeed() {
        System.out.println("Car Max Speed: " + speed + " km/h");
    }
}
class Bicycle extends Vehicle {
    int speed;
    Bicycle(String brand, int wheels, int speed) {
        super(brand, wheels);
        this.speed = speed;
    }
    void maxSpeed() {
        System.out.println("Bicycle Max Speed: " + speed + " km/h");
    }
}
class Scooter extends Vehicle {
    int speed;
    Scooter(String brand, int wheels, int speed) {
        super(brand, wheels);
        this.speed = speed;
    }
    void maxSpeed() {
        System.out.println("Scooter Max Speed: " + speed + " km/h");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Car c = new Car("Honda", 4, 180);
        Bicycle b = new Bicycle("Hero", 2, 40);
        Scooter s = new Scooter("Activa", 2, 90);
        System.out.println("Car Details:");
        c.display();
        c.maxSpeed();
        System.out.println("\nBicycle Details:");
        b.display();
        b.maxSpeed();
        System.out.println("\nScooter Details:");
        s.display();
        s.maxSpeed();
    }
}