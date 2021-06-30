public class Meat implements Food{
    public void applyFood(Critter creature){
        creature.addFoodLevel(2);
        creature.addTiredness(1);
    }
}
