public class OverloadExample {
    void display() {
        System.out.println("No parameters");
    }

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display();
        obj.display("John");
        obj.display(25, "Alice");
    }
}
