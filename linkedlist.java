import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<String> languages =
                new LinkedList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.addFirst("C");
        languages.addLast("JavaScript");
        System.out.println(languages);
    }
}