import java.util.*;
class AgeException extends Exception{
    public AgeException(String message) {
        super(message);
    }
}

public class Demo{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            int age = sc.nextInt();
            ageChecker(age);
           
        } 
        catch (AgeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void ageChecker(int age) throws AgeException {
        if(age < 18) throw new AgeException("Age must be greater than 18 for voting");
        else System.out.println("Eligible for vote");
    }  
}
