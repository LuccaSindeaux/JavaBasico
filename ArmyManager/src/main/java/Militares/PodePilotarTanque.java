package Militares;

import java.time.LocalDate;

public interface PodePilotarTanque {
    LocalDate getValidadeLicencaTanque();

    default boolean isLicencaTanqueValida(){
        return getValidadeLicencaTanque().isAfter(LocalDate.now());
    }
}