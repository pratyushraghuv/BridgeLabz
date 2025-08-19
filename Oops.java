
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
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
    }
}