// Transport interface
interface Transport {
    void deliver();
}

// Abstract class Animal
abstract class Animal {
    // Common attributes and methods for animals
    abstract String getName();
}

// Concrete classes extending Animal
class Tiger extends Animal {
    @Override
    String getName() {
        return "Tiger";
    }
}

class Camel extends Animal implements Transport {
    @Override
    String getName() {
        return "Camel";
    }

    @Override
    public void deliver() {
        System.out.println("Camel delivers goods.");
    }
}

class Deer extends Animal {
    @Override
    String getName() {
        return "Deer";
    }
}

class Donkey extends Animal implements Transport {
    @Override
    String getName() {
        return "Donkey";
    }

    @Override
    public void deliver() {
        System.out.println("Donkey delivers goods.");
    }
}

public class Main{
    public static void main(String[] args) {
        // Initialize an array of Animal objects
        Animal[] animals = {new Tiger(), new Camel(), new Deer(), new Donkey()};

        // Iterate through the array
        for (Animal animal : animals) {
            // Check if the object implements Transport interface
            if (animal instanceof Transport) {
                // Invoke deliver() method
                ((Transport) animal).deliver();
            }
        }
    }
}
