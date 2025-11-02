package treinador;

import pokemon.Pokemon;
import java.util.List;
import java.util.ArrayList;

public class Treinador {
    private String nome;
    private List<Pokemon> pokemons;
    private Item item;

    public Treinador(String nome){
        this.nome = nome;
        this.pokemons = new ArrayList<>();
        this.item = null;
    }

    public Treinador(String nome, Item item){
        this.nome = nome;
        this.pokemons = new ArrayList<>();
        this.item = item;
    }

    public void adicionarAoTime(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    @Override
    public String toString(){
        return this.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Pokemon> getPokemons(){
        return this.pokemons;
    }

    public Item getItem(){
        return this.item;
    }
}
