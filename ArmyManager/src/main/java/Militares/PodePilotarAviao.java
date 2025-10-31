package Militares;

import java.time.LocalDate;

public interface PodePilotarAviao {
    LocalDate getValidadeLicencaAviao();

    default boolean isLicencaAviaoValida(){
        return getValidadeLicencaAviao().isAfter(LocalDate.now());
    }
}
