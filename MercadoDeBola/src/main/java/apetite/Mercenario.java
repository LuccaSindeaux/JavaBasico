package apetite;

import java.math.BigDecimal;

public class Mercenario extends ApetiteFinanceiro {

    private static final BigDecimal MULTIPLICADOR_MERCENARIO = new BigDecimal("1.80");

    @Override
    public BigDecimal calcularPrecoComApetite(BigDecimal precoBase){
        return precoBase.multiply(MULTIPLICADOR_MERCENARIO);
    }
}
