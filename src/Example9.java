public class Example9 {import java.util.Scanner;

    public class Java_While_Classroom_Ex1 {
        public static void main(String[] args) {
            String username = "blah";
            String userWord = "bleh";
            Scanner consoleInput = new Scanner(System.in);

            System.out.println("Enter the stop word");
            userWord = consoleInput.nextLine();


            while (! userWord.equals(stopWord)){
                System.out.println("Test");
                userWord = consoleInput.nextLine();
}
