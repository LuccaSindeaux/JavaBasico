//package simulacao;

import org.junit.Test;
import org.junit.Assert;

import Militares.*;
import simulacao.SimulacaoFinanceira;
import veiculos.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;


// testes
//deveCalcularOCustoTotalDaMissaoCorretamente
//deveCalcularOCustoTotalComCombustivelCorretamente
//deveCalcularOCustoTotalComSalariosCorretamente

public class SimulacaoFinanceiraTest {
    @Test
    public void deveCalcularOCustoTotalDaMissaoCorretamente(){
        ArrayList<Veiculo> veiculos = new ArrayList();

        EspecialistaDoAr pilotoAviao = new EspecialistaDoAr(BigDecimal.valueOf(7000),
                LocalDate.now().plusDays(-20),
                LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulanteAviao = new ArrayList<>();
        tripulanteAviao.add(new Militar(BigDecimal.valueOf(2500)));
        Aviao aviao = new Aviao(pilotoAviao, tripulanteAviao, 0.14, BigDecimal.valueOf(10));
        veiculos.add(aviao);

        for (int i = 0; i < 5; i++){
            Elite pilotoTanque = new Elite(BigDecimal.valueOf(3000),
                    LocalDate.now().plusDays(20),
                    LocalDate.now().plusDays(20),
                    LocalDate.now().plusDays(20),
                    LocalDate.now().plusDays(20));
            ArrayList<Militar> tripulacaoTanque = new ArrayList<>();
            tripulacaoTanque.add(new PilotoTanque(BigDecimal.valueOf(2500), LocalDate.now().minusYears(1)));
            tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
            tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
            Tanque tanque = new Tanque(pilotoTanque, tripulacaoTanque, 0.22, BigDecimal.valueOf(3.46));
            veiculos.add(tanque);
        }

        SimulacaoFinanceira simulacao = new SimulacaoFinanceira(1137, veiculos, 1);

        BigDecimal custoTotal = simulacao.getCustoTotalMissao();

        Assert.assertEquals(new BigDecimal("213623.81"), custoTotal.setScale(2, RoundingMode.HALF_UP));
        Assert.assertFalse(simulacao.todasTripulacoesValidas());
    }

    @Test
    public void deveCalcularOCustoTotalComSalariosCorretamente(){
        ArrayList<Veiculo> veiculos = new ArrayList<>();
        EspecialistaDoAr pilotoAviao = new EspecialistaDoAr(BigDecimal.valueOf(7000), LocalDate.now().plusDays(-20), LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulcaoAviao = new ArrayList<>();
        tripulcaoAviao.add(new Militar(BigDecimal.valueOf(2500)));
        Aviao aviao = new Aviao(pilotoAviao, tripulcaoAviao, 0.14, BigDecimal.valueOf(10));
        veiculos.add(aviao);

        for (int i = 0; i<5; i++){
            Elite pilotoTanque = new Elite(BigDecimal.valueOf(3000), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20));
            ArrayList<Militar> tripulacaoTanque = new ArrayList<>();
            tripulacaoTanque.add(new PilotoTanque(BigDecimal.valueOf(2500), LocalDate.now().minusYears(1)));
            tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
            tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
            Tanque tanque = new Tanque(pilotoTanque, tripulacaoTanque, 0.22, BigDecimal.valueOf(3.46));
            veiculos.add(tanque);
        }

        SimulacaoFinanceira simulacao = new SimulacaoFinanceira(1137, veiculos, 1);

        BigDecimal custoSalarios = simulacao.getCustoTotalSalarios();

        Assert.assertEquals(new BigDecimal("43000.00"), custoSalarios.setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void deveCalcularOCustoTotalComCombustivelCorretamente(){
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        EspecialistaDoAr pilotoAviao = new EspecialistaDoAr(BigDecimal.valueOf(7000), LocalDate.now().plusDays(-20),  LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulcaoAviao = new ArrayList<>();
        tripulcaoAviao.add(new Militar(BigDecimal.valueOf(2500)));
        Aviao aviao = new Aviao(pilotoAviao, tripulcaoAviao, 0.14, BigDecimal.valueOf(10));
        veiculos.add(aviao);

        for (int i = 0; i<5; i++){
            Elite pilotoTanque = new Elite(BigDecimal.valueOf(3000), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20));
            ArrayList<Militar> tripulacaoTanque = new ArrayList<>();
            tripulacaoTanque.add(new PilotoTanque(BigDecimal.valueOf(2500), LocalDate.now().minusYears(1)));
            tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
            tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
            Tanque tanque = new Tanque(pilotoTanque, tripulacaoTanque, 0.22, BigDecimal.valueOf(3.46));
            veiculos.add(tanque);
        }


        SimulacaoFinanceira simulacao = new SimulacaoFinanceira(1137, veiculos, 1);

        BigDecimal custoCombustivel = simulacao.getCustoTotalCombustivel();

        Assert.assertEquals(new BigDecimal("170623.81"), custoCombustivel.setScale(2, RoundingMode.HALF_UP));
    }

    @Test
    public void deveRetornarTrueQuandoTodasTripulacoesSaoValidas(){
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        Elite pilotoTanque = new Elite(BigDecimal.valueOf(3000), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulacaoTanque = new ArrayList<>();
        tripulacaoTanque.add(new PilotoTanque(BigDecimal.valueOf(2500), LocalDate.now().minusYears(1)));
        tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
        tripulacaoTanque.add(new Militar(BigDecimal.valueOf(600)));
        veiculos.add(new Tanque(pilotoTanque, tripulacaoTanque, 0.22, BigDecimal.valueOf(3.46)));

        EspecialistaDoAr pilotoAviao = new EspecialistaDoAr(BigDecimal.valueOf(7000), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulacaoAviao = new ArrayList<>();
        tripulacaoAviao.add(new Militar(BigDecimal.valueOf(2500)));
        veiculos.add(new Aviao(pilotoAviao, tripulacaoAviao, 0.14, BigDecimal.valueOf(10)));

        // caminhão
        PilotoCaminhao pilotoCaminhao = new PilotoCaminhao(BigDecimal.valueOf(2000), LocalDate.now().plusYears(1));
        ArrayList<Militar> tripulcaoCaminhao = new ArrayList<>();
        for(int i=0; i<5; i++){
            tripulcaoCaminhao.add(new Militar(BigDecimal.valueOf(500)));
        }
        veiculos.add(new Caminhao(pilotoCaminhao, tripulcaoCaminhao, 1.5, BigDecimal.valueOf(4.50)));

        // heli
        PilotoHelicoptero pilotoHelicoptero = new PilotoHelicoptero(BigDecimal.valueOf(6000), LocalDate.now().plusYears(1));
        ArrayList<Militar> tripulcaoHelicoptero = new ArrayList<>();
        for(int i=0; i<10; i++){
            tripulcaoHelicoptero.add(new Militar(BigDecimal.valueOf(500)));
        }
        veiculos.add(new Helicoptero(pilotoHelicoptero, tripulcaoHelicoptero, 0.8, BigDecimal.valueOf(8.00)));

        SimulacaoFinanceira simulacao = new SimulacaoFinanceira(100, veiculos, 1);

        Assert.assertTrue(simulacao.todasTripulacoesValidas());

    }

    @Test
    public void deveValidarTripulacaoAviaoCorretamente(){
        EspecialistaDoAr pilotoVencido = new EspecialistaDoAr(BigDecimal.valueOf(7000), LocalDate.now().plusDays(-20), LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulacaoOk = new ArrayList<>();
        tripulacaoOk.add(new Militar(BigDecimal.valueOf(2500)));
        Aviao aviaoLicencaVencida = new Aviao(pilotoVencido, tripulacaoOk, 0.14, BigDecimal.valueOf(10));
        Assert.assertFalse(aviaoLicencaVencida.tripulacaoValida());

        EspecialistaDoAr pilotoValido = new EspecialistaDoAr(BigDecimal.ZERO, LocalDate.now().plusDays(20), LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulacaoExcedida = new ArrayList<>();
        tripulacaoExcedida.add(new Militar(BigDecimal.ZERO));
        tripulacaoExcedida.add(new Militar(BigDecimal.ZERO));
        Aviao aviaoTripExcedida = new Aviao(pilotoValido, tripulacaoExcedida, 1, BigDecimal.TEN);
        Assert.assertFalse(aviaoTripExcedida.tripulacaoValida());

        EspecialistaDoAr pilotoValido2 = new EspecialistaDoAr(BigDecimal.valueOf(7000), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulacaoOk2 = new ArrayList<>();
        tripulacaoOk2.add(new Militar(BigDecimal.valueOf(2500)));
        Aviao aviaoTripOk2 = new Aviao(pilotoValido2, tripulacaoOk2, 0.14, BigDecimal.valueOf(10));
        Assert.assertTrue(aviaoTripOk2.tripulacaoValida());
    }

    @Test
    public void deveValidarTripulacaoTanqueCorretamente(){
        Elite pilotoTanqueValido = new Elite(BigDecimal.valueOf(3000), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20));
        ArrayList<Militar> tripulacaoTanqueValida = new ArrayList<>();
        tripulacaoTanqueValida.add(new PilotoTanque(BigDecimal.valueOf(2500), LocalDate.now().minusYears(1)));
        tripulacaoTanqueValida.add(new Militar(BigDecimal.valueOf(600)));
        tripulacaoTanqueValida.add(new Militar(BigDecimal.valueOf(600)));
        Tanque tanqueValido = new Tanque(pilotoTanqueValido, tripulacaoTanqueValida, 0.22, BigDecimal.valueOf(3.46));
        Assert.assertTrue(tanqueValido.tripulacaoValida());

        Elite pilotoVencido = new Elite(BigDecimal.valueOf(3000), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(20), LocalDate.now().plusDays(-20));
        ArrayList<Militar> tripulacaoTanqueOk = new ArrayList<>();
        tripulacaoTanqueOk.add(new Militar(BigDecimal.ZERO));
        tripulacaoTanqueOk.add(new Militar(BigDecimal.ZERO));
        tripulacaoTanqueOk.add(new Militar(BigDecimal.ZERO));
        Tanque tanqueLicencaVencida = new Tanque(pilotoVencido, tripulacaoTanqueOk, 0.22, BigDecimal.valueOf(3.46));
        Assert.assertFalse(tanqueLicencaVencida.tripulacaoValida());

        Elite pilotoValido3 = new Elite(BigDecimal.ZERO, LocalDate.now().plusYears(1), LocalDate.now().plusYears(1), LocalDate.now().plusYears(1), LocalDate.now().plusYears(1));
        ArrayList<Militar> tripulacaoInsuficiente = new ArrayList<>();
        tripulacaoInsuficiente.add(new Militar(BigDecimal.ZERO));
        Tanque tanquetTripInsuficiente = new Tanque(pilotoValido3, tripulacaoInsuficiente, 1, BigDecimal.TEN);
        Assert.assertFalse(tanquetTripInsuficiente.tripulacaoValida());
    }

    @Test
    public void deveValidarTripulacaoCaminhaoCorretamente(){
        // Licença venceu
        PilotoCaminhao pilotoVencido = new PilotoCaminhao(BigDecimal.ZERO, LocalDate.now().minusDays(1));
        ArrayList<Militar> tripulacaoMinima  =new ArrayList<>();
        for (int i=0; i<5; i++){
            tripulacaoMinima.add(new Militar(BigDecimal.ZERO));
        }
        Caminhao caminhaoLicencaVencida = new Caminhao(pilotoVencido, tripulacaoMinima, 1, BigDecimal.TEN);
        Assert.assertFalse(caminhaoLicencaVencida.tripulacaoValida());

        // piloto validado, mas não tem gente suficiente para tripular
        PilotoCaminhao pilotoValidoo = new PilotoCaminhao(BigDecimal.ZERO, LocalDate.now().plusDays(10));
        ArrayList<Militar> tripulacaoInsuficiente  =new ArrayList<>();
        tripulacaoInsuficiente.add(new Militar(BigDecimal.ZERO));
        Caminhao caminhaoTripInsficiente = new Caminhao(pilotoValidoo, tripulacaoInsuficiente, 1, BigDecimal.TEN);
        Assert.assertFalse(caminhaoTripInsficiente.tripulacaoValida());

        // piloto validado, mas tem gente demais pro caminhão
        ArrayList<Militar> tripulacaoExcedida = new ArrayList<>();
        for (int i=0; i<31; i++){
            tripulacaoExcedida.add(new Militar(BigDecimal.ZERO));
        }
        Caminhao caminhaoTripExcedida = new Caminhao(pilotoValidoo, tripulacaoExcedida, 1, BigDecimal.TEN);
        Assert.assertFalse(caminhaoTripExcedida.tripulacaoValida());


        // tudo deu certo
        Caminhao caminhaoValido = new Caminhao(pilotoValidoo, tripulacaoMinima, 1, BigDecimal.TEN);
        Assert.assertTrue(caminhaoValido.tripulacaoValida());
    }

    @Test
    public void deveValidarTripulacaoHelicopteroCorretamente(){
        // Lincença venceu
        PilotoHelicoptero pilotoVencido = new PilotoHelicoptero(BigDecimal.ZERO, LocalDate.now().minusDays(1));
        ArrayList<Militar> tripulacaoOk = new ArrayList<>();
        tripulacaoOk.add(new Militar(BigDecimal.ZERO));
        Helicoptero helicopteroLicencaVencida = new Helicoptero(pilotoVencido, tripulacaoOk, 1, BigDecimal.TEN);
        Assert.assertFalse(helicopteroLicencaVencida.tripulacaoValida());

        // Licença válida, mas tripulação é menor que 10
        PilotoHelicoptero pilotoValido = new PilotoHelicoptero(BigDecimal.ZERO, LocalDate.now().plusDays(10));
        ArrayList<Militar> tripulacaoExcedida = new ArrayList<>();
        for (int i=0; i<11; i++){
            tripulacaoExcedida.add(new Militar(BigDecimal.ZERO));
        }
        Helicoptero helicopteroTripExcedida = new Helicoptero(pilotoValido, tripulacaoExcedida, 1, BigDecimal.TEN);
        Assert.assertFalse(helicopteroTripExcedida.tripulacaoValida());

        // tudo deu certo
        Helicoptero helicopteroValido = new Helicoptero(pilotoValido, tripulacaoOk, 1, BigDecimal.TEN);
        Assert.assertTrue(helicopteroValido.tripulacaoValida());
    }
}
