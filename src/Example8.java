public class Example8 {import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner userInput = new Scanner(System.in);

            System.out.println("Enter very awesome.");
            String quit = userInput.nextLine();

            System.out.println(quit);
            while ( ! quit.equals("How awesome are Kenn and Kevin") ){
                System.out.println("How awesome are Kenn and Kevin.");
                System.out.println(quit.equals("very awesome"));
                quit = userInput.nextLine();
            }
        }
    }
}
