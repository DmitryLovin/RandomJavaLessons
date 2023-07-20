import lessons.Lesson;
import lessons.Lesson01;
import utils.Console;

import java.util.HashMap;
import java.util.Map;

public class Main {

    static Map<Integer, Lesson> lessons;

    static {
        lessons = new HashMap<>();
        lessons.put(1, new Lesson01());
    }

    public static void main(String[] args) {
        Console.print(String.format("There are %d lessons, pick one:", lessons.size()));
        pickHomework();
    }

    private static void pickHomework() {
        Lesson lesson = pickLesson();
        Console.print(String.format("There are %d homeworks in this lesson, pick one:", lesson.size()));
        while (true) {
            try {
                lesson.showHomework(Console.readNumber() - 1);
                break;
            } catch (IndexOutOfBoundsException ex) {
                Console.print("Homework doesn't exist");
            }
        }
    }

    private static Lesson pickLesson() {
        Lesson result = null;
        while (result == null) {
            result = lessons.get(Console.readNumber());
            if (result == null)
                Console.print("Lesson doesn't exist");
        }
        return result;
    }
}