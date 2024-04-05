public class Bus extends CarClassMod {
    private int currentPassengers;
    private final int maxCapacity;

    public Bus(String typeName, int maxCapacity) {
        super(typeName);
        this.maxCapacity = maxCapacity;
        this.currentPassengers = 0;
    }

    public boolean passengerEnter(int numPassengers) {
        if (numPassengers < 0) {
            System.out.println("The number of passengers cannot be negative.");
            return false;
        }
        if (currentPassengers + numPassengers <= maxCapacity) {
            currentPassengers += numPassengers;
            System.out.println(numPassengers + " passengers entered the bus. Current number of passengers: " + currentPassengers);
            return true;
        } else {
            System.out.println("Not enough space for all passengers to enter. Current number of passengers: " + currentPassengers + ", attempted to add: " + numPassengers);
            return false;
        }
    }
    public boolean passengerExit(int numPassengers) {
        if (numPassengers < 0) {
            System.out.println("The number of passengers cannot be negative.");
            return false;
        }
        if (numPassengers <= currentPassengers) {
            currentPassengers -= numPassengers;
            System.out.println(numPassengers + " passengers exited the bus. Current number of passengers: " + currentPassengers);
            return true;
        } else {
            System.out.println("More passengers are trying to exit than are on the bus. Current number of passengers: " + currentPassengers + ", attempted to exit: " + numPassengers);
            return false;
        }
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
