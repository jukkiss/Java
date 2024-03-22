import java.util.Scanner;

public class BinaryValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give binary number: ");
        String binaryStr = scanner.nextLine();
        int decimal = 0;
        for (int i = 0; i < binaryStr.length(); i++) {
            char bit = binaryStr.charAt(binaryStr.length() - 1 - i);
            int value = Character.getNumericValue(bit);
            decimal += value * Math.pow(2, i);
        }

        System.out.println("Decimal equivalent: " + decimal);
    }
}
