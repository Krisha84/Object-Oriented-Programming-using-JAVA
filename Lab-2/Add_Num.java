import java.util.Scanner;
public class Add_Num{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number a and b  : ");
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.print("Enter two number c and d : ");
        int c = sc.nextInt();
        int d = sc.nextInt();

        

        int sum = a + b;

        System.out.println("----Scanner-----"); 
        System.out.println(c + " + " + d + " = " + (c+d));

        System.out.println("");

        System.out.println("----Command Argument-----");
         System.out.println(a + " + " + b + " = " + sum));

    }
}
