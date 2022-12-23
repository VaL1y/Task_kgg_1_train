package com.company;
import java.awt.*;

public class Objects {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Objects(final int x, final int y, final int width, final int height ) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //cтена 1
        int[] xPoints1 = {0,150,150,0};
        int[] yPoints1 = {0,0,400,560};
        g.setColor(new Color(234, 209, 180));
        g.drawPolygon(xPoints1, yPoints1, 4);
        g.fillPolygon(xPoints1, yPoints1, 4);

        //стена 2
        int[] xPoints2 = {635,785,785,635};
        int[] yPoints2 = {0,0,560,400};
        g.setColor(new Color(234, 209, 180));
        g.drawPolygon(xPoints2, yPoints2, 4);
        g.fillPolygon(xPoints2, yPoints2, 4);


        //пол
        int[] xPoints = {150,635,785,0};
        int[] yPoints = {400,400,560,560};
        g.setColor(new Color(196, 100, 4));
        g.drawPolygon(xPoints, yPoints, 4);
        g.fillPolygon(xPoints, yPoints, 4);

        //стена с окном
        g.setColor(new Color(114, 96, 80));

        g.fillRect(150,0,50,400);
        g.fillRect(585,0,50,400);
        g.fillRect(150,0,600,27);
        g.fillRect(150,300,450,100);

        //окно
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(8));
        g.drawRect(200,30,385,270);

        //стол
        int[] xPointsTable = {300,480,500,280};
        int[] yPointsTable = {308,308,350,350};
        g.setColor(new Color(218, 212, 205));
        g.drawPolygon(xPointsTable, yPointsTable, 4);
        g.fillPolygon(xPointsTable, yPointsTable, 4);

       // тень от стола - объём
        g.setColor(new Color(162, 153, 150));
        g.fillRect(280,354,220,7);

        // часть стола
        g.setColor(new Color(86, 73, 62));
        g.fillRect(380,361,12,100);

        //подставка под кружку
        g.setColor(new Color(91, 90, 90, 255));
        g.fillOval(330,320,40,20);

        //кружка
        g.setColor(Color.GRAY);
        g.fillRect(340,280,20,50);
        g.setStroke(new BasicStroke(6));
        g.drawArc(330,295,15,15,90,180);

        // кровать
        int[] xPointsRightBed1 = {535,635,735,535};
        int[] yPointsRightBed1 = {50,0,0,100};
        g.setColor(new Color(121, 4, 4));
        g.drawPolygon(xPointsRightBed1, yPointsRightBed1, 4);
        g.fillPolygon(xPointsRightBed1, yPointsRightBed1, 4);

        int[] xPointsRightBed2 = {545,735,785,785,715};
        int[] yPointsRightBed2 = {101,0,0,50,101};
        g.setColor(new Color(8, 4, 121));
        g.drawPolygon(xPointsRightBed2, yPointsRightBed2, 5);
        g.fillPolygon(xPointsRightBed2, yPointsRightBed2, 5);

        int[] xPointsRightBed3 = {520,633,782,782,640};
        int[] yPointsRightBed3 = {370,370,500,558,558};
        g.setColor(new Color(8, 4, 121));
        g.drawPolygon(xPointsRightBed3, yPointsRightBed3, 5);
        g.fillPolygon(xPointsRightBed3, yPointsRightBed3, 5);


        int[] xPointsLeftBed1 = {50,150,250,250};
        int[] yPointsLeftBed1 = {0,0,50,100};
        g.setColor(new Color(121, 4, 4));
        g.drawPolygon(xPointsLeftBed1, yPointsLeftBed1, 4);
        g.fillPolygon(xPointsLeftBed1, yPointsLeftBed1, 4);

        int[] xPointsLeftBed2 = {0,50,243,80,0};
        int[] yPointsLeftBed2 = {0,0,101,101,50};
        g.setColor(new Color(8, 4, 121));
        g.drawPolygon(xPointsLeftBed2, yPointsLeftBed2, 5);
        g.fillPolygon(xPointsLeftBed2, yPointsLeftBed2, 5);

        int[] xPointsLeftBed3 = {149,262,142,0,0};
        int[] yPointsLeftBed3 = {370,370,558,558,500};
        g.setColor(new Color(8, 4, 121));
        g.drawPolygon(xPointsLeftBed3, yPointsLeftBed3, 5);
        g.fillPolygon(xPointsLeftBed3, yPointsLeftBed3, 5);


    }
}