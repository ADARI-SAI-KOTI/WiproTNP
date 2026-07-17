import java.util.Scanner;

class Video{
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0;
    }

    public String getName() {
        return videoName;
    }

    public void doCheckout() {
        this.checkout = true;
    }

    public void doReturn() {
        this.checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public boolean getCheckout() {
        return checkout;
    }
}

class VideoStore {
    private Video[] store;
    private int videoCount;

    public VideoStore() {
        store = new Video[10];
        videoCount = 0;
    }

    public void addVideo(String name) {
        if (videoCount < store.length) {
            store[videoCount] = new Video(name);
            videoCount++;
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Store capacity full! Cannot add more videos.");
        }
    }

    public void doCheckout(String name) {
        Video video = findVideo(name);
        if (video != null) {
            video.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video not found in the inventory.");
        }
    }

    public void doReturn(String name) {
        Video video = findVideo(name);
        if (video != null) {
            video.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video not found in the inventory.");
        }
    }

    public void receiveRating(String name, int rating) {
        Video video = findVideo(name);
        if (video != null) {
            video.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video not found in the inventory.");
        }
    }

    public void listInventory() {
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s | %-15s | %-10s\n", "Video Name", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < videoCount; i++) {
            System.out.printf("%-20s | %-15b | %-10d\n", 
                store[i].getName(), store[i].getCheckout(), store[i].getRating());
        }
        System.out.println("--------------------------------------------------------");
    }

    private Video findVideo(String name) {
        for (int i = 0; i < videoCount; i++) {
            if (store[i].getName().equalsIgnoreCase(name)) {
                return store[i];
            }
        }
        return null;
    }
}

public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 6) {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos :");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6) : ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the name of the video you want to add : ");
                    String nameToAdd = scanner.nextLine();
                    videoStore.addVideo(nameToAdd);
                }
                case 2 -> {
                    System.out.print("Enter the name of the video you want to check out : ");
                    String nameToCheckout = scanner.nextLine();
                    videoStore.doCheckout(nameToCheckout);
                }
                case 3 -> {
                    System.out.print("Enter the name of the video you want to Return : ");
                    String nameToReturn = scanner.nextLine();
                    videoStore.doReturn(nameToReturn);
                }
                case 4 -> {
                    System.out.print("Enter the name of the video you want to Rate : ");
                    String nameToRate = scanner.nextLine();
                    System.out.print("Enter the rating for this video : ");
                    int rating = scanner.nextInt();
                    scanner.nextLine();
                    videoStore.receiveRating(nameToRate, rating);
                }
                case 5 -> videoStore.listInventory();
                case 6 -> System.out.println("Exiting...!! Thanks for using the application.");
                default -> System.out.println("Invalid selection. Choose between 1 and 6.");
            }
        }
        scanner.close();
    }
}