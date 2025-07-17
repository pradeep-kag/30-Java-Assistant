public class Demo {
    int x;

    Demo(int x) {
        this.x = x;
    }

    void print() {
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        new Demo(100).print();
    }
}
