public class SportsCar extends CarClassMod {
    private final double accelerationFactor = 15;
    private final int decelerationFactor = 15;
    private final double gasolineConsumptionRate = 1.2;

    public SportsCar(String typeName) {
        super(typeName);
    }

    public SportsCar(String typeName, double initialGasolineLevel, double initialSpeed) {
        super(typeName, initialGasolineLevel, initialSpeed);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        if (getGasolineLevel() > 0) {
            double newSpeed = Math.min(getSpeed() + accelerationFactor, getCruiseControlTargetSpeed());
            setSpeed(newSpeed);
            consumeGasoline(gasolineConsumptionRate);
        }
    }

    @Override
    public void decelerate(int amount) {
        super.decelerate(amount + decelerationFactor);
        consumeGasoline(gasolineConsumptionRate / 2);
    }

    private void consumeGasoline(double amount) {
        double newGasolineLevel = Math.max(getGasolineLevel() - amount, 0);
        setGasolineLevel(newGasolineLevel);
    }
}
