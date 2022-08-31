package Engine.main;

import Engine.main.Objects.GameObject;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.util.ArrayList;

public class KeyInput extends KeyAdapter {
    private Handler handler;
    private ArrayList<Integer> currentPressed = new ArrayList<Integer>();

    public KeyInput(Handler handler){
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        currentPressed.clear();
        currentPressed.add(key);

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
                if(key == KeyEvent.VK_W) tempObject.setVelY(0);
                if(key == KeyEvent.VK_S) tempObject.setVelY(0);
                if(key == KeyEvent.VK_A) tempObject.setVelX(0);
                if(key == KeyEvent.VK_D) tempObject.setVelX(0);
                for(int j = 0; j < currentPressed.size();j++){
                    if(currentPressed.get(j) == key && key == KeyEvent.VK_UP){
                        //currentPressed.remove(j);
                        tempObject.setY(tempObject.getY()-50);
                    }
                    if(currentPressed.get(j) == key && key == KeyEvent.VK_DOWN){
                        //currentPressed.remove(j);
                        tempObject.setY(tempObject.getY()+50);
                    }
                    if(currentPressed.get(j) == key && key == KeyEvent.VK_RIGHT){
                        //currentPressed.remove(j);
                        tempObject.setX(tempObject.getX()+50);
                    }
                    if(currentPressed.get(j) == key && key == KeyEvent.VK_LEFT){
                        //currentPressed.remove(j);
                        tempObject.setX(tempObject.getX()-50);
                    }
                }
            }
        }

    }
}
