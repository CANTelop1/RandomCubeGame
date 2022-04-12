package runTests;

import pokemon.Bulbasuar;
import pokemon.Charmander;
import pokemon.Squirtle;

/*
This test file it made to see whether a Pokemon has been created as an abstract of it's parent class pokebase
 */
public class Test1 {
    public static void main(String[] args) {
        Charmander c = new Charmander();
        Bulbasuar b = new Bulbasuar();
        Squirtle s = new Squirtle();

        System.out.println(c.toString());
        System.out.println(b.toString());
        System.out.println(s.toString());

    }
}
