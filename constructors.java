public class constructors {
    static class Student {
        String name;
        int age;
        Student() {
            name = "Unknown";
            age = 0;
        }
        Student(String name, int age) {

            this.name = name;
            this.age = age;
        }
        void display() {

            System.out.println(
                    name + " - " + age
            );
        }
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 =
                new Student("Sana", 20);
        student1.display();
        student2.display();
    }
}