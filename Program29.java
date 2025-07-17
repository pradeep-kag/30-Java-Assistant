interface Taxable {
    void payTax();
}

abstract class Person {
    abstract void display();
}

class Employee extends Person implements Taxable {
    public void display() {
        System.out.println("Employee Details");
    }

    public void payTax() {
        System.out.println("Tax Paid");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
        e.payTax();
    }
}
