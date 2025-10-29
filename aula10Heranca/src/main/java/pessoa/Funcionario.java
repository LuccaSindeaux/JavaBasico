package pessoa;

public class Funcionario extends Pessoa {
    public static double PERCENTUAL_PADRAO_BONUS = 10;
    public static int CARGA_HORARIA_PADRAO = 220;
    final double CEM = 100;

    private String matricula;
    private double cargaHoraria;

    public Funcionario(String nome, String cpf, String matricula){
        super(nome, cpf);
        this.matricula = matricula;
        this.cargaHoraria = CARGA_HORARIA_PADRAO;
    }

    public double getSalarioComBonus(){
        return super.salario + ((this.salario * PERCENTUAL_PADRAO_BONUS) / CEM);
    }
}
