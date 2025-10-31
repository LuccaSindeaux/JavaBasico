package Militares;

import java.time.LocalDate;

public interface PodePilotarCaminhao {
    LocalDate getValidadeLicencaCaminhao();

    default boolean isLicencaCaminhaoValida(){
        return getValidadeLicencaCaminhao().isAfter(LocalDate.now());
    }
}