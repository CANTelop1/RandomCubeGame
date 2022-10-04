package Engine.main;

import Engine.main.Objects.Enemy;
import Engine.main.Objects.Player;
import Engine.main.KeyInput;
import Engine.main.Objects.SmartEnemy;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

    private static final long serialVersionUID = 1L;

    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    private Thread thread;
    private boolean running = false;

    private final Handler handler;
    private HUD hud;
    private Spawn spawner;

    public enum STATE {
        Menu,
        Game
    }

    public STATE gameState = STATE.Menu;

    public Game(){
        System.out.println("Note: game created");

        handler = new Handler();

        hud = new HUD();

        spawner = new Spawn(handler,hud);

        this.addKeyListener(new KeyInput(handler));

        new Window(WIDTH,HEIGHT,"LEGO",this);

        handler.addObject(new Player(100,100,ID.player,handler));
        handler.addObject(new SmartEnemy(250,250,ID.smartEnemy,handler));
    }

    public synchronized void start(){
        System.out.println("Note: game.start()");

        thread = new Thread(this);
        running = true;
        thread.start();
    }
    public synchronized void stop(){
        try{
            thread.join();
            running = false;

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void run() {
        System.out.println("Note: game.run()");

        this.requestFocus();

        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(running){
            long now = System.nanoTime();
            delta += (now-lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                tick();
                delta--;
            }
            if(running){
                render();
            }
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                //System.out.println("FPS: " + frames);
                frames = 0;
            }
        }
        stop();
    }

    private void tick(){
        handler.tick();
        if (gameState == STATE.Game){

        }
        hud.tick();
        spawner.tick();

    }

    private void render(){
        //System.out.println("Is render");
        BufferStrategy bs = this.getBufferStrategy();
        if(bs == null){
            this.createBufferStrategy(2);
            return;
        }

        Graphics g = bs.getDrawGraphics();

        g.setColor(Color.GRAY);
        g.fillRect(0,0,WIDTH,HEIGHT);

        handler.render(g);

        hud.render(g);

        g.dispose();
        bs.show();

    }

    public static float clamp(float var, float min, float max){
        if(var >= max) return var = max;
        else if(var <= min) return  var = min;
        else return var;
    }

    public static void main(String[] args) {
        new Game();
    }
}
