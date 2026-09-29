public class typecasting {
    public static void main(String[] args) {
        int number = 10;
        double decimal = number;
        System.out.println("Integer: " + number);
        System.out.println("Double: " + decimal);
        double value = 10.75;
        int converted = (int) value;
        System.out.println("Original: " + value);
        System.out.println("Converted: " + converted);

    }
}