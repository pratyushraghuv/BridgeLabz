public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // Will throw NullPointerException
    }

    public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Handled NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Uncomment one at a time
        // generateException(); 
        handleException();
    }
}