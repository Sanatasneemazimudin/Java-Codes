public class finally_{
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println(
                    "Result: " + result
            );
        }
        catch (Exception e) {
            System.out.println(
                    "An error occurred."
            );
        }
        finally {
            System.out.println(
                    "Finally block executed."
            );
        }
    }
}