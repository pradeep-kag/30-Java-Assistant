class Parent {
    void show() {
        System.out.println("Parent show");
    }
}

class Child extends Parent {
    void show() {
        super.show();
        System.out.println("Child show");
    }

    public static void main(String[] args) {
        new Child().show();
    }
}
