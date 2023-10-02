import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for weight in kilograms
        System.out.print("Enter your weight in kilograms: ");
        double weight = input.nextDouble();

        // Prompt the user for height in meters
        System.out.print("Enter your height in meters: ");
        double height = input.nextDouble();

        // Calculate BMI
        double bmi = calculateBMI(weight, height);

        // Determine BMI category
        String category = interpretBMI(bmi);

        // Display the result
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("BMI Category: " + category);

        input.close();
    }

    // Function to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Function to interpret BMI category
    public static String interpretBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal Weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
