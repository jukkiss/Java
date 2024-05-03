public class Main {
    public static void main(String[] args) {
        Person person = new Person("Matti");
        Bicycle bike = new Bicycle(person);
        bike.drive(); // Tulostaa: Matti ajaa polkupyörällä
    }
}
