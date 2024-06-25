// Interface A
interface A {
    int CONSTANT_A = 10;

    void methodA();
}

// Interface A1 extending A
interface A1 extends A {
    int CONSTANT_A1 = 20;

    void methodA1();
}

// Interface A2 extending A
interface A2 extends A {
    int CONSTANT_A2 = 30;

    void methodA2();
}

// Interface A12 inheriting from A1 and A2
interface A12 extends A1, A2 {
    void methodA12();
}

// Class B implementing A12
class B implements A12 {
    @Override
    public void methodA() {
        System.out.println("Constant from A: " + CONSTANT_A);
    }

    @Override
    public void methodA1() {
        System.out.println("Constant from A1: " + CONSTANT_A1);
    }

    @Override
    public void methodA2() {
        System.out.println("Constant from A2: " + CONSTANT_A2);
    }

    @Override
    public void methodA12() {
        System.out.println("B implementing A12");
    }
}

public class Inheritance{
    public static void main(String[] args) {
        B b = new B();

        // Invoking methods of class B
        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}
