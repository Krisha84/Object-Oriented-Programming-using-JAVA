public class Stream{
    public static void main(String[] args) {
       
        String input = "stream";
        printPyramid(input);
    }

    public static void printPyramid(String str){

        for(int i=0;i<str.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}