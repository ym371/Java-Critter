import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Critter bob = new Critter("Bob");
        Scanner scanner = new Scanner(System.in);
        while (bob.isAlive() && !bob.isWin()) {
            System.out.println("What would you like Critter to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                bob.feed();
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                bob.sleep();
            } else if (lineRead.equalsIgnoreCase("exercise")){
                bob.exercise();
            }
        }
        if (!bob.isAlive())  System.out.println("Critter has died.");
        if (bob.isWin()) System.out.println("You win!");
        scanner.close();
    }
}
