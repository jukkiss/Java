public class OrientationTask1_3 {
    public static void main(String[] args) {
        Customer customer1 = new Customer();
        customer1.setStartTime(System.currentTimeMillis());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        customer1.setEndTime(System.currentTimeMillis());

        Customer customer2 = new Customer();
        customer2.setStartTime(System.currentTimeMillis());

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        customer2.setEndTime(System.currentTimeMillis());

        System.out.println("Customer 1 ID: " + customer1.getId() + ", Time Spent: " + customer1.getTimeSpent() + " ms");
        System.out.println("Customer 2 ID: " + customer2.getId() + ", Time Spent: " + customer2.getTimeSpent() + " ms");
    }
}
