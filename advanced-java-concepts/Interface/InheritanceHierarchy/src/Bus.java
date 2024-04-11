public class Bus extends AbstractVehicle {
    private String color;


    public Bus(String fuel, String color, double fuelEfficiency) {
        super("Car", fuel, fuelEfficiency);
        this.color = color;
    }
    @Override
    public String getInfo() {
        return "Bus Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\nFuel Efficiency: " + calculateFuelEfficiency() + " km/h";
    }
}
