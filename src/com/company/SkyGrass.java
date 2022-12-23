package com.company;
import java.awt.*;

public class SkyGrass {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public SkyGrass(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //окно
        g.setColor(new Color(127, 223, 231));
        g.fillRect(200, 30, 385, 270);
        g.setColor(new Color(38, 122, 29));
        g.fillRect(200, 200, 385, 100);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(8));
        g.drawRect(200, 30, 385, 270);
    }
}
