public class Critter {
    private boolean isAlive;
    private int foodLevel;
    private int tiredness;

    public Critter() {
        isAlive = true;
        foodLevel = 5;
        tiredness = 0;
    }

    public boolean isAlive() {
        return isAlive;
    }

    private void die() {
        isAlive = false;
    }
    
    public void sleep() {
        System.out.println("Critter sleeps.");
        tiredness = 0;
        foodLevel -= 3;
        if (foodLevel <= 0) {
            System.out.println("Critter starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive) {
            System.out.println("Critter eats.");
            foodLevel++;
            tiredness++;
            if (foodLevel > 10) {
                System.out.println("Critter over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println("Critter is sleepy from so much food.");
                sleep();
            }
        }
    }
}
