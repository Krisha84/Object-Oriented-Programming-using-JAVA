import java.util.Scanner;
public class Multi{
    public static void main(String[] aargs){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter a : ");
        int a=sc.nextInt();
        System.out.printf("Enter b : ");
        int b=sc.nextInt();
        int c=a*b;
        System.out.printf("Ans = "+c);
    }
}