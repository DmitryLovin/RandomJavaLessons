package lessons.homeworks;

import utils.Console;

public class L01HW02 implements Homework {
    private final int MAX_NUMBER = 1000;
    private final int INITIAL_NUMBER = 1;

    @Override
    public void show() {
        Console.print(String.format("All prime numbers from %d to %d:", INITIAL_NUMBER, MAX_NUMBER));
        tryNextPrime(INITIAL_NUMBER);
    }

    private void tryNextPrime(int n) {
        if (n > MAX_NUMBER) return;

        boolean isPrime = true;

        for(int i = 2; i <= n / 2; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            Console.print(String.format("\t%d", n));

        tryNextPrime(n + 1);
    }
}
