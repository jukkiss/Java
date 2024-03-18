public class CatClass {
    private String name;

    public CatClass(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("The cat named " + name + " says: Meow!");
    }

    public static void main(String[] args) {
        CatClass cat1 = new CatClass("Whiskers");
        CatClass cat2 = new CatClass("Rex");

        cat1.meow();
        cat1.meow();
        cat2.meow();
        cat1.meow();
    }
}