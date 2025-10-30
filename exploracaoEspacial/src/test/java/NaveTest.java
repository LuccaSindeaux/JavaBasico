import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NaveTest {
    @Test
    public void deveCriarNaveComPosicaoZeroECombustivel(){
        Nave orion = new Nave(150);

        Assert.assertEquals(150, orion.getQuantidadeDeCombustivel());
        Assert.assertEquals(0, orion.getPosicao());
    }

    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta(){
        Recurso agua = new Recurso(180, 10);
        List<Recurso> recursosProximus = new ArrayList<>();
        recursosProximus.add(agua);
        Planeta proximus = new Planeta(3, recursosProximus);

        Nave nave = new Nave(5);
        List<Recurso> coletados = nave.explorar(proximus);

        Assert.assertEquals(1, nave.getPosicao());
        Assert.assertEquals(2, nave.getQuantidadeDeCombustivel());
        Assert.assertTrue(coletados.isEmpty());

        Assert.assertEquals(1, nave.getPosicao());
        Assert.assertEquals(2, nave.getQuantidadeDeCombustivel());

    }

    @Test
    public void deveExplorarPlanetaComSucessoVoltarParaZero(){
        Recurso agua = new Recurso(180, 10);
        List<Recurso> recursosProximus = new ArrayList<>();
        recursosProximus.add(agua);
        Planeta proximus = new Planeta(3, recursosProximus);

        Nave cephalon = new Nave(100);
        List<Recurso> coletados = cephalon.explorar(proximus);

        Assert.assertEquals(0, cephalon.getPosicao());
        Assert.assertEquals(82, cephalon.getQuantidadeDeCombustivel());
        Assert.assertEquals(1, coletados.size());
    }

    @Test
    public void deveExplorarPlanetasMasFicarADerivaNaVolta(){
        Recurso oxigenio = new Recurso(300, 2);
        Recurso ferro = new Recurso(30, 32);

        List<Recurso> recursosDeNetuno = new ArrayList<>();
        recursosDeNetuno.add(oxigenio);
        recursosDeNetuno.add(ferro);

        Planeta Netuno = new Planeta(3, recursosDeNetuno);

        Nave poseidonis = new Nave(12);
        List<Recurso> coletados = poseidonis.explorar(Netuno);

        Assert.assertEquals(2, poseidonis.getPosicao());
        Assert.assertEquals(0, poseidonis.getQuantidadeDeCombustivel());

        Assert.assertEquals(2, coletados.size());
    }

    @Test
    public void deveEplorarMultiplosPlanetasComSucessoEVoltarParaZero(){
        Recurso silicio = new Recurso(60, 16);
        Recurso ferro = new Recurso(30, 32);

        List<Recurso> recursosMarte = new ArrayList<>();
        recursosMarte.add(silicio);
        recursosMarte.add(ferro);

        Planeta Marte = new Planeta(3, recursosMarte);

        Recurso ouro = new Recurso(120, 25);
        List<Recurso> recursosVenus = new ArrayList<>();
        recursosVenus.add(ouro);

        Planeta Venus = new Planeta(10, recursosVenus);

        List<Planeta> planetasParaExplorar = new ArrayList<>();
        planetasParaExplorar.add(Marte);
        planetasParaExplorar.add(Venus);

        Nave apollo = new Nave(1000);
        List<Recurso> coletados = apollo.explorar(planetasParaExplorar);

        Assert.assertEquals(0, apollo.getPosicao());
        Assert.assertEquals(940, apollo.getQuantidadeDeCombustivel());
        Assert.assertEquals(3, coletados.size());
    }

    @Test
    public void deveExplorarAlgunsPlanetasEFicarADeriva(){
        Recurso ferro = new Recurso(30, 32);
        List<Recurso> recursosPlutao = new ArrayList<>();
        recursosPlutao.add(ferro);
        Planeta plutao = new Planeta(3, recursosPlutao);

        Recurso oxigenio = new Recurso(300, 2);
        List<Recurso> recursosJupiter = new ArrayList<>();
        recursosJupiter.add(oxigenio);
        Planeta jupiter = new Planeta(10, recursosJupiter);

        List<Planeta> planetasExplorados = new ArrayList<>();
        planetasExplorados.add(plutao);
        planetasExplorados.add(jupiter);

        Nave uwing = new Nave(40);
        List<Recurso> coletados = uwing.explorar(planetasExplorados);

        Assert.assertEquals(7, uwing.getPosicao());
        Assert.assertEquals(1, uwing.getQuantidadeDeCombustivel());
        Assert.assertEquals(2, coletados.size());
    }

    @Test
    public void deveFicarADerivaAntesDeExplorarLista(){
        Recurso ouro = new Recurso(120, 25);
        List<Recurso> recursosVenus = new ArrayList<>();
        recursosVenus.add(ouro);
        Planeta Venus = new Planeta(10, recursosVenus);

        Recurso silicio = new Recurso(60, 16);
        List<Recurso> recursosMarte = new ArrayList<>();
        recursosMarte.add(silicio);
        Planeta Marte = new Planeta(3, recursosMarte);

        List<Planeta> planetasParaExplorar = new ArrayList<>();
        planetasParaExplorar.add(Venus);
        planetasParaExplorar.add(Marte);


        Nave ordis = new Nave(10);
        List<Recurso> coletados = ordis.explorar(planetasParaExplorar);

        Assert.assertEquals(3, ordis.getPosicao());
        Assert.assertEquals(1, ordis.getQuantidadeDeCombustivel());
        Assert.assertTrue(coletados.isEmpty());
    }

    @Test
    public void deveLidarComListaDePlanetasVazia(){
        List<Planeta> planetasVazios = new ArrayList<>();

        Nave genericus = new Nave(100);
        List<Recurso> coletados = genericus.explorar(planetasVazios);

        Assert.assertEquals(0, genericus.getPosicao());
        Assert.assertEquals(100, genericus.getQuantidadeDeCombustivel());
        Assert.assertTrue(coletados.isEmpty());
    }

}
