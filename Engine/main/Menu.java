package Engine.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Menu extends MouseAdapter{
    private Game game;
    private Handler handler;

    public Menu(Handler handler, Game game){
        this.game = game;
        this.handler = handler;
    }

    public void mousePressed(MouseEvent e){
        int mx = e.getX();
        int my = e.getY();

    }

    public void mouseReleased(MouseEvent e){

    }

    public void tick(){

    }

    public void render(Graphics g){
        Font fnt = new Font("arial", 1, 50);

        g.setFont(fnt);
        g.setColor(Color.white);
        g.drawString("Menu", 240, 70);

        g.drawRect(210, 150, 200, 64);

        g.setColor(Color.white);
        g.drawRect(210, 250, 200, 64);

        g.setColor(Color.white);
        g.drawRect(210, 350, 200, 64);

    }
}
