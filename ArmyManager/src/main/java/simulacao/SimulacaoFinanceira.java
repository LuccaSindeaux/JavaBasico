package simulacao;

import java.util.ArrayList;
import java.math.BigDecimal;

import veiculos.Veiculo;

public class SimulacaoFinanceira {
    private final int distanciaDaViagem;
    private final ArrayList<Veiculo> veiculosDaMissao;
    private final int duracaoDaMissao;

    public SimulacaoFinanceira(int distanciaDaViagem, ArrayList<Veiculo> veiculosDaMissao, int duracaoDaMissao){
        this.distanciaDaViagem = distanciaDaViagem;
        this.veiculosDaMissao = veiculosDaMissao;
        this.duracaoDaMissao = duracaoDaMissao;
    }

    public int getDistanciaDaViagem() {
        return distanciaDaViagem;
    }

    public boolean todasTripulacoesValidas(){
        for (Veiculo veiculo : this.veiculosDaMissao){
            if (!veiculo.tripulacaoValida()){
                return false;
            }
        }
        return true;
    }

    public BigDecimal getCustoTotalCombustivel(){
        BigDecimal totalCombustivel = BigDecimal.ZERO;

        for (Veiculo veiculo : this.veiculosDaMissao){
            totalCombustivel  =totalCombustivel.add(veiculo.getCustoCombustivel(this.distanciaDaViagem));
        }
        return totalCombustivel;
    }

    public BigDecimal getCustoTotalSalarios(){
        BigDecimal totalSalariosPorMes = BigDecimal.ZERO;
        for (Veiculo veiculo : this.veiculosDaMissao){
            totalSalariosPorMes = totalSalariosPorMes.add(veiculo.getCustoTotalSalarios());
        }

        BigDecimal duracao = BigDecimal.valueOf(this.duracaoDaMissao);
        return totalSalariosPorMes.multiply(duracao);
    }

    public BigDecimal getCustoTotalMissao(){
        return getCustoTotalSalarios().add(getCustoTotalCombustivel());
    }
}
