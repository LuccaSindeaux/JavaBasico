package Militares;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EspecialistaTerrestre extends Militar implements PodePilotarVeiculosTerrestres{
    private final LocalDate licencaCaminhao;
    private final LocalDate licencaTanque;

    public EspecialistaTerrestre(BigDecimal salario, LocalDate licencaCaminhao, LocalDate licencaTanque){
        super(salario);
        this.licencaCaminhao = licencaCaminhao;
        this.licencaTanque = licencaTanque;
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

