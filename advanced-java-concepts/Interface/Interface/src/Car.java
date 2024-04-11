public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Start car");
    }

    @Override
    public void stop() {
        System.out.println("Stop car");
    }

    @Override
    public String getInfo() {
        return "Car Information:\nType: Car\nFuel: Petrol\nColor: Red";
    }
}
