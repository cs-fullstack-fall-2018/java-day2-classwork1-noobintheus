public class notes {Exercise 1
//        Create a program that prints “CORRECT” if 1, 2, or 3 is
//          entered. Else it will give ERROR.
//
//        Exercise 2
//        Ask the user to enter a number. If it’s positive, print “POSITIVE”. If it’s negative, print “NEGATIVE”. If it’s zero, print ZERO.
//
//        Exercise 3
//        Enter 3 card numbers. If it equals 21 print BLACKJACK!, if it’s greater than 21 print BUST!, if it’s less than 21 print “The total is [TOTAL]”

// import java.util.Scanner;
//
// public class Exercise1 {
//     public static void main(String[] args) {
//     System.out.println("Please enter your number: ");
//     Scanner scan1 = new Scanner(System.in);
//     int number1 = scan1.nextInt();
//     if ((number1==1) || (number1==2) || (number1==3)){
//     System.out.println("Correct");
// }
// else {
//     System.out.println("Error!");
// }
// }
// }
//
// import java.util.Scanner;
// public class Exercise2 {
//     public static void main(String[] args) {
//     System.out.println("Please enter a number negative or postive");
//     Scanner scanIn = new Scanner(System.in);
//     int num = scanIn.nextInt();
//     if(num > 0){
//     System.out.println("Postive!");
//
// }else if(num < 0){
//     System.out.println("Negativo!");
//
// }else if(num == 0){
//     System.out.println("Cero");
// }else{
//     System.out.println("...no");
// }
//
// }
// }
//
// import java.util.Scanner;
// //
//
//
//
// Exercise 3
// //        Enter 3 card numbers. If it equals 21 print BLACKJACK!,
// //          if it’s greater than 21 print BUST!, if it’s less
// //          than 21 print “The total is [TOTAL]”
//
// public class Exercise3 {
//     public static void main(String[] args) {
//     int userNumber = 0;
//     int userNumber2 = 0;
//     int userNumber3 = 0;
//     Scanner gitThe = new Scanner(System.in);
//     System.out.print("Enter card 1:");
//     userNumber = gitThe.nextInt();
//     System.out.print("Enter card 2:");
//     userNumber2 = gitThe.nextInt();
//     System.out.print("Enter card 3:");
//     userNumber3 = gitThe.nextInt();
//     if (userNumber + userNumber2+ userNumber3== 21) {
//     System.out.print("Blackjack");
// }else if (userNumber+ userNumber2+userNumber3< 21) {
//     System.out.print("The total is:" + (userNumber + userNumber2 + userNumber3));
// }else{
//     if (userNumber +userNumber2+userNumber3>21)
//         System.out.print("Bust");
// }
// }
// }
//
// import java.util.Scanner;
//
// public class PJExample3 {
//     public static void main(String[] args) {
//     // Exercise 3
//     //Enter 3 card numbers. If it equals 21 print BLACKJACK!, if it’s greater than 21 print BUST!, if it’s less
//     // than 21 print “The total is [TOTAL]”
//     int card3 = 0;
//     int card2 = 0;
//     int card1 = 0;
//     int userInput = 0;
//
//     Scanner getThe = new Scanner(System.in);
//
//     System.out.println("Enter a number");
//     card1 = getThe.nextInt();
//     System.out.println("Enter a number");
//     card2 = getThe.nextInt();
//     System.out.println("Enter a number");
//     card3 = getThe.nextInt();
//
//     userInput = card1+card2+card3;
//
//
//     if (userInput == 21) {
//     System.out.println("Its Blackjack");
// }
// else if (userInput > 21) {
//     System.out.println("Bust");
// }
// else if (userInput < 21) {
//     System.out.println("Your Total is: "+userInput);
// }
// else {
//     System.out.println("Odd");
// }
//
// }
// }

}
