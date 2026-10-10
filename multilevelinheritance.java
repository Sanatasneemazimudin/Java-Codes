public class multilevelinheritance {
    static class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }
    static class Dog extends Animal {
        void bark() {
            System.out.println("Barking...");
        }
    }
    static class Puppy extends Dog {
        void play() {
            System.out.println("Playing...");
        }
    }
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}