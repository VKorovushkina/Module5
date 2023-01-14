package ru.courses.birds;
import ru.courses.interfaces.Singable;

public class Sparrow extends Bird implements Singable {
    @Override
    public void sing() {
        System.out.println("чырык");
    }
}
