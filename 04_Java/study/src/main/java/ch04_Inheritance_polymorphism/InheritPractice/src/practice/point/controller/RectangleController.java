package practice.point.controller;

import practice.point.model.vo.Rectangle;

public class RectangleController {
    private Rectangle r = new Rectangle();

    public String calcArea(int x, int y, int height, int width){
        r.setHeight(height);
        r.setWidth(width);
        r.setX(x);
        r.setY(y);

        return r.toString() + (height * width);
    }

    public String calcPerimeter(int x, int y, int height, int width){
        r.setHeight(height);
        r.setWidth(width);
        r.setX(x);
        r.setY(y);

        return r.toString() + (2*(height + width));
    }
}
