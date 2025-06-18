public class mathFunctionDemo{
public static void main(String[] args) {
    System.out.println("\n--- Math Functions ---");
    double number = 16.0;

    // Square root calculation
    double squareRoot = Math.sqrt(number);
    System.out.println("√" + number + " = " + squareRoot);

    // Power calculation
    double powerResult = Math.pow(number, 3); // Changed to power of 3 for variety
    System.out.println(number + "³ = " + powerResult);

    // Trigonometric functions
    double angle = 45.0;
    double radians = Math.toRadians(angle);
    System.out.println("sin(" + angle + "°) = " + Math.sin(radians));
    System.out.println("cos(" + angle + "°) = " + Math.cos(radians));

    // Absolute value
    double negativeNum = -99.9;
    System.out.println("|" + negativeNum + "| = " + Math.abs(negativeNum));

    // Min/Max
    System.out.println("Max between 15 and 25: " + Math.max(15, 25));
    System.out.println("Min between 15 and 25: " + Math.min(15, 25));

    // Random number
    System.out.println("Random number: " + Math.random());
}
}
