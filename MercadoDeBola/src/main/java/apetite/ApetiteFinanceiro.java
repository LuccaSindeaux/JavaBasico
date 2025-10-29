package apetite;

import java.math.BigDecimal;

public class ApetiteFinanceiro {
    private static final BigDecimal MULTIPLICADOR_PADRAO = new BigDecimal("1.00");


    public BigDecimal calcularPrecoComApetite(BigDecimal precoBase) {
        return precoBase.multiply(MULTIPLICADOR_PADRAO);
    }
}
