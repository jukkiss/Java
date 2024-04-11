public class Car extends AbstractVehicle {
    private String color;

    public Car(String fuel, String color, double fuelEfficiency) {
        super("Car", fuel, fuelEfficiency);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\nFuel Efficiency: " + calculateFuelEfficiency() + " km/h";
    }
}
