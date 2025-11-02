import org.junit.Assert;
import org.junit.Test;

import pokemon.Pokemon;
import pokemon.Charmander;
import pokemon.Squirtle;
import pokemon.Bulbasaur;
import pokemon.Pikachu;

public class PokemonTest {
    @Test
    public void deveInicializarAtributosCorretamente(){
        Pokemon charmander = new Charmander();
        Assert.assertEquals("Charmander", charmander.getNome());
        Assert.assertEquals(39, charmander.getPontosDeSaude());
        Assert.assertEquals(39, charmander.getPontosDeSaudeIniciais());
        Assert.assertEquals(52, charmander.getAtaque());
        Assert.assertEquals(43, charmander.getDefesa());
        Assert.assertEquals(60, charmander.getAtaqueEspecial());
        Assert.assertEquals(50, charmander.getDefesaEspecial());
        Assert.assertEquals(65, charmander.getVelocidade());
    }

    @Test
    public void deveFalarNomeCorretamente(){
        Pokemon charmander = new Charmander();
        Pokemon squirtle = new Squirtle();

        Assert.assertEquals("Charmander", charmander.falar());
        Assert.assertEquals("Squirtle", squirtle.falar());
    }

    @Test
    public void deveAlterarComOsSetter(){
        Pokemon charmander = new Charmander();

        charmander.setAtaque(100);
        Assert.assertEquals(100, charmander.getAtaque());

        charmander.setAtaqueEspecial(120);
        Assert.assertEquals(120, charmander.getAtaqueEspecial());

        charmander.setPontosDeSaude(20);
        Assert.assertEquals(20, charmander.getPontosDeSaude());
    }

    @Test
    public void  deveIndicarDerrotacorretamente(){
        Pokemon charmander = new Charmander();

        Assert.assertFalse(charmander.estaDerrotado());

        charmander.setPontosDeSaude(0);
        Assert.assertTrue(charmander.estaDerrotado());

        charmander.setPontosDeSaude(-10);
        Assert.assertTrue(charmander.estaDerrotado());
    }

    @Test
    public void deveCalcularDanoEspecialComVantagem(){
        Pokemon charmander = new Charmander();
        Pokemon squirtle = new Squirtle();

        int dano = squirtle.calulcarDano(charmander);
        Assert.assertEquals(75, dano);
    }

    @Test
    public void deveCalcularDanoEspecialSemVantagem(){
        Pokemon charmander = new Charmander();
        Pokemon squirtle = new Squirtle();

        int dano = charmander.calulcarDano(squirtle);
        Assert.assertEquals(33, dano);
    }

    @Test
    public void deveCalcularDanoFisicoSemVantagem(){
        Pokemon pikachu = new Pikachu();
        Pokemon squirtle = new Squirtle();

        int dano = pikachu.calulcarDano(squirtle);
        Assert.assertEquals(51, dano);
    }

    @Test
    public void deveCalcularDanoFisicoComVantagem(){
        Pokemon bulbasaur = new Bulbasaur();
        Pokemon squirtle = new Squirtle();

        int dano = bulbasaur.calulcarDano(squirtle);
        Assert.assertEquals(46, dano);
    }
}
