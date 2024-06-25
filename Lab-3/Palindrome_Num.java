import java.util.*;
public class Palindrome_Num{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int temp = n,r=0,pal=0;

        while(n>0){
            r = n%10;
            pal = (pal*10) + r;
            n = n/10;
        }

        if(pal == temp){
            System.out.println(temp+" is a Palindrome Number !!");
        }
        else{
            System.out.println(temp+" is not a Palindrome Number !!");
        }
    }
}
