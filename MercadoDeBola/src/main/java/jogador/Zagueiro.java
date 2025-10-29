package jogador;

import apetite.ApetiteFinanceiro;
import clube.Clube;

import java.math.BigDecimal;

public class Zagueiro extends Jogador {
    public Zagueiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, ApetiteFinanceiro apetite, BigDecimal preco){
        super(nome, idade, clubeAtual, reputacaoHistorica, apetite, preco);
    }

    @Override
    public BigDecimal getValorCompra(){
        BigDecimal valorBase = super.getValorCompra();

        if (this.idade > 30){
            BigDecimal desconto = valorBase.multiply(new BigDecimal("0.20"));

            return valorBase.subtract(desconto);
        }
        return valorBase;
    }
}
