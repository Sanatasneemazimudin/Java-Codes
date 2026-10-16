import java.io.FileWriter;
import java.io.IOException;
public class writefile {
    public static void main(String[] args) {
        try {
            FileWriter writer =
                    new FileWriter("student.txt");
            writer.write("Name: Sana\n");
            writer.write("Age: 20\n");
            writer.write("Course: CSE\n");
            writer.close();
            System.out.println(
                    "Data written successfully."
            );
        }
        catch (IOException e) {
            System.out.println(
                    "An error occurred."
            );
        }
    }
}