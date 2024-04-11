public class Bus implements Vehicle {
    @Override
    public void start() {
        System.out.println("Start bus");
    }

    @Override
    public void stop() {
        System.out.println("Stop bus");
    }
    @Override
    public String getInfo() {
        return "Bus Information:\nType: Motorcycle\nFuel: Gasoline\nColor: Black";
    }
}
