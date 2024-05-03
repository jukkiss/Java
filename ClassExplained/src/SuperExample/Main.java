package SuperExample;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.breathe();  // Näyttää sekä yliluokan että aliluokan breathe-metodien tulosteet
        myDog.bark();     // Näyttää Dog-luokan bark-metodin tulosteen
    }
}

