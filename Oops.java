class Car {
    String model;
    int year;
    static int numberOfCars = 0;
    Car(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++; 
    }
    void displayDetails() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}
public class Oops {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota Camry", 2017);
        Car car2 = new Car("Honda Accord", 2015);
        car1.displayDetails();
        car2.displayDetails();
        System.out.println("Number of cars: " + Car.numberOfCars);
    }
}