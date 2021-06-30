import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please entre the Critter's name:");
        String name = scanner.nextLine();

        System.out.println("What animal is it? (Dog/Cat/Else)");
        String animalType = scanner.nextLine();
        Critter myCritter;
        if (animalType.equalsIgnoreCase("dog")){
            myCritter = new Dog(name);
        }
        else if (animalType.equalsIgnoreCase("cat")){
            myCritter = new Cat(name);
        }
        else{
            myCritter = new Critter(name);
        }

        while (myCritter.isAlive() && !myCritter.Wins()) {
            System.out.println("What would you like Critter to do?");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                System.out.println("What food would you like Critter to eat? (meat/veg)");
                String foodName = scanner.nextLine();
                Food food = null;
                if (foodName.equalsIgnoreCase("meat")){
                    food = new Meat();
                }
                if (foodName.equalsIgnoreCase("veg")){
                    food = new Veg();
                }
                myCritter.feed(food);
            } else if (lineRead.equalsIgnoreCase("sleep")) {
                myCritter.sleep();
            } else if (lineRead.equalsIgnoreCase("exercise")){
                myCritter.exercise();
            }
        }

        if (!myCritter.isAlive())  System.out.println("Critter has died.");
        if (myCritter.Wins()) System.out.println("You win!");
        scanner.close();
    }
}
