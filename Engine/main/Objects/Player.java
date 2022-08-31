package Engine.main.Objects;

import Engine.main.Game;
import Engine.main.ID;

import java.awt.*;

public class Player extends GameObject {

    public Player(int x, int y, ID id) {
        super(x, y, id);
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        x = Game.clamp(x,0,Game.WIDTH-32);
        y = Game.clamp(y,0,Game.HEIGHT-54);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x,y,32,32);

    }
}
