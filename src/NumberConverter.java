import java.util.Scanner;

public class NumberConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        String number = sc.next();

        System.out.println("Enter base of input (decimal, binary, octal, hex): ");
        String fromBase = sc.next();

        System.out.println("Enter base to convert to (decimal, binary, octal, hex): ");
        String toBase = sc.next();

        int decimal = 0;

        try {
            switch (fromBase.toLowerCase()) {
                case "decimal": decimal = Integer.parseInt(number, 10); break;
                case "binary": decimal = Integer.parseInt(number, 2); break;
                case "octal": decimal = Integer.parseInt(number, 8); break;
                case "hex": decimal = Integer.parseInt(number, 16); break;
                default: System.out.println("Invalid input base!"); return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
            return;
        }

        String result = "";
        switch (toBase.toLowerCase()) {
            case "decimal": result = String.valueOf(decimal); break;
            case "binary": result = Integer.toBinaryString(decimal); break;
            case "octal": result = Integer.toOctalString(decimal); break;
            case "hex": result = Integer.toHexString(decimal).toUpperCase(); break;
            default: System.out.println("Invalid output base!"); return;
        }

        System.out.println("Converted Result: " + result);
    }
}
