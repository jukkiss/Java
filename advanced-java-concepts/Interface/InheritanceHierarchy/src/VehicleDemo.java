public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("Petrol", "Red", 25.0);
        Vehicle motorcycle = new Motorcycle("Gasoline", "Black", 40);
        ElectricVehicle electricCar = new ElectricCar("Blue", 3.5);
        ElectricVehicle electricMotorcycle = new ElectricMotorcycle("Green", 25);

        System.out.println("Vehicle Demonstration\n");

        // Traditional Vehicles
        car.start();
        car.stop();
        System.out.println(car.getInfo() + "\n");

        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo() + "\n");

        // Electric Vehicles
        ((Vehicle) electricCar).start(); // Casting to use Vehicle methods
        electricCar.charge();
        ((Vehicle) electricCar).stop();
        System.out.println(((Vehicle) electricCar).getInfo() + "\n");

        ((Vehicle) electricMotorcycle).start();
        electricMotorcycle.charge();
        ((Vehicle) electricMotorcycle).stop();
        System.out.println(((Vehicle) electricMotorcycle).getInfo() + "\n");
        System.out.println(car.getInfo() + "\n");
        System.out.println(motorcycle.getInfo() + "\n");
        System.out.println(((Vehicle) electricCar).getInfo() + "\n");
        System.out.println(((Vehicle) electricMotorcycle).getInfo() + "\n");
    }
}
