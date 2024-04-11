public class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Start motorcycle");
    }

    @Override
    public void stop() {
        System.out.println("Stop motorcycle");
    }
    @Override
    public String getInfo() {
        return "Motorcycle Information:\nType: Motorcycle\nFuel: Gasoline\nColor: Black";
    }
}
