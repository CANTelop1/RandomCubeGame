package runTests;
import Team.TeamManager;
import pokemon.Bulbasuar;
import pokemon.Charmander;
import pokemon.Pokemon_base;
import pokemon.Squirtle;

/*
This test file it made to see whether a Pokemon has been created as an abstract of it's parent class pokebase
 */
public class Test2 {
    public static void main(String[] args) {
        TeamManager ash = new TeamManager();
        TeamManager trainer = new TeamManager();
        Squirtle s = new Squirtle();

        checkSubclassType(s);
        isSquritle(s);
        System.out.println("there you go");
    }

    public static void checkSubclassType(Pokemon_base poke){
        System.out.println(poke.getClass());
    }
    public  static void isSquritle(Pokemon_base poke){
        Squirtle aSquirtle = new Squirtle();
        Boolean bool = poke.getClass() == aSquirtle.getClass();
        System.out.println("Is the a squirtle: " + bool);
    }
}
