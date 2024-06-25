import java.util.*;
public class AddDoubleNum{
	public static void main(String[] args){

		Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);

       	Double sum = a + b;

        System.out.println("Ans : " +sum);
	}
}