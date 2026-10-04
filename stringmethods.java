public class stringmethods {
    public static void main(String[] args) {
        String text = "Hello Java";
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: "
                + text.toUpperCase());
        System.out.println("Lowercase: "
                + text.toLowerCase());
        System.out.println("Character at index 1: "
                + text.charAt(1));
        System.out.println("Substring: "
                + text.substring(0, 5));
    }
}