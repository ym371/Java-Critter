import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Critter bob = new Critter();
        Scanner scanner = new Scanner(System.in);
        while (bob.isAlive()) {
            System.out.println("What would you like Critter to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
            }
        }
        System.out.println("Critter has died.");
        scanner.close();
    }
}
