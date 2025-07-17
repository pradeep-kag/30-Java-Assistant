class Helper {
    static void message() {
        System.out.println("Called from another class");
    }
}

public class StaticCaller {
    public static void main(String[] args) {
        Helper.message();
    }
}
