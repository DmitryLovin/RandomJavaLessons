package lessons;

import lessons.homeworks.Homework;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    protected List<Homework> homeworks = new ArrayList<>();

    public void showHomework(int index) throws IndexOutOfBoundsException{
        homeworks.get(index).show();
    }

    public int size(){
        return this.homeworks.size();
    }
}
