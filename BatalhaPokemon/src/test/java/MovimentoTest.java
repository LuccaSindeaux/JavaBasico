import org.junit.Assert;
import org.junit.Test;
import pokemon.Movimento;
import pokemon.TipoMovimento;

public class MovimentoTest {
    @Test
    public void deveCriarMovimentoCorretamente(){
        Movimento brasas = new Movimento("Brasas", 70, TipoMovimento.ESPECIAL);

        Assert.assertEquals("Brasas", brasas.getNome());
        Assert.assertEquals(70, brasas.getPoder());
        Assert.assertEquals(TipoMovimento.ESPECIAL, brasas.getTipoMovimento());
    }
}
