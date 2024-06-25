import java.util.*;
public class Rarray{
   public static void main(String args[]){

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the length of array : ");
      int n=sc.nextInt();

      int[] arr=new int[n];
      
      for(int i=0;i<n;i++){
         System.out.println("Enter an element into array["+i+"] : ");
         arr[i] = sc.nextInt();
      }

      System.out.println("---Reverse_Array---");
      
      for(int i=n-1;i>=0;i--){
         System.out.println("Array["+(i+1)+"] : "+arr[i]);
      }
   }
 }