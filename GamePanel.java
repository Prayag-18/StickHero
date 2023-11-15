package com.example.stickhero_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel {
    private Mouse_Inputs mouseInputs;
    private float xDelta = 100, yDelta = 100;
    private float xDir = 0.05f, yDir = 0.05f;

    private Color color = new Color(150,20,90);
    private Random random;

    private int hDelta = 0;
    private int frames = 0;
    private long lastCheck = 0;
    public GamePanel(){
        random = new Random();
        mouseInputs = new Mouse_Inputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
        addKeyListener(new KeyBoard_Inputs(this));
    }
    public void changeXDelta(int value){
        this.xDelta += value;
    }
    public void changeYDelta(int value){
        this.yDelta += value;
    }
    public void change_H_Delta(int value){
        this.hDelta += value;
    }
    public void setRect(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        updateRectangle();
        g.setColor(color);
        g.fillRect((int)xDelta,(int)yDelta,200,70 + hDelta);
        repaint();
    }

    private void updateRectangle(){
        xDelta += xDir;
        if(xDelta > 400 || xDelta < 0){
            xDir *= -1;
            color =getRndColor();
        }

        yDelta += yDir;
        if(yDelta > 400 || yDelta < 0){
            yDir *= -1;
            color =getRndColor();
        }
    }

    private Color getRndColor(){
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        return new Color(r,g,b);
    }
}