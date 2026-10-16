import java.util.ArrayList;
import java.util.Iterator;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> languages =
                new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        Iterator<String> iterator =
                languages.iterator();
        while (iterator.hasNext()) {
            System.out.println(
                    iterator.next()
            );
        }
    }
}