import java.util.*;
public class Lab_3A_1{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter marks of Subject1 out of 100 = ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks of Subject2 out of 100 = ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks of Subject3 out of 100 = ");
        int m3 = sc.nextInt();

        System.out.print("Enter marks of Subject4 out of 100 = ");
        int m4 = sc.nextInt();


        System.out.print("Enter marks of Subject5 out of 100 = ");
        int m5 = sc.nextInt();

        int total = m1 + m2 + m3 + m4 + m5;

        System.out.println("Total marks : "+total);

        double per = (double)total /5;

        System.out.println("Percentage : "+per);

        if(per>=60 && per<=100){
            System.out.println("First Division");
        }

        else if(per>=50 && per<60){
            System.out.println("Second Division");
        }

        else if(per>=40 && per<50){
            System.out.println("Third Division");
        }

        else{
            System.out.println("Fail");
        }
    }
}
