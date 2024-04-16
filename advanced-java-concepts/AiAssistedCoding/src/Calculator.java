public class Calculator {
    private int sum;

    public Calculator() {
        this.sum = 0;
    }

    public void reset() {
        this.sum = 0;
    }

    //Copilot, add a method that calculates product of given 2 numbers
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public void add(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        this.sum += number;
    }

    public int getSum() {
        return this.sum;
    }
}

