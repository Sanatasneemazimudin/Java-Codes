import java.util.HashMap;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> students =
                new HashMap<>();
        students.put(101, "Sana");
        students.put(102, "Alex");
        students.put(103, "John");
        System.out.println(students);
        System.out.println(
                "Student 101: "
                        + students.get(101)
        );
    }
}