package ru.courses.geometry;

import ru.courses.geometry.Figure;

public class Rectangle extends Figure {
    Point point;
    int side1;
    int side2;

    public Rectangle(Point point, int side1, int side2){
        this.point=point;
        this.side1=side1;
        this.side2=side2;
    }
    @Override
    public double area() {
        return side1*side2;
    }
}
