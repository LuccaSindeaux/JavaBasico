package apetite;

import java.math.BigDecimal;

public class Conservador extends ApetiteFinanceiro {

    private static final BigDecimal MULTIPLICADOR_CONSERVADOR = new BigDecimal("1.40");

    @Override
    public BigDecimal calcularPrecoComApetite(BigDecimal precoBase){
        return precoBase.multiply(MULTIPLICADOR_CONSERVADOR);
    }

}
