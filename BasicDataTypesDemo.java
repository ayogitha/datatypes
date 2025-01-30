public class BasicDataTypesDemo {
    public static void main(String[] args) {
        // byte: 8-bit signed integer
        byte byteValue = 120;
        System.out.println("Byte Value: " + byteValue);

        // short: 16-bit signed integer
        short shortValue = 30000;
        System.out.println("Short Value: " + shortValue);

        // int: 32-bit signed integer
        int intValue = 100000;
        System.out.println("Int Value: " + intValue);

        // long: 64-bit signed integer
        long longValue = 10000000000L; // 'L' suffix indicates a long literal
        System.out.println("Long Value: " + longValue);

        // float: 32-bit floating-point number
        float floatValue = 3.14F; // 'F' suffix indicates a float literal
        System.out.println("Float Value: " + floatValue);

        // double: 64-bit floating-point number
        double doubleValue = 3.141592653589793;
        System.out.println("Double Value: " + doubleValue);

        // char: 16-bit Unicode character
        char charValue = 'A';
        System.out.println("Char Value: " + charValue);

        // boolean: true or false
        boolean booleanValue = true;
        System.out.println("Boolean Value: " + booleanValue);

        // Demonstrating type casting
        int castedInt = (int) floatValue; // Casting float to int
        System.out.println("Casted Int Value (from float): " + castedInt);

        // Demonstrating operations with different types
        int sum = byteValue + shortValue; // Automatic type promotion
        System.out.println("Sum of byte and short (promoted to int): " + sum);

        double mixedOperation = doubleValue + intValue;
        System.out.println("Result of double + int: " + mixedOperation);
    }
}
