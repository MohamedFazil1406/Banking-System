import java.util.Scanner;

public class InputUtil {

    private static final Scanner scanner = new Scanner(System.in);


    public static int getInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next(); // clear wrong input
            System.out.print(message);
        }
        return scanner.nextInt();
    }


    public static long getLong(String message) {
        System.out.print(message);
        while (!scanner.hasNextLong()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.next();
            System.out.print(message);
        }
        return scanner.nextLong();
    }

    public static double getDouble(String message){
        System.out.println(message);
        while (!scanner.hasNextDouble()){
            System.out.println("Invalid input. please enter a valid number");
            scanner.next();
            System.out.println(message);
        }
        return scanner.nextDouble();
    }


    public static String getString(String message) {
        System.out.print(message);
        scanner.nextLine(); // consume leftover newline
        return scanner.nextLine();
    }
}
