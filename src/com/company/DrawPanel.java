package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawPanel extends JPanel implements ActionListener {
    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;
    private int ticksFromStart1 = 450,ticksFromStart2 = 750,ticksFromStart3 = 1050;
    private int ticksFromStartTree1 = 400,ticksFromStartTree2 = 700,ticksFromStartTree3 = 1000;

    private Objects objects;
    private Cloud cloud1,cloud2,cloud3;
    private Tree tree1,tree2;

    private SkyGrass window;

    private RoundTree tree3;
    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        timer = new Timer(timerDelay, this);
        timer.start();

        this.cloud1 = new Cloud(ticksFromStart1, 190, 20, Color.WHITE);
        this.cloud2 = new Cloud(ticksFromStart2, 190, 25, Color.WHITE);
        this.cloud3 = new Cloud(ticksFromStart3, 200, 17, Color.WHITE);
        this.tree1= new Tree(ticksFromStartTree1, 360, 20, 250, new Color(73, 37, 37), Color.GREEN, 25) ;
        this.tree2= new Tree(ticksFromStartTree2 , 320, 20, 250, new Color(73, 37, 37),  Color.GREEN, 18) ;
        this.tree3= new RoundTree(ticksFromStartTree3, 320, 100, 250, new Color(73, 37, 37),  Color.GREEN, 50) ;
        this.objects = new Objects(0, 0, 0, 0);
        this.window = new SkyGrass(0, 0, 0, 0);

    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);

        window.draw(gr);

        cloud1.setX(ticksFromStart1);
        cloud1.draw(gr);
        tree1.setX(ticksFromStartTree1);
        tree1.draw(gr);

        cloud2.setX(ticksFromStart2);
        cloud2.draw(gr);
        tree2.setX(ticksFromStartTree2);
        tree2.draw(gr);

        cloud3.setX(ticksFromStart3);
        cloud3.draw(gr);
        tree3.setX(ticksFromStartTree3);
        tree3.draw(gr);

        objects.draw(gr);

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
            --ticksFromStart1;
            --ticksFromStart2;
            --ticksFromStart3;

            ++ticksFromStartTree1;
            ++ticksFromStartTree2;
            ++ticksFromStartTree3;
        }
        if (ticksFromStart1 <= 310) {
            ticksFromStart1 = 1300;
        }
        if (ticksFromStart2 <= 350) {
            ticksFromStart2 = 1300;
        }
        if (ticksFromStart3 <= 300) {
            ticksFromStart3 = 1300;
        }
        if (ticksFromStartTree1 >= 1310) {
            ticksFromStartTree1 = 360;
        }
        if (ticksFromStartTree2 >= 1400) {
            ticksFromStartTree2 = 370;
        }
        if (ticksFromStartTree3 >= 1300) {
            ticksFromStartTree3 = 370;
        }

    }
}