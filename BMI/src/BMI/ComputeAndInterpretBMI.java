package BMI;

import java.util.Scanner;

public class ComputeAndInterpretBMI {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter height in feet
        System.out.print("Enter height (feet): ");
        int feet = input.nextInt();

        // Prompt the user to enter height in inches
        System.out.print("Enter height (inches): ");
        int inches = input.nextInt();

        // Convert height to total inches
        int totalHeightInInches = (feet * 12) + inches;

        // Calculate BMI using the formula
        double bmi = (weight / (totalHeightInInches * totalHeightInInches)) * 703;

        // Display the BMI
        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Interpret the BMI
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi < 25) {
            System.out.println("You are normal weight.");
        } else if (bmi < 30) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        // Close the scanner
        input.close();
    }
}
