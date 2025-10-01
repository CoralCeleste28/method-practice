public class Format {
    public static void main(String[] args) {
        String firstName = "Coral";
        String lastName = "Estrada";
        String wholeName = formatName(firstName,lastName);
        // wholeName is equal to the output of method formatName with two variables inserted
        System.out.println(wholeName);
    }
    public static String formatName (String first, String last) {
        // formatName method. NOTE: The method returns a String.
        String name = last + ", " + first;
        return name; // output the name
    }
}
