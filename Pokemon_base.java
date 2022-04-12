/*
This class is the base for all Pokemon
each Pokemon has:
- Name
- Level
- Hp
- Type
- Speed
- Attack
- Special Attack
- Defence
- Special Defence
- Move set
 */

import java.util.ArrayList;

public class Pokemon_base {
    protected String name;
    protected int level;
    protected int hp;
    protected String type;
    protected int speed;
    protected int attack;
    protected int sAttack;
    protected int defence;
    protected int sDefence;
    protected ArrayList<> moveSet;

    public Pokemon_base(String name, int level, int hp, String type, int speed, int attack, int sAttack, int defence, int sDefence){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.type = type;
        this.speed = speed;
        this.attack = attack;
        this.sAttack = sAttack;
        this.defence = defence;
        this.sDefence = sDefence;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttack() {
        return attack;
    }

    public int getsAttack() {
        return sAttack;
    }

    public int getDefence() {
        return defence;
    }

    public int getsDefence() {
        return sDefence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setsAttack(int sAttack) {
        this.sAttack = sAttack;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void setsDefence(int sDefence) {
        this.sDefence = sDefence;
    }

}
