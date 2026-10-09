
import java.util.Scanner;

public class MyOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Food Ordering System");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Salad");
        System.out.print("Enter your menu choice (1-3): ");

        // Requirement 1: Validate input type
        if (!input.hasNextInt()) {
            System.out.println(
                "Invalid input. Please enter a number between 1 and 3."
            );
            input.close();
            return;
        }

        int choice = input.nextInt();

        // Requirement 2: Validate input range
        if (choice < 1 || choice > 3) {
            System.out.println(
                "Invalid menu option. Please enter a number between 1 and 3."
            );
            input.close();
            return;
        }

        // Process valid menu choices
        switch (choice) {
            case 1:
                System.out.println("You selected Burger.");
                break;
            case 2:
                System.out.println("You selected Pizza.");
                break;
            case 3:
                System.out.println("You selected Salad.");
                break;
        }

        input.close();
    }
}
