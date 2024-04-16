public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.add(5);
            calculator.add(10);
            System.out.println(calculator.getSum()); // Should print 15
            int product = calculator.multiply(5, 10);
            System.out.println(product); // Should print 50
            calculator.reset();
            System.out.println(calculator.getSum()); // Should print 0
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}