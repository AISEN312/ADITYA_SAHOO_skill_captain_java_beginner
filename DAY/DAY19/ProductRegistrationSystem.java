import java.util.*;

class ProductRegistrationSystem {
    private List<Prodct> products;
    private Scanner scanner;

    public ProductRegistrationSystem() {
        products = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void registerProduct() {
        System.out.println("Enter product ID:");
        String productId = scanner.nextLine();
        System.out.println("Enter product name:");
        String productName = scanner.nextLine();
        System.out.println("Enter product description:");
        String description = scanner.nextLine();
        System.out.println("Enter manufacturer name:");
        String manufacturer = scanner.nextLine();
        int warrantyPeriod = 0;
        while (warrantyPeriod <= 0) {
            System.out.println("Enter warranty period (in months, must be a positive number):");
            try {
                warrantyPeriod = scanner.nextInt();
                if (warrantyPeriod <= 0) {
                    System.out.println("Invalid warranty period. Please enter a positive number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        Prodct product = new Prodct(productId, productName, description, manufacturer, warrantyPeriod);
        products.add(product);
        System.out.println("Product registered successfully!");
    }

    public void displayAllProducts() {
        System.out.println("Registered Products:");
        for (Prodct product : products) {
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Manufacturer: " + product.getManufacturer());
            System.out.println("Warranty Period (months): " + product.getWarrantyPeriod());
            System.out.println();
        }
    }

    public void searchProductById() {
        System.out.println("Enter the product ID to search:");
        String searchId = scanner.nextLine();
        boolean found = false;
        for (Prodct product : products) {
            if (product.getProductId().equals(searchId)) {
                System.out.println("Product found!");
                System.out.println("Product ID: " + product.getProductId());
                System.out.println("Product Name: " + product.getProductName());
                System.out.println("Description: " + product.getDescription());
                System.out.println("Manufacturer: " + product.getManufacturer());
                System.out.println("Warranty Period (months): " + product.getWarrantyPeriod());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found.");
        }
    }

    public void generateReport() {
        int totalProducts = products.size();
        int expiredProducts = 0;
        for (Prodct product : products) {
            if (product.getWarrantyPeriod() <= 0) {
                expiredProducts++;
            }
        }
        int activeProducts = totalProducts - expiredProducts;

        System.out.println("Product Registration Report:");
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Active Products: " + activeProducts);
        System.out.println("Expired Products: " + expiredProducts);
    }

    public void closeScanner() {
        scanner.close();
    }
}
