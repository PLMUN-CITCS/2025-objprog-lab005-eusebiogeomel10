public class MathLibraryDemo {
    public static void main(String[] args) {
        // Calculate Power
        double base = 2;
        int exponent = 3;
        double powerResult = Math.pow(base, exponent);

        // Calculate Square Root
        double numberForSqrt = 16;
        double sqrtResult = Math.sqrt(numberForSqrt);

        // Round a Decimal Number
        double decimalNumber = 5.67;
        long roundedNumber = Math.round(decimalNumber);

        // Generate a Random Number
        double randomNumber = Math.random(); // Generates a value between 0.0 and 1.0

        // Output the Results
        System.out.println("Power: " + powerResult);
        System.out.println("Square Root: " + sqrtResult);
        System.out.println("Rounded Number: " + roundedNumber);
        System.out.println("Random Number: " + randomNumber);
    }
}
