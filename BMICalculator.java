import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Constants for conversion
        final double POUNDS_TO_KG = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;
        
        // Prompt user to enter weight in pounds and height in inches
        System.out.print("Enter weight in pounds: ");
        double weightPounds = scanner.nextDouble();
        
        System.out.print("Enter height in inches: ");
        double heightInches = scanner.nextDouble();
        
        // Convert to metric units
        double weightKg = weightPounds * POUNDS_TO_KG;
        double heightMeters = heightInches * INCHES_TO_METERS;
        
        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);
        
        // Display the result
        System.out.println("Your BMI is: " + bmi);
        
        scanner.close();
    }
}
