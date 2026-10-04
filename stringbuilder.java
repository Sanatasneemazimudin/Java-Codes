public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder("Hello");
        text.append(" Java");
        System.out.println(text);
        text.insert(6, "World ");
        System.out.println(text);
        text.reverse();
        System.out.println(text);
    }
}