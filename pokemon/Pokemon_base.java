package pokemon;

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

import java.util.Random;

public class Pokemon_base {
    protected String name;
    protected int level;
    protected int hp;
    protected PokeType type;
    protected int speed;
    protected int attack;
    protected int sAttack;
    protected int defence;
    protected int sDefence;
    protected final int maxHp;
    //protected ArrayList<> moveSet;

    public Pokemon_base(String name, int level, int hp, PokeType type, int speed, int attack, int sAttack, int defence, int sDefence, int maxHp){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.type = type;
        this.speed = speed;
        this.attack = attack;
        this.sAttack = sAttack;
        this.defence = defence;
        this.sDefence = sDefence;
        this.maxHp = maxHp;
    }

    public int calcDamage(int inAttack, PokeType aType){
        Random r = new Random();
        return (int) Math.floor(10*((inAttack*howEffective(aType))/defence) + r.nextInt(2)-1);
    }

    public int calcSpecialDamage(int inAttack, PokeType aType){
        Random r = new Random();
        return (int) Math.floor(10*((inAttack*howEffective(aType))/sDefence) + r.nextInt(2)-1);
    }
    
    public void receiveSpecialAttack(int inAttack, PokeType aType){
        hurt(calcSpecialDamage(inAttack,aType));
    }
    public void receiveAttack(int inAttack, PokeType aType){
        hurt(calcDamage(inAttack,aType));
    }


    public Double howEffective(PokeType aType){
        if(type == PokeType.FIRE){
            switch (aType){
                case FIRE:
                    return 1.0;
                case GRASS:
                    return 0.5;
                case WATER:
                    return 2.0;
                case ELECTRIC:
                    return 1.0;
            }
        }
        else if(type == PokeType.WATER){
            switch (aType){
                case FIRE:
                    return 0.5;
                case GRASS:
                    return 2.0;
                case WATER:
                    return 1.0;
                case ELECTRIC:
                    return 2.0;
            }
        }
        else if(type == PokeType.GRASS){
            switch (aType){
                case FIRE:
                    return 2.0;
                case GRASS:
                    return 1.0;
                case WATER:
                    return 0.5;
                case ELECTRIC:
                    return 1.0;
            }
        }
        return 1.0;
    }

    public void heal(int health){
        setHp(hp+health);
    }

    public void hurt(int health){
        setHp(this.hp-health);
    }

    
    /*
    Getters and Setters
     */
    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public PokeType getType() {
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

    public void setHp(int hp){
        if(hp < 0){
            this.hp = 0;
            System.out.println(name + " is dead");
        }
        else if(hp > maxHp){
            this.hp = maxHp;
        }
        else
            this.hp = hp;
    }

    public void setType(PokeType type) {
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

    @Override
    public String toString() {
        return "Pokemon_base{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                ", type='" + type + '\'' +
                ", speed=" + speed +
                ", attack=" + attack +
                ", sAttack=" + sAttack +
                ", defence=" + defence +
                ", sDefence=" + sDefence +
                ", PokeType" + type +
                '}';
    }
}
