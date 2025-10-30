import org.junit.Test;
import org.junit.Assert;


public class RecursoTest {

    @Test
    public void deveCriarRecursosECpturarValores(){
        Recurso agua = new Recurso(180, 10);
        Assert.assertEquals(180, agua.getValor());
        Assert.assertEquals(10, agua.getPeso());
    }

    @Test
    public void deveRetornarStringFormatada(){
        Recurso ferro = new Recurso(30, 32);
        Assert.assertEquals("Recursos [valor = 30, peso = 32]", ferro.toString());
    }
}
