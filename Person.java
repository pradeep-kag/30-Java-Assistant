public class Person {
    String name;
    int age;

    Person() {
        name = "Unknown";
        age = 0;
    }

    Person(String n) {
        name = n;
        age = 0;
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        new Person().show();
        new Person("Alice").show();
        new Person("Bob", 25).show();
    }
}
