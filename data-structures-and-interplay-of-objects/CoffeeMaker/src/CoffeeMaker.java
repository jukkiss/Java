public class CoffeeMaker {
    public enum CoffeeType {
        MAITOKAHVI, KAURAMAITOKAHVI, MUSTANA
    }

    private boolean isOn = false;
    private CoffeeType coffeeType = CoffeeType.MAITOKAHVI;
    private int coffeeAmount = 300;

    public void pressOnOff() {
        isOn = !isOn;
        System.out.println("Coffee Maker is " + (isOn ? "on" : "off"));
    }

    public boolean isOn() {
        return isOn;
    }

    public void setCoffeeType(CoffeeType type) {
        if (isOn) {
            this.coffeeType = type;
            System.out.println("Coffee type set to " + type);
        } else {
            System.out.println("Cannot set coffee type. Coffee Maker is off.");
        }
    }

    public void setCoffeeAmount(int amount) {
        if (isOn && amount >= 300 && amount <= 800) {
            this.coffeeAmount = amount;
            System.out.println("Coffee amount set to " + amount + "ml");
        } else {
            System.out.println("Invalid amount or Coffee Maker is off. Amount must be between 300 and 800ml.");
        }
    }

    public CoffeeType getCoffeeType() {
        return coffeeType;
    }

    public int getCoffeeAmount() {
        return coffeeAmount;
    }
}
