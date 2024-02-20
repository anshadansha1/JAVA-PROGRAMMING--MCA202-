
public class Bitwise {
    public static void main(String[] args) {
        int a = 5; // Binary representation: 101
        int b = 3; // Binary representation: 011
        
        // Bitwise AND
        int bitwiseAndResult = a & b; // Result: 1 (Binary: 001)
        System.out.println("Bitwise AND: " + bitwiseAndResult);
        
        // Bitwise OR
        int bitwiseOrResult = a | b; // Result: 7 (Binary: 111)
        System.out.println("Bitwise OR: " + bitwiseOrResult);
        
        // Bitwise XOR
        int bitwiseXorResult = a ^ b; // Result: 6 (Binary: 110)
        System.out.println("Bitwise XOR: " + bitwiseXorResult);
        
        // Left shift
        int leftShiftResult = a << 2; // Result: 20 (Binary: 10100)
        System.out.println("Left shift: " + leftShiftResult);
        
        // Right shift
        int rightShiftResult = a >> 1; // Result: 2 (Binary: 10)
        System.out.println("Right shift: " + rightShiftResult);
    }
}

