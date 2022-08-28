package Team;

import pokemon.Pokemon_base;

import java.util.ArrayList;

public class TeamManager {
    protected ArrayList<Pokemon_base> Pokemons;

    public  TeamManager(){
        
    }

    public void addPokemon(Pokemon_base aPokemon){
        if(Pokemons.size() < 6){
            Pokemons.add(aPokemon);
        }
        else throw new java.lang.Error("Pokemon not added");
    }

    public ArrayList<Pokemon_base> getPokemons() {
        return Pokemons;
    }

    public void setPokemons(ArrayList<Pokemon_base> pokemons) {
        Pokemons = pokemons;
    }

    @Override
    public String toString() {
        return "TeamManager{" +
                "Pokemons=" + Pokemons +
                '}';
    }
}
