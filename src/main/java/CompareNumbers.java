public class CompareNumbers {
    public static void main(String[] args) {
    int number = -5;
        System.out.println(isEven(number));
        System.out.println(isPositive(number));



    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }     // even


    }

    public static boolean isPositive(double number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }

    }






}
