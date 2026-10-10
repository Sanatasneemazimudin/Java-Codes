public class hierarchicalinheritance {
    static class Animal {
        void eat() {
            System.out.println(
                    "Animal is eating."
            );
        }
    }
    static class Dog extends Animal {
        void bark() {
            System.out.println(
                    "Dog is barking."
            );
        }
    }
    static class Cat extends Animal {
        void meow() {
            System.out.println(
                    "Cat is meowing."
            );
        }
    }
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
    }
}