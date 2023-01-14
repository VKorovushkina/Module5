package ru.courses.birds;
import ru.courses.interfaces.Singable;
import java.util.Random;

public class Cuckoo extends Bird implements Singable {
    @Override
    public void sing() {
        Random rand=new Random();
        int temp=rand.nextInt(10)+1;
        for (int i=1;i<temp;i++)
            System.out.println("ку-ку\n");
    }
}
