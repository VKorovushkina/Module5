package ru.courses.birds;
import ru.courses.interfaces.Singable;

import java.util.Random;

public class Parrot extends Bird implements Singable {
    String text;

    public Parrot(String text){
        this.text=text;
    }
    @Override
    public void sing() {
        Random rand=new Random();
        int temp1=rand.nextInt(text.length()-1);
        int temp2=rand.nextInt(text.length()-1);
        char help1=text.charAt(temp1);
        char help2=text.charAt(temp2);
        text=text.replace(text.charAt(temp1),help2);
        text=text.replace(text.charAt(temp2),help1);

        System.out.println(text);
    }
}
