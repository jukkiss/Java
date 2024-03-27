//Tein tällaisen niin ei jäänyt printtilauseet ja kahvinkeitin kertaakaan käyttämättä
public class MakeCoffee {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();

        myCoffeeMaker.pressOnOff();

        myCoffeeMaker.setCoffeeType(CoffeeMaker.CoffeeType.KAURAMAITOKAHVI);
        myCoffeeMaker.setCoffeeAmount(400);

        myCoffeeMaker.pressOnOff();
    }
}
