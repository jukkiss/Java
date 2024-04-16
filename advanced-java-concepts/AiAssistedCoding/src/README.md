The program consists of two classes: Calculator and Main.  The Calculator class is a simple calculator with the ability to add positive numbers, reset the sum to zero, calculate the product of two numbers, and retrieve the current sum. It throws an IllegalArgumentException if a negative number is attempted to be added.  The Main class contains the main method which is the entry point of the program. It creates an instance of the Calculator class, performs a series of operations (adding numbers, printing the sum, multiplying numbers, printing the product, resetting the sum, and printing the sum again), and handles any IllegalArgumentException that might be thrown.
```public class Calculator {
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
```
The program is composed of two classes: `Main` and `Calculator`.

The `Calculator` class is a basic calculator with several functions:

- `add(int number)`: This method adds a positive integer to the current total. If a negative number is attempted to be added, it throws an `IllegalArgumentException`.
- `multiply(int num1, int num2)`: This method takes two integers and returns their product.
- `getSum()`: This method returns the current total.
- `reset()`: This method resets the total to zero.

The `Main` class is where the program starts. It includes the `main` method which does the following:

- Creates an instance of the `Calculator` class.
- Adds two numbers (5 and 10) using the `add` method of the `Calculator` instance.
- Prints the sum of the numbers added.
- Multiplies two numbers (5 and 10) using the `multiply` method of the `Calculator` instance.
- Prints the product of the multiplication.
- Resets the total to zero using the `reset` method of the `Calculator` instance.
- Prints the sum after the reset, which should be zero.

If an `IllegalArgumentException` is thrown at any point (for example, if a negative number is attempted to be added), the program catches it and prints the exception message.
