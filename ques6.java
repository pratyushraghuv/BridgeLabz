class Demo {
    int value; // Instance variable

    void setValue(int value) {
        this.value = value; // 'this.value' refers to instance variable, 'value' is local variable
    }

    void printValue() {
        System.out.println("Instance variable value: " + value);
    }
}

public class ques6 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.setValue(50);
    }
}