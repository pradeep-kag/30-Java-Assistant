public class Chain {
    Chain() {
        this(100);
        System.out.println("Default Constructor");
    }

    Chain(int x) {
        System.out.println("Parameterized Constructor: " + x);
    }

    public static void main(String[] args) {
        new Chain();
    }
}
