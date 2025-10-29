package clube;

import java.math.BigDecimal;

public class Clube {
    private String nome;
    private int reputacaoHistorica;
    private BigDecimal saldoEmCaixa;

    public Clube(String nome, int reputacaoHistorica, BigDecimal saldoEmCaixa){
        this.nome = nome;
        this.reputacaoHistorica = reputacaoHistorica;
        this.saldoEmCaixa = saldoEmCaixa;
    }

    public String getNome(){
        return nome;
    }

    public int getReputacaoHistorica(){
        return reputacaoHistorica;
    }

    public BigDecimal getSaldoEmCaixa(){
        return saldoEmCaixa;
    }

    public void debitar(BigDecimal valor){
        this.saldoEmCaixa = this.saldoEmCaixa.subtract(valor);
    }
}

