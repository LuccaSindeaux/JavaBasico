package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Elite extends Militar implements PodePilotarTudo{
    private final LocalDate licencaAviao;
    private final LocalDate licencaHelicoptero;
    private final LocalDate licencaCaminhao;
    private final LocalDate licencaTanque;

    public Elite(BigDecimal salario, LocalDate licencaAviao, LocalDate licencaHelicoptero, LocalDate licencaCaminhao, LocalDate licencaTanque){
        super(salario);
        this.licencaAviao = licencaAviao;
        this.licencaHelicoptero = licencaHelicoptero;
        this.licencaCaminhao = licencaCaminhao;
        this.licencaTanque = licencaTanque;
    }

    @Override
    public LocalDate getValidadeLicencaAviao() {
        return licencaAviao;
    }

    @Override
    public LocalDate getValidadeLicencaHelicoptero() {
        return licencaHelicoptero;
    }

    @Override
    public LocalDate getValidadeLicencaCaminhao() {
        return licencaCaminhao;
    }

    @Override
    public LocalDate getValidadeLicencaTanque() {
        return licencaTanque;
    }
}
