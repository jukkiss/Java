public class CarClassMod {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private boolean cruiseControlOn = false;
    private double cruiseControlTargetSpeed;
    private final double MIN_CRUISE_SPEED = 20;
    private final double MAX_CRUISE_SPEED = 120;

    // Corrected Constructors
    public CarClassMod(String typeName) {
        this.speed = 0;
        this.gasolineLevel = 0;
        this.typeName = typeName;
    }

    public CarClassMod(String typeName, double initialGasolineLevel, double initialSpeed) {
        this(typeName);
        this.gasolineLevel = initialGasolineLevel;
        this.speed = initialSpeed;
    }

    public void accelerate() {
        if (gasolineLevel > 0) {
            if (!cruiseControlOn) {
                speed += 10;
            } else if (speed < cruiseControlTargetSpeed) {
                speed += Math.min(10, cruiseControlTargetSpeed - speed);
            }
        } else {
            speed = 0;
        }
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (!cruiseControlOn) {
                speed = Math.max(0, speed - amount);
            } else if (speed > cruiseControlTargetSpeed) {
                speed = Math.max(cruiseControlTargetSpeed, speed - amount);
            }
        } else {
            speed = 0;
        }
    }

    public boolean turnCruiseControlOn() {
        if (this.gasolineLevel <= 0 || cruiseControlTargetSpeed < MIN_CRUISE_SPEED || cruiseControlTargetSpeed > MAX_CRUISE_SPEED) {
            return false;
        }
        this.cruiseControlOn = true;
        return true;
    }

    public void turnCruiseControlOff() {
        this.cruiseControlOn = false;
    }

    public boolean setCruiseControlTargetSpeed(double speed) {
        if (speed >= MIN_CRUISE_SPEED && speed <= MAX_CRUISE_SPEED) {
            this.cruiseControlTargetSpeed = speed;
            return true;
        }
        return false;
    }

    public double getSpeed() {
        return speed;
    }

    public void fillTank() {
        gasolineLevel = 100;
    }

    public double getGasolineLevel() {
        return gasolineLevel;
    }

    public boolean isCruiseControlOn() {
        return cruiseControlOn;
    }

    public double getCruiseControlTargetSpeed() {
        return cruiseControlTargetSpeed;
    }
}
