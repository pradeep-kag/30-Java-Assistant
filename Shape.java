abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    public void area() {
        System.out.println("Area of Circle");
    }
}

class Rectangle extends Shape {
    public void area() {
        System.out.println("Area of Rectangle");
    }
}

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}
