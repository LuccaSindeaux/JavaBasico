package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class PilotoCaminhao extends Militar implements PodePilotarCaminhao{
    private final LocalDate validadeLicencaCaminhao;

    public PilotoCaminhao(BigDecimal salario, LocalDate validadeLicencaCaminhao){
        super(salario);
        this.validadeLicencaCaminhao = validadeLicencaCaminhao;
    }

    @Override
    public LocalDate getValidadeLicencaCaminhao(){
        return validadeLicencaCaminhao;
    }
}
