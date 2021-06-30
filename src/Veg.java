public class Veg implements Food{
    public void applyFood(Critter creature){
        creature.addFoodLevel(1);
    }
}
