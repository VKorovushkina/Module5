package ru.courses.main;
import ru.courses.geometry.Circle;
import ru.courses.geometry.Point;
import ru.courses.geometry.Square;
import ru.courses.interfaces.Areable;
import ru.courses.interfaces.Singable;
import ru.courses.interfaces.Summable;

public class Main {
    public static void main(String[] args) {

    Point A=new Point(1,5);
    Point B=new Point(2,8);
    Point C=new Point(5,3);
    Point D=new Point(8,9);

    Circle circle1=new Circle(A,10);
    Circle circle2=new Circle(B,2);
    Square square1=new Square(C,2);
    Square square2=new Square(D,3);

    System.out.println(areable(circle1,circle2,square1,square2));

    }
    static double summable(Summable... summables){
        int sum=0;
        for (int i=0;i<summables.length;i++)
        {
            sum+=summables[i].length();
        }
        return sum;

    }

    static void singable(Singable...singables){
        for(int i=0;i<singables.length;i++)
            singables[i].sing();
    }

    static double areable(Areable...areables){
        double sum=0;
        for (int i=0;i<areables.length;i++)
            sum+=areables[i].area();
        return sum;
    }
}
