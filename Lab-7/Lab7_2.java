interface A{
    final int a = 1;
    void displayA();
}

interface A1 extends A{
    int b = 11;
    void displayA1();
}

interface A2 extends A{
    int c = 12;
    void displayA2();
}

interface A12 extends A1, A2{
    int d = 13;
    void displayA12();
}

class B implements A12{
    public void displayA(){
        System.out.println("Constant Value from Interface A : "+a);

    }
    public void displayA1(){
        System.out.println("Constant Value from Interface A1 : "+b);

    }
    public void displayA2(){
        System.out.println("Constant Value from Interface A2 : "+c);

    }
    public void displayA12(){
        System.out.println("Constant Value from Interface A12 : "+d);

    }
}
public class Lab_7_2 {

    public static void main(String[] args) {
        B b1 = new B();
        b1.displayA();
        b1.displayA1();
        b1.displayA2();
        b1.displayA12();

    }
}
