public class Staff {
    String name;
    double salary;

    Staff(String n, double s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Staff st = new Staff("John", 30000);
        st.display();
    }
}
