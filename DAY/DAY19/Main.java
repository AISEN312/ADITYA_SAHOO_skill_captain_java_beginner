import java.util.*;


public class Main {

        public static void main(String[] args) {
            ProductRegistrationSystem registrationSystem = new ProductRegistrationSystem();

            boolean exit = false;
            while (!exit) {
                System.out.println("\nProduct Registration System");
                System.out.println("1. Register a new product");
                System.out.println("2. Display all registered products");
                System.out.println("3. Search for a product by ID");
                System.out.println("4. Generate report");
                System.out.println("5. Exit");

                Scanner scanner = new Scanner(System.in);
                int choice;
                try {
                    choice = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    continue;
                }

                switch (choice) {
                    case 1:
                        registrationSystem.registerProduct();
                        break;
                    case 2:
                        registrationSystem.displayAllProducts();
                        break;
                    case 3:
                        registrationSystem.searchProductById();
                        break;
                    case 4:
                        registrationSystem.generateReport();
                        break;
                    case 5:
                        registrationSystem.closeScanner();
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a valid option.");
                }
            }
        }}
