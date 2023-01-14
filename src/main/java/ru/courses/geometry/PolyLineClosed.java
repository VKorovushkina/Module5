package ru.courses.geometry;

import ru.courses.geometry.Point;
import ru.courses.geometry.PolyLine;

public class PolyLineClosed extends PolyLine {

    public PolyLineClosed(Point...points) {
        super(points);
    }

    public double length(){
        double sum=0, len1,len2;
        for(int i=0;i<this.points.length-1;i++){
            len1=this.points[i].x-this.points[i+1].x;
            len2=this.points[i].y-this.points[i+1].y;
            sum+=Math.sqrt(len1*len1+len2*len2);
        }
        sum+=Math.sqrt(Math.pow(points[points.length-1].x-points[0].x,2)+Math.pow(points[points.length-1].y-points[0].y,2));
        return sum;

    }

}
