package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EspecialistaDoAr extends Militar implements PodePilotarVeiculosAereos{
    private final LocalDate licencaAviao;
    private final LocalDate licencaHelicoptero;


    public EspecialistaDoAr(BigDecimal salario, LocalDate licencaAviao, LocalDate licencaHelicoptero){
        super(salario);
        this.licencaAviao = licencaAviao;
        this.licencaHelicoptero = licencaHelicoptero;
    }

    @Override
    public LocalDate getValidadeLicencaAviao() {
        return licencaAviao;
    }

    @Override
    public LocalDate getValidadeLicencaHelicoptero() {
        return licencaHelicoptero;
    }
}
