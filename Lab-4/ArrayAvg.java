import java.util.*;
public class ArrayAvg{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the length of array : ");
		int n = sc.nextInt();

		int[] array = new int[n];

		for(int i=0;i<n;i++){
			System.out.println("Enter an element into array["+i+"] : ");
			array[i] = sc.nextInt();
		}

		int sum=0;

		for(int i=0;i<n;i++){
			sum = sum + array[i];
		}

		double avg = (double)sum/n;

		System.out.println("Average of array : " +avg);
	}
}