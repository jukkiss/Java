public class SafeArrayListTest {
    public static void main(String[] args) throws InterruptedException {
        final SafeArrayList<String> safeList = new SafeArrayList<>();

        Thread adder = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeList.add("Element " + i);
            }
        });
        
        Thread remover = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                safeList.remove("Element " + i);
            }
        });

        adder.start();
        remover.start();

        adder.join();
        remover.join();

        System.out.println("Final size of the list: " + safeList.size());
    }
}
