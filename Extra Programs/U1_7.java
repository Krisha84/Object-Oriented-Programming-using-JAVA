import java.util.*;
public class U1_7{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();

		if(a=!b){
			int c = (a>b)?a:b;
			System.out.println("Ans : "+(c*50));
		}
		else{
			System.out.println("Both a and b are the same!!");
			System.out.println("Ans : "+(a*50));
		}
	}
}