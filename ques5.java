class Counter {
    static int count = 0;

    void increment() {
        count++;
    }
}

public class ques5 {
    public static void main(String[] args) {
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();

        obj1.increment(); 
        System.out.println("Count from obj2: " + obj2.count); 

        obj2.increment(); 
        System.out.println("Count from obj1: " + obj1.count);
    }
}