import java.util.*;
public class Calculator{
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter 1st Number : ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number : ");
        int n2 = sc.nextInt();

        System.out.print("Enter Mode of Operation : ");
        char o = sc.next().charAt(0);

        if(o == '+') {
            System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        }
        else if(o == '-') {
            System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
        }
        else if(o == '*') {
            System.out.println(n1 + " * " + n2+ " = " + (n1*n2));
        }
        else if(o == '/') {
            System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
        }
        else if(o == '%') {
            System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
        }
        else {
            System.out.println("Invalid Mode of Operation");
        }
    }
}
