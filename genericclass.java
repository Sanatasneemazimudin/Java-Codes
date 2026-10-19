public class genericclass {
    static class Box<T> {
        private T value;
        Box(T value) {
            this.value = value;
        }
        T getValue() {
            return value;
        }
    }
    public static void main(String[] args) {
        Box<Integer> integerBox =
                new Box<>(100);
        Box<String> stringBox =
                new Box<>("Hello");
        System.out.println(
                integerBox.getValue()
        );
        System.out.println(
                stringBox.getValue()
        );
    }
}