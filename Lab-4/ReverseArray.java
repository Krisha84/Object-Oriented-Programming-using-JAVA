import java.util.Scanner;
public class ReverseArray{
   public static void main(String args[]){

      Scanner sc=new Scanner(System.in);

      System.out.println("Enter the length of array : ");
      int n=sc.nextInt();

      int[] arr=new int[n];
      
      for(int i=0;i<n;i++){
         System.out.println("Enter an element into array["+i+"] : ");
         arr[i] = sc.nextInt();
      }

      int s=0,e=n-1;
   
      while(s<e){
         int temp = arr[s];
         arr[s]=arr[e];
         arr[e]=temp;
         s++;
         e--;
      }

      System.out.println("---Reverse_Array---");

      for(int i=0;i<n;i++){
         System.out.println("Array["+(i+1)+"] : "+arr[i]);
      }
   }
 }