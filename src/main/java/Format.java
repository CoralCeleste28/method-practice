public class Format {
    public static void main(String[] args) {
        String firstName = "Coral";
        String lastName = "Estrada";
        String wholeName = formatName(firstName,lastName);
        System.out.println(wholeName);
    }

    public static String formatName (String first, String last) {
        String name = last + ", " + first;

        return name;
    }





}
