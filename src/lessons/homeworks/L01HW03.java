package lessons.homeworks;

import utils.Console;

public class L01HW03 implements Homework {
    @Override
    public void show() {
        Console.print("Print simple sum with two variables (ex. 1 + 2 or 15 * 21), available actions: (+ - * / % ^)");

        trySum();
    }

    private void trySum() {
        String sum = Console.read();
        try {
            String[] arguments = tryArguments(sum);
            int[] numbers = tryNumbers(arguments[0], arguments[2]);
            Console.print(String.format("Solved sum: %s = %.2f", sum, tryCalculate(arguments[1], numbers[0], numbers[1])));
            return;
        } catch (NumberFormatException ex) {
            Console.print("Some variable is not a number!");
        } catch (IllegalArgumentException ex) {
            Console.print("Wrong format");
        } catch (Exception ex) {
            Console.print("Wrong action");
        }

        trySum();
    }

    private String[] tryArguments(String input) throws IllegalArgumentException {
        String[] arguments = input.split("((?=[+\\-*/%^])|(?<=[+\\-*/%^]))");
        if (arguments.length != 3) {
            throw new IllegalArgumentException();
        }
        return arguments;
    }

    private int[] tryNumbers(String num1, String num2) throws NumberFormatException {
        int[] result = new int[2];

        result[0] = Integer.parseInt(num1.trim());
        result[1] = Integer.parseInt(num2.trim());

        return result;
    }

    private double tryCalculate(String action, int a, int b) throws Exception {
        return switch (action) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "/" -> a / (double) b;
            case "*" -> a * b;
            case "%" -> a % b;
            case "^" -> Math.pow(a, b);
            default -> throw new Exception();
        };
    }
}
