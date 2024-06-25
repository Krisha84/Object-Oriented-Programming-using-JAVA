// Parent class
class Animal {
    String sound;

    // Constructor
    public Animal(String sound) {
        this.sound = sound;
    }

    // Method to make the animal sound
    public void makeSound() {
        System.out.println("Animal makes sound: " + sound);
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    String breed;

    // Constructor
    public Dog(String sound, String breed) {
        super(sound); // Call to superclass constructor
        this.breed = breed;
    }

    // Method to display breed
    public void displayBreed() {
        System.out.println("Dog breed: " + breed);
    }

    // Method overriding makeSound() of parent class
    @Override
    public void makeSound() {
        super.makeSound(); // Call to superclass method
        System.out.println("Dog barks!");
    }
}

public class Super{
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog dog = new Dog("Woof", "Labrador");

        // Demonstrate accessing superclass method and overridden method
        dog.makeSound(); // Calls overridden method in Dog class
        dog.displayBreed(); // Calls method in Dog class

        // Demonstrate accessing superclass variable
        System.out.println("Sound of animal is: " + dog.sound); // Accesses variable from Animal class
    }
}