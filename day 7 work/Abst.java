abstract class manvik{
    abstract void makeSound(); // abstract method

    void sleep() { // non-abstract method
        System.out.println("Sleeping...");
    }
}

class Dog extends manvik {
    void makeSound() {
        System.out.println("Bark");
    }
}

class Abst {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // Output: Bark
        dog.sleep(); // Output: Sleeping...
    }
}

