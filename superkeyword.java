public class superkeyword {
    static class Animal {
        String name = "Animal";
        void display() {
            System.out.println(
                    "Parent class method."
            );
        }
    }
    static class Dog extends Animal {
        String name = "Dog";
        void display() {
            System.out.println(
                    "Current class: " + name
            );
            System.out.println(
                    "Parent class: " + super.name
            );
            super.display();
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}