import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlanetaTest {
    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso(){
        Planeta planetaVazio = new Planeta(1, new ArrayList<>());
        Assert.assertEquals(0, planetaVazio.getValorTotal());
    }

    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso(){
        Planeta planetaVazio = new Planeta(1, new ArrayList<>());
    }

    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta(){
        Recurso agua = new Recurso(180, 10);
        Recurso oxigenio = new Recurso(300, 2);
        Recurso ouro = new Recurso(120, 25);

        Planeta terra = new Planeta(1, Arrays.asList(agua, oxigenio, ouro));

        Assert.assertEquals(172, terra.getValorPorPeso());
    }

    @Test
    public void deevIgnorarRecursosComPesoZeroNoCalculoDeValorPorPeso(){
        Recurso recursoValioso = new Recurso(1000, 10);
        Recurso recursoQuebrado = new Recurso(500, 0);

        Planeta ignorado = new Planeta(5, Arrays.asList(recursoValioso, recursoQuebrado));

        Assert.assertEquals(100, ignorado.getValorPorPeso());
    }

    @Test
    public void deveGarantirImutabilidadeDoPlaneta(){
        List<Recurso> recursosExternos = new ArrayList<>();
        recursosExternos.add(new Recurso(180,10));

        Planeta imutabilis = new Planeta(1, recursosExternos);
        Assert.assertEquals(180, imutabilis.getValorTotal());

        recursosExternos.add(new Recurso(500, 50));
        Assert.assertEquals(100, imutabilis.getValorTotal());

        List<Recurso> listaDoPlaneta = imutabilis.getRecursos();
        listaDoPlaneta.add(new Recurso(1000, 100));

        Assert.assertEquals(100, imutabilis.getValorTotal());
    }
}
