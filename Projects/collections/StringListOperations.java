import java.util.ArrayList;
import java.util.Scanner;

public class StringListOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            
            if (!scanner.hasNextInt()) {
                break;
            }
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            if (choice == 1) {
                System.out.print("Enter the item to be inserted: ");
                String item = scanner.nextLine();
                list.add(item);
                System.out.println("Inserted successfully");
            } else if (choice == 2) {
                System.out.print("Enter the item to search : ");
                String item = scanner.nextLine();
                if (list.contains(item)) {
                    System.out.println("Item found in the list.");
                } else {
                    System.out.println("Item not found in the list.");
                }
            } else if (choice == 3) {
                System.out.print("Enter the item to delete : ");
                String item = scanner.nextLine();
                if (list.remove(item)) {
                    System.out.println("Deleted successfully");
                } else {
                    System.out.println("Item does not exist.");
                }
            } else if (choice == 4) {
                System.out.println("The Items in the list are :");
                for (String item : list) {
                    System.out.println(item);
                }
            } else if (choice == 5) {
                break;
            }
        }
        scanner.close();
    }
}