import org.junit.Assert;
import org.junit.Test;

import treinador.Item;
import treinador.AtaqueEspecialX;
import treinador.AtaqueX;
import treinador.Pocao;

import pokemon.Pokemon;
import pokemon.Charmander;

public class ItemTest {

    @Test
    public void pocaoDeveCurarSemPassarDaVidaMaxima(){
        Item pocao = new Pocao();
        Pokemon charmander = new Charmander();

        charmander.setPontosDeSaude(10);
        pocao.usarItem(charmander);

        Assert.assertEquals(39, charmander.getPontosDeSaude());

        Pokemon charmanderCheio = new Charmander();
        pocao.usarItem(charmanderCheio);

        Assert.assertEquals(39, charmander.getPontosDeSaude());
    }

    @Test
    public void pocaoDeveTerTurnoCorreto(){
        Item pocao = new Pocao();
        Assert.assertEquals(2, pocao.getTurnoAcionamento());
    }

    @Test
    public void ataqueXDeveAumentarAtaque(){
        Item ataqueX = new AtaqueX();
        Pokemon charmander = new Charmander();

        int ataqueOriginal = charmander.getAtaque();
        ataqueX.usarItem(charmander);

        Assert.assertEquals(ataqueOriginal + 200, charmander.getAtaque());
        Assert.assertEquals(1, ataqueX.getTurnoAcionamento());
    }

    @Test
    public void ataqueEspecialXDeveAumentarAtaqueEspecial(){
        Item ataqueEspecialX = new AtaqueEspecialX();
        Pokemon charmander = new Charmander();

        int ataqueEspecial = charmander.getAtaqueEspecial();
        ataqueEspecialX.usarItem(charmander);

        Assert.assertEquals(ataqueEspecial + 200, charmander.getAtaqueEspecial());
        Assert.assertEquals(1, ataqueEspecialX.getTurnoAcionamento());
    }
}
