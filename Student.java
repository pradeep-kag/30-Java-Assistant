public class Student {
    String name;
    int age;

    void setDetails(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setDetails("Alice", 20);
        s.display();
    }
}
