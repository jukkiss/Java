public interface ElectricVehicle {
    void charge();

    default double calculateElectricEfficiency() {
        return 0;
    }
}