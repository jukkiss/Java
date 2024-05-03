package SuperExample;

class Animal {
    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Dog extends Animal {
    void breathe() {
        super.breathe(); // Kutsuu Animal-luokan breathe-metodia
        System.out.println("Dog breathes more heavily");
    }

    void bark() {
        System.out.println("Barking");
    }
}
