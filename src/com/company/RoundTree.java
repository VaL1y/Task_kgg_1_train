package com.company;
import java.awt.*;

public class RoundTree {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private Color colorCr;
    private int radius;

    public RoundTree(final int x, final int y, final int width, final int height, final Color color, final Color colorCr, final int radius) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.colorCr = colorCr;
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

                g.setColor(new Color(73, 37, 37));
        g.fillRect((this.x / 2) - 10, this.y / 2 + 5, 20, height / 2);
        g.setColor(Color.GREEN);
        int radius1 = 50;
        g.fillOval((this.x / 2) - radius1 , (this.y / 2) - (radius1), radius1 * 2, radius1 * 2);

    }

}