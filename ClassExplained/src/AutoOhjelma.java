public class AutoOhjelma {
    public static void main(String[] args) {
        Auto auto1 = new Auto("Toyota", "Corolla", 2020);
        auto1.kaynnista();
        auto1.naytaTiedot();
        auto1.pysayta();

        SahkoAuto sahkoauto2 = new SahkoAuto("Tesla", "Model S", 2021, 85.0);
        sahkoauto2.kaynnista();
        sahkoauto2.naytaTiedot();
        sahkoauto2.pysayta();
    }

}
