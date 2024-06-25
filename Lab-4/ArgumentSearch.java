import java.util.*;
public class ArgumentSearch{
    public static void main(String[] args){

        for (String arg : args) {
            if (!Character.isUpperCase(arg.charAt(0))){
                System.out.println("Error: Argument '" + arg + "' does not begin with an uppercase letter.");
                return;
            }
        }

        System.out.println("All arguments are valid and begin with an uppercase letter.");
    }
}