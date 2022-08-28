package runTests;

import Team.TeamManager;
import pokemon.Bulbasuar;
import pokemon.Charmander;
import pokemon.Squirtle;

/*
This test file it made to see whether a Pokemon has been created as an abstract of it's parent class pokebase
 */
public class Test1 {
    public static void main(String[] args) {
        TeamManager ash = new TeamManager();
        TeamManager trainer = new TeamManager();

        Charmander c = new Charmander();
        Bulbasuar b = new Bulbasuar();
        Squirtle s = new Squirtle();

        ash.addPokemon(c);


        System.out.println(c.toString());
        System.out.println(b.toString());
        System.out.println(s.toString());

        System.out.println(ash.toString());

        System.out.println("\nCharmander VS Squirtle");
        System.out.println("Charmanders turn");
        System.out.println("Squirtle HP: " + s.getHp());
        s.receiveAttack(c.getAttack(), c.getType());
        System.out.println("Squirtle HP: " + s.getHp());

        System.out.println("Squirtles turn");

        System.out.println("Charmander HP: " + c.getHp());
        c.receiveAttack(s.getAttack(), s.getType());
        System.out.println("Charmander HP: " + c.getHp());
        c.receiveAttack(s.getAttack(), s.getType());
        System.out.println("Charmander HP: " + c.getHp());
        c.receiveAttack(s.getAttack(), s.getType());
        System.out.println("Charmander HP: " + c.getHp());
        c.receiveAttack(s.getAttack(), s.getType());
        System.out.println("Charmander HP: " + c.getHp());



    }
}
