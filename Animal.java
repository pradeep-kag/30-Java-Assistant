interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }

    public static void main(String[] args) {
        new Dog().sound();
    }
}
