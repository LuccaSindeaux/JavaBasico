package jogador;

import apetite.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class MeioCampo extends Jogador {
    public MeioCampo(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetite, BigDecimal preco){
        super(nome, idade, clubeAtual, reputacaoHistorica, apetite, preco);
    }

    @Override
    public BigDecimal getValorCompra(){
        BigDecimal valorBase = super.getValorCompra();

        if (this.idade > 30){
            BigDecimal desconto = valorBase.multiply(new BigDecimal("0.30"));

            return valorBase.subtract(desconto);
        }
        return valorBase;
    }

    @Override
    public boolean temInteresse(Clube clubeInteressado){
        int reputacaoJogador = this.reputacaoHistorica;
        int reputacaoClube = clubeInteressado.getReputacaoHistorica();

        return reputacaoClube <= (reputacaoJogador - 2);
    }
}
