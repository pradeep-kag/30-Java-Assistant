class Parent {
    void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    void wish() {
        System.out.println("Good Luck from Child");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        c.wish();
    }
}
