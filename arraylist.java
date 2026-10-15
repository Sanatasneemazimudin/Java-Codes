import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> students =
                new ArrayList<>();
        students.add("Sana");
        students.add("Alex");
        students.add("John");
        System.out.println(students);
        students.remove("Alex");
        System.out.println(students);
        System.out.println(
                "First student: "
                        + students.get(0)
        );
    }
}