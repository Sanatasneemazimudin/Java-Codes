public class staticmembers {
    static class Student {
        static int count = 0;
        Student() {
            count++;
        }
        static void displayCount() {
            System.out.println(
                    "Students created: " + count
            );
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student.displayCount();
    }
}