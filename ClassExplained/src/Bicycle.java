public class Bicycle {
    private Person owner;

    public Bicycle(Person owner) {
        this.owner = owner;
    }

    public void drive() {
        System.out.println(owner.getName() + " ajaa polkupyörällä");
    }
}