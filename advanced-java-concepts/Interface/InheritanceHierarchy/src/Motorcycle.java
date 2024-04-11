public class Motorcycle extends AbstractVehicle{
    private String color;

   public Motorcycle(String fuel, String color, double fuelEfficiency) {
       super("Motorcycle", fuel, fuelEfficiency);
       this.color = color;
       this.fuelEfficiency = fuelEfficiency;
   }

    @Override
    public String getInfo() {
        return "Motorcycle Information:\nType: " + type + "\nFuel: " + fuel + "\nColor: " + color + "\nFuel Efficiency: " + calculateFuelEfficiency() + " km/h";
    }
}
