abstract class Vegetable {
    protected String color;

    public Vegetable(String color) {
        this.color = color;
    }

    // Abstract method
    public abstract String getName();

    @Override
    public String toString() {
        return getName() + " (Color: " + color + ")";
    }
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Potato";
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Brinjal";
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }

    @Override
    public String getName() {
        return "Tomato";
    }
}

public class Vagetables{
    public static void main(String[] args) {
        // Creating instances of vegetable objects
        Vegetable potato = new Potato("Brown");
        Vegetable brinjal = new Brinjal("Purple");
        Vegetable tomato = new Tomato("Red");

        // Displaying vegetable details using overridden toString() method
        System.out.println(potato);
        System.out.println(brinjal);
        System.out.println(tomato);
    }
}
