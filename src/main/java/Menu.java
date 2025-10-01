public class Menu {
    public static void main(String[] args) {
        diplayMenu(); // runs the displayMenu method without parameters
        diplayMenu(); // runs the displayMenu method without parameters again

    }
    public static void diplayMenu() { // method named displayMenu
        System.out.println("""
                === MENU ===
                1. Coffee - $3.99
                2. Tea - $2.99
                3. Cookie - $1.99""");
    }
}
