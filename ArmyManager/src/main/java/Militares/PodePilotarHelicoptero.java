package Militares;

import java.time.LocalDate;

public interface PodePilotarHelicoptero {
    LocalDate getValidadeLicencaHelicoptero();

    default boolean isLicencaHelicopteroValida(){
        return getValidadeLicencaHelicoptero().isAfter(LocalDate.now());
    }
}