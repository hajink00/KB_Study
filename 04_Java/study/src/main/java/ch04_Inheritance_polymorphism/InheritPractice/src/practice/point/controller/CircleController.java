package practice.point.controller;

import practice.point.model.vo.Circle;

public class CircleController {
    private Circle c = new Circle();

    public String calcArea(int x, int y, int radius){
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);

        return toString() + (radius * radius * Math.PI);
    }

    public String calcCircum(int x, int y, int radius){
        c.setX(x);
        c.setY(y);
        c.setRadius(radius);

        return c.toString() + (2 * Math.PI * radius) ;
    }
 }
