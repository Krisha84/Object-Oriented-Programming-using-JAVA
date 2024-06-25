// Final variable example
class FinalVariableExample {
    final int finalVariable = 10;

    // Method to demonstrate final variable
    public void modifyFinalVariable() {
        // Attempting to modify the final variable will result in a compilation error
        // finalVariable = 20; // Uncommenting this line will result in an error
        System.out.println("Final variable value: " + finalVariable);
    }
}

// Final method example
class Parent {
    // Final method
    public final void finalMethod() {
        System.out.println("This is a final method in Parent class.");
    }
}

// Attempt to override final method (which is not allowed)
class Child extends Parent {
    // Uncommenting the following method will result in a compilation error
    // public void finalMethod() { }
}

// Final class example
final class FinalClass {
    // Method within final class
    public void display() {
        System.out.println("Inside final class method.");
    }
}

// Attempt to extend a final class (which is not allowed)
// Uncommenting the following line will result in a compilation error
// class SubFinalClass extends FinalClass { }

public class Final{
    public static void main(String[] args) {
        FinalVariableExample finalVariableExample = new FinalVariableExample();
        finalVariableExample.modifyFinalVariable(); // Call method to demonstrate final variable

        Parent parent = new Parent();
        parent.finalMethod(); // Call final method from Parent class

        FinalClass finalClass = new FinalClass();
        finalClass.display(); // Call method from final class
    }
}