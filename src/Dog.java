public class Dog extends Critter {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void CritterSound() {
        System.out.println("Bow wow");
    }

}