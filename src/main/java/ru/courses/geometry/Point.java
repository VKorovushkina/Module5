package ru.courses.geometry;

public class Point {
    int x;
    int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public String ToString(){
        return "{"+this.x+";"+this.y+"}";
    }
}
