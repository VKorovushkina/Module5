package ru.courses.geometry;

import ru.courses.geometry.Figure;

public class Circle extends Figure {
    Point point;
    int r;

    public Circle(Point point, int r){
        this.point=point;
        this.r=r;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(r,2);
    }
}
