public class SearchArgument{
    public static void main(String[] args) {
        boolean foundInvalidArgument = false;

        for (String arg : args) {
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.err.println("Error: Argument '" + arg + "' does not begin with an uppercase letter.");
                foundInvalidArgument = true;
                break;
            }
        }

        if (foundInvalidArgument) {
            System.exit(1);
        }
    
        System.out.println("All arguments are valid and begin with an uppercase letter.");
    }
}