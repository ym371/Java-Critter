public class Critter {
    private String CritterName;
    private boolean isAlive, isWin;
    private int foodLevel;
    private int tiredness;
    private int exerciseLevel;

    public Critter(String name) {
        CritterName = name;
        isAlive = true;
        isWin = false;
        foodLevel = 5;
        tiredness = 0;
        exerciseLevel = 0;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public boolean isWin() {
        return isWin;
    }

    private void die() {
        isAlive = false;
    }

    private void win() { isWin = true; }

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

    public void feed() {
        if (isAlive && ! isWin ) {
            System.out.println(CritterName +" eats.");
            foodLevel++;
            tiredness++;
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
        if (isAlive && ! isWin ) {
            System.out.println(CritterName + " exercises.");
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
}
