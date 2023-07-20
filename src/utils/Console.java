package utils;

import java.util.Scanner;

public class Console {
    private static Scanner stdin = new Scanner(System.in);

    public static int readNumber() {
        while (true) {
            try {
                return Integer.parseInt(read());
            } catch (NumberFormatException ex) {
                print("It is not a number");
            }
        }
    }

    public static String read() {
        return stdin.nextLine().trim();
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
