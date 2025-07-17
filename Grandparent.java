class Grandparent {
    void greet() {
        System.out.println("Hello from Grandparent");
    }
}

class Parent extends Grandparent {
    void welcome() {
        System.out.println("Welcome from Parent");
    }
}

class Child extends Parent {
    void hello() {
        System.out.println("Hello from Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        c.welcome();
        c.hello();
    }
}
