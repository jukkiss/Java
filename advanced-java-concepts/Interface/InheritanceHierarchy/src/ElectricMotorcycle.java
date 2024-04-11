public class ElectricMotorcycle extends AbstractVehicle {
    private String color;

    public ElectricMotorcycle(String color, double electricEfficiency) {
        super("Electric Motorcycle", "Electric", electricEfficiency);
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Electric Motorcycle Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\nElectric Efficiency: " + calculateFuelEfficiency() + " kWh/km";
    }

    @Override
    public void charge() {
        System.out.println("Charging.");
    }
}
