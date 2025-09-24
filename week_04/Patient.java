package week_04;

public class Patient {
    private static String hospitalName;
    private static int totalPatients = 0;
    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        System.out.printf(
            "Hospital Name: %s%nPatient ID: %s%nName: %s%nAge: %d%nAilment: %s%n%n",
            hospitalName, patientID, name, age, ailment
        );
    }

    public static void main(String[] args) {
        setHospitalName("City Hospital");

        Patient patient1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient patient2 = new Patient("Lidiya", 45, "Fracture", "P002");

        System.out.println("Total Patients Admitted: " + getTotalPatients());
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();
    }
}
