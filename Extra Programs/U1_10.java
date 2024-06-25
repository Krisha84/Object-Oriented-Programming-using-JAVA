import java.util.Scanner;

public class U1_10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basic salary: ");
        int basicSalary = scanner.nextInt();

        float hra;
        float da;

        if (basicSalary < 1500) {
            hra = basicSalary * 0.1; 
            da = basicSalary * 0.9;  
        } else {
            hra = 500;               
            da = basicSalary * 0.98; 
        }

        System.out.println("Gross Salary: Rs. " + (basicSalary + hra + da));

    }
}
