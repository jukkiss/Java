public class TestClock {
    public static void main(String[] args) {
        Clock clock = Clock.getInstance();

        System.out.println("Current Time: " + clock.getTime());

        clock.setTime(100);
        System.out.println("Time after setting to 100: " + clock.getTime());

        clock.setTime(clock.getTime() + 50);
        System.out.println("Time after incrementing by 50: " + clock.getTime());
    }
}
