package Militares;

import java.math.BigDecimal;

public class Militar{
    protected BigDecimal salario;

    public Militar(BigDecimal salario){
        this.salario = salario;
    }

    public BigDecimal getSalario(){
        return this.salario;
    }
}
