public class CarDriverMod {

    public static void main(String[] args) {
        CarClassMod myCar = new CarClassMod("Toyota Corolla");
        myCar.fillTank();


        boolean isTargetSpeedSet = myCar.setCruiseControlTargetSpeed(70);
        System.out.println("Is target speed set successfully? " + isTargetSpeedSet);


        boolean isCruiseControlActivated = myCar.turnCruiseControlOn();
        if (isCruiseControlActivated) {
            System.out.println("Cruise control activated. Target speed is " + myCar.getCruiseControlTargetSpeed());


            for (int i = 0; i < 5; i++) {
                myCar.accelerate();
                System.out.println("Current speed is " + myCar.getSpeed() + " km/h with cruise control active.");

            }
        } else {
            System.out.println("Failed to activate cruise control. Target speed out of range or insufficient gasoline.");
        }
        myCar.turnCruiseControlOff();
        System.out.println("Cruise control deactivated. Current speed is " + myCar.getSpeed() + " km/h.");
    }
}
