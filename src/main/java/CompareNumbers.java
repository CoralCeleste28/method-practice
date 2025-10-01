public class CompareNumbers {
    public static void main(String[] args) {
    int number = 5;
        System.out.println(isEven(number)); // print the output of the isEven method with the variable inserted
        System.out.println(isPositive(number)); // print the output of the isPositive method with the variable inserted
    }

    public static boolean isEven(int number) { // isEven method with the int number as a parameter
        if (number % 2 == 0) { // if number divided by two has a remainder of zero (A way to check if a number is even)
            return true;  // then make the output true
        } else { // if th number is anything else
            return false; // then make the output false
        }
    }

    public static boolean isPositive(double number) {
        // isPositive method with a double as a parameter. The boolean means this method will have a true or false output
        if (number > 0) { // if number is greater than zero
            return true; //then the output of the method is true
        } else { //if the number is anything else
            return false; // then make the output false
        }
    }






}
