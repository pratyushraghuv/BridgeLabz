class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    void printData() {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }
}

public class ques4 {
    public static void main(String[] args) {
        Student s1 = new Student("raghu", 85);
        Student s2 = new Student("surya", 92);
        s1.printData();
        s2.printData();
    }
}