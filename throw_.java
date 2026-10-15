public class throw_{
    public static void main(String[] args) {
        int age = 16;
        if (age < 18) {
            throw new ArithmeticException(
                    "You must be 18 or older."
            );
        }
        System.out.println(
                "Eligible."
        );
    }
}