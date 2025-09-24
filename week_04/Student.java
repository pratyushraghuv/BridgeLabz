package week_04;

public class Student {
    private static String universityName;
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.printf("University Name: %s%nRoll Number: %d%nName: %s%nGrade: %c%n%n",
            universityName, rollNumber, name, grade);
    }

    public void updateGrade(char newGrade) {
        grade = newGrade;
        System.out.println("Grade updated to: " + newGrade);
    }

    public static void main(String[] args) {
        setUniversityName("Global University");

        Student student1 = new Student("Hemashree", 101, 'A');
        Student student2 = new Student("Sharmila", 102, 'B');

        displayTotalStudents();
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        student2.updateGrade('A');
        System.out.println();
        student2.displayStudentDetails();
    }
}