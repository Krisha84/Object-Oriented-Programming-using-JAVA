import java.util.*;
public class StrLength_SecondHalf{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        int length = str.length();
        int halfLength = length / 2;
        String s = "";

        for(int i=length/2;i<length;i++){
            s += str.charAt(i);
        }

        System.out.println("Length of the string : "+length);
        System.out.println("Second half of the string : "+s);
        
    }
}