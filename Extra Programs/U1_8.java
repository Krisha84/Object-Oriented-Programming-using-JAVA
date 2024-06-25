import java.util.*;
public class U1_8{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a yaer : ");
		int year = sc.nextInt();


        if ((year%4 == 0 && year%100 != 0) || (year%400 == 0)) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}

