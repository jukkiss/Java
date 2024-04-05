public class CarClassMod {
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private boolean cruiseControlOn = false;
    private double cruiseControlTargetSpeed;
    private final double MIN_CRUISE_SPEED = 20;
    private final double MAX_CRUISE_SPEED = 120;

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
    public boolean setCruiseControlTargetSpeed(double targetSpeed) {
        if (targetSpeed >= MIN_CRUISE_SPEED && targetSpeed <= MAX_CRUISE_SPEED) {
            this.cruiseControlTargetSpeed = targetSpeed;
            System.out.println("Cruise control target speed set to: " + targetSpeed);
            return true;
        } else {
            System.out.println("Target speed is out of acceptable range.");
            return false;
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

    public void fillTank() {
        this.gasolineLevel = 100; // Assuming 100 represents a full tank
        System.out.println("The tank is now full.");
    }

    // Method to enable cruise control
    public boolean turnCruiseControlOn() {
        // Check if a target speed has been set and is within range
        if (cruiseControlTargetSpeed >= MIN_CRUISE_SPEED && cruiseControlTargetSpeed <= MAX_CRUISE_SPEED && gasolineLevel > 0) {
            this.cruiseControlOn = true;
            System.out.println("Cruise control turned on with previously set target speed: " + cruiseControlTargetSpeed);
            return true;
        } else {
            System.out.println("Cruise control cannot be activated. Target speed out of range, not set, or insufficient gasoline.");
            return false;
        }
    }

    public void turnCruiseControlOff() {
        this.cruiseControlOn = false;
        System.out.println("Cruise control turned off.");
    }

    protected void setSpeed(double speed) {
        this.speed = speed;
    }

    protected void setGasolineLevel(double gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }

    public double getSpeed() {
        return speed;
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
