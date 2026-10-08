public class getterssetters {
    static class Student {
        private String name;
        private int marks;
        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setMarks(int marks) {
            if (marks >= 0 && marks <= 100) {
                this.marks = marks;
            }
        }
        public int getMarks() {
            return marks;
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sana");
        student.setMarks(90);
        System.out.println(
                "Name: " + student.getName()
        );
        System.out.println(
                "Marks: " + student.getMarks()
        );
    }
}