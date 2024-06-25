import java.util*;
public class Lab_8_1{
    public static void main(String[] args){

        try{
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            int k=1;

            while(y-- > 0){
                k*=x;
            }

            System.out.println(k);
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
