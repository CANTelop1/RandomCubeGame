package Engine.main;

import Engine.main.Objects.Enemy;

import java.awt.*;

public class Spawn {

    private Handler handler;
    private HUD hud;

    private int levelTrack = 0;

    public Spawn(Handler handler, HUD hud){
        this.handler = handler;
        this.hud = hud;

    }

    public void tick(){
        if (levelTrack != hud.getLevel()){
            levelTrack = hud.getLevel();
            handler.addObject(new Enemy(16,100,ID.enemy,handler));

        }

    }
    public void render(Graphics g){

    }

}
