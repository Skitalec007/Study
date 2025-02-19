public class Example {
    public int number;
    public static String name;

    public void printMessage() {
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.printMessage();
    }
}