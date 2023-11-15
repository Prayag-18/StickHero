package com.example.stickhero_1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard_Inputs implements KeyListener {
    private GamePanel gamePanel;
    public KeyBoard_Inputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
//            case KeyEvent.VK_SPACE:
//                System.out.println("Space");
//                gamePanel.change_H_Delta(+5);
//                break;
            case KeyEvent.VK_W:
                System.out.println("Up");
                gamePanel.changeYDelta(-5);
                break;
            case KeyEvent.VK_S:
                System.out.println("Down");
                gamePanel.changeYDelta(+5);
                break;
            case KeyEvent.VK_A:
                System.out.println("Left");
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_D:
                System.out.println("Right");
                gamePanel.changeXDelta(+5);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
