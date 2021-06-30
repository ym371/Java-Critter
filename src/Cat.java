public class Cat extends Critter{
    public Cat(String name) {
        super(name);
    }
    @Override
    public void CritterSound() {
        System.out.println("Meow");
    }

}
