package week_04;

public class Vehicle {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        } else {
            System.err.println("Invalid registration fee. Enter a non-negative value.");
        }
    }

    public void displayRegistrationDetails() {
        System.out.printf(
            "Owner Name: %s%nVehicle Type: %s%nRegistration Number: %s%nRegistration Fee: $%.1f%n%n",
            ownerName, vehicleType, registrationNumber, registrationFee
        );
    }

    public static void main(String[] args) {
        updateRegistrationFee(150.0);

        Vehicle vehicle1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle vehicle2 = new Vehicle("Price danish", "SUV", "XYZ789");

        vehicle1.displayRegistrationDetails();
        vehicle2.displayRegistrationDetails();
    }
}