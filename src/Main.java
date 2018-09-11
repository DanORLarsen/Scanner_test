import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a word");

        // "Enter a word" to ensure the use of only one word

        Scanner sc = new Scanner(System.in);

        String userInput = sc.next();
        // To make a scanner that take next word

        int userNumber = sc.nextInt();
        System.out.println(userNumber);
        double userNumber2 = sc.nextDouble();
        System.out.println(userNumber2);

        String uppercased = userInput.toUpperCase();
        System.out.println(userInput);
        System.out.println(uppercased);


        char firstCharacter = userInput.charAt(0);
        System.out.println(firstCharacter);
        System.out.println("Contains: " + userInput.contains("Enter"));
        System.out.println("Contains: " + userInput.contains("Enter".toLowerCase()));
    }
}