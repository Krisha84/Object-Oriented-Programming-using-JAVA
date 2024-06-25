import java.util.*;
public class Temperature{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in Fahrenheit: ");
        int f = sc.nextInt();

        double c = (5/9) * (f - 32);

        System.out.println("Fahrenheit to Celsius : "+c);
    }
}
