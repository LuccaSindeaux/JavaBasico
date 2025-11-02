import org.junit.Assert;
import org.junit.Test;

import treinador.Treinador;
import treinador.Item;
import treinador.Pocao;

import pokemon.Pokemon;
import pokemon.Charmander;

public class TreinadorTest {

    @Test
    public void testeDeConstrutorSimples(){
        Treinador ash = new Treinador("Ash");

        Assert.assertEquals("Ash", ash.getNome());
        Assert.assertNull(ash.getItem());
        Assert.assertNotNull(ash.getPokemons());
        Assert.assertEquals(0, ash.getPokemons().size());
    }

    @Test
    public void testeDoConstrutorCompleto(){
        Item pocao = new Pocao();
        Treinador gary = new Treinador("Gary", pocao);

        Assert.assertEquals("Gary", gary.getNome());
        Assert.assertNotNull(gary.getItem());
        Assert.assertNotNull(gary.getPokemons());
        Assert.assertEquals(0, gary.getPokemons().size());
    }

    @Test
    public void deveAdicionarPokemonNaParty(){
        Treinador ethan = new Treinador("Ethan");
        Pokemon charmander = new Charmander();

        Assert.assertEquals(0, ethan.getPokemons().size());
        ethan.adicionarAoTime(charmander);
        Assert.assertEquals(1, ethan.getPokemons().size());
        Assert.assertEquals("Charmander", ethan.getPokemons().get(0).getNome());
    }

    @Test
    public void deveRetornarNomeNoToString(){
        Treinador silver = new Treinador("Silver");
        Assert.assertEquals("Silver", silver.toString());
    }

}
