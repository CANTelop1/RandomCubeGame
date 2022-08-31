package Engine.main;

import Engine.main.Objects.GameObject;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.ArrayList;

public class KeyInput extends KeyAdapter {
    private Handler handler;
    private int currentPressed;

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        currentPressed = key;

        for(int i = 0; i < handler.objects.size(); i++){
            GameObject tempObject = handler.objects.get(i);

            if(tempObject.getId() == ID.player){
                if(key == KeyEvent.VK_W) tempObject.setVelY(-5);
                if(key == KeyEvent.VK_S) tempObject.setVelY(5);
                if(key == KeyEvent.VK_A) tempObject.setVelX(-5);
                if(key == KeyEvent.VK_D) tempObject.setVelX(5);
            }
        }

        System.out.println(key);

    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        for(int i = 0; i < handler.objects.size(); i++){
            GameObject tempObject = handler.objects.get(i);

            if(tempObject.getId() == ID.player){
                //moves player object
                if(key == KeyEvent.VK_W) tempObject.setVelY(0);
                if(key == KeyEvent.VK_S) tempObject.setVelY(0);
                if(key == KeyEvent.VK_A) tempObject.setVelX(0);
                if(key == KeyEvent.VK_D) tempObject.setVelX(0);

                if(currentPressed == key && key == KeyEvent.VK_UP)tempObject.setY(tempObject.getY()-50);
                if(currentPressed == key && key == KeyEvent.VK_DOWN)tempObject.setY(tempObject.getY()+50);
                if(currentPressed == key && key == KeyEvent.VK_RIGHT)tempObject.setX(tempObject.getX()+50);
                if(currentPressed == key && key == KeyEvent.VK_LEFT)tempObject.setX(tempObject.getX()-50);
                }
            }
        }
    }