public class ElectricCar extends AbstractVehicle {
    private String color;

    public ElectricCar(String color, double electricEfficiency) {
        super("Electric Car", "Electric", electricEfficiency);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Electric Car Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\nElectric Efficiency: " + calculateFuelEfficiency() + " kWh/km";
    }

    @Override
    public void charge() {
        System.out.println("Charging");
    }
}