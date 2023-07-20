package lessons.homeworks;

import utils.Console;

public class L01HW01 implements Homework {
    @Override
    public void show() {
        int n = getN();
        Console.print(String.format("Triangular number: %d", triangular(n)));
        Console.print(String.format("Factorial: %d", factorial(n)));
    }

    private int getN() {
        Console.print("Enter the number N:");
        return Console.readNumber();
    }

    private int triangular(int n) {
        return n * (n + 1) / 2;
    }

    private int factorial(int n) {
        int result = n--;

        for (; n > 0; n--)
            result *= n;

        return result;
    }
}
