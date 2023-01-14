package ru.courses.geometry;

import ru.courses.geometry.Figure;

public class Square extends Figure {
    Point point;
    int side;

    public Square(Point point, int side){
        this.point=point;
        this.side=side;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }
}
