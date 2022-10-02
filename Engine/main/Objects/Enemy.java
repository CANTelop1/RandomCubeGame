package Engine.main.Objects;

import Engine.main.Game;
import Engine.main.ID;

import java.awt.*;

public class Enemy extends GameObject {

    public Enemy(int x, int y, ID id) {
        super(x, y, id);
        velX = 5;
        velY = 5;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        if(y <= 0 || y >= Game.HEIGHT-32) velY *= -1;
        if(x <= 0 || x >= Game.WIDTH-16) velX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(x,y,16,16);

    }
}
