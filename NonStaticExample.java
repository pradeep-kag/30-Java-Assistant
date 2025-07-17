public class NonStaticExample {
    void greet() {
        System.out.println("Hello from non-static method!");
    }

    public static void main(String[] args) {
        NonStaticExample obj = new NonStaticExample();
        obj.greet();
    }
}
