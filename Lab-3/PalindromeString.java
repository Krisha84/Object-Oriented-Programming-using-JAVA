import java.util.*;
public class PalindromeString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		String a=sc.nextLine();
		int n=a.length(),s=0,e=n-1;

		while(s<e){
			if(a.charAt(s)!=a.charAt(e)){
				System.out.println("String is not Palindrome !!");
				return;
			}
			else{
				s++;
				e--;
			}
		}
		System.out.println("String is Palindrome !!");
	}
}