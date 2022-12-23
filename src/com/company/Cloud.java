package com.company;
import java.awt.*;

public class Cloud {

    private int x;
    private int y;
    private Color color;

    private int radius;

    public Cloud(final int x, final int y,final int radius, final Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

//    public void setColor(Color color) {
//        this.color = color;
//    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setColor(color);

        g.fillOval((this.x / 2) - radius, (this.y / 2) - (radius * 2), radius * 2, radius * 2);
        g.fillOval((this.x / 2) - radius, (this.y / 2) - radius, radius * 2, radius * 2);
        g.fillOval((this.x / 2) - (radius * 2), (this.y / 2) - radius, radius * 2, radius * 2);
        g.fillOval((this.x / 2), (this.y / 2) - radius, radius * 2, radius * 2);

    }

}