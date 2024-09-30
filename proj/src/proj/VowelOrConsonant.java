package proj;
import java.util.Scanner;
public class VowelOrConsonant {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = input.next().toLowerCase().charAt(0);

        // Check if the input is a valid letter
        if (!Character.isLetter(letter)) {
            System.out.println(letter + " is an invalid input.");
        } else {
            // Check if the letter is a vowel or consonant
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        }

        // Close the scanner
        input.close();
    }
}

