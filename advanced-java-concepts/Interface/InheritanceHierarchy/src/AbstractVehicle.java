public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {
    protected String type;
    protected String fuel;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " starts");
    }

    @Override
    public void stop() {
        System.out.println(type + " stops");
    }

    @Override
    public void charge() {
        System.out.println("Not possible to charge this vehicle.");
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public abstract String getInfo();
}
