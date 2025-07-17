class Parent {
    int value = 50;
}

class Child extends Parent {
    void display() {
        System.out.println("Value from Parent: " + super.value);
    }

    public static void main(String[] args) {
        new Child().display();
    }
}
