public class Critter {
    private String CritterName;
    private boolean isAlive, Wins;
    private int foodLevel;
    private int tiredness;
    private int exerciseLevel;

    public Critter(String name) {
        CritterName = name;
        isAlive = true;
        Wins = false;
        foodLevel = 5;
        tiredness = 0;
        exerciseLevel = 0;
    }

    public void addFoodLevel(int addValue) {
        this.foodLevel = foodLevel + addValue;
    }
    public void addTiredness(int addValue) {
        this.tiredness = tiredness + addValue;
    }
    public void addExerciseLevel(int addValue) {
        this.exerciseLevel = exerciseLevel + addValue;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean Wins() {
        return Wins;
    }

    private void die() {
        isAlive = false;
    }

    private void win() { Wins = true; }

    private void wait (int ms){
        try{
            Thread.sleep(ms);
        }
        catch( InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }

    public void sleep() {
        System.out.println(CritterName +" sleeps.");
        CritterSound();
        for (int i=1; i<=5; i++) {
            System.out.print("z");
            wait(1000);
        }
        System.out.print("\n");
        
        tiredness = 0;
        foodLevel -= 3;
        if (foodLevel <= 0) {
            System.out.println(CritterName +" starves to death.");
            die();
        }
    }

    public void feed(Food food) {
        if (isAlive && !Wins) {
            System.out.println(CritterName +" eats.");
            CritterSound();
            food.applyFood(this);
            if (foodLevel > 10) {
                System.out.println(CritterName +" over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(CritterName +" is sleepy from so much food.");
                sleep();
            }
        }
    }

    public void exercise(){
        if (isAlive && !Wins) {
            System.out.println(CritterName + " exercises.");
            CritterSound();
            exerciseLevel++;
            tiredness++;
            if (exerciseLevel >= 10) {
                win();
            } else if (tiredness > 5) {
                System.out.println(CritterName + " is sleepy from so much exercise.");
                sleep();
            }
        }
    }

    public void CritterSound() {
        System.out.println(CritterName + " makes a sound.");
    }
}
