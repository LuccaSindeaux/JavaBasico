package pessoa;

public class Gerente extends Funcionario{
    private boolean gerenteRegional;

    public Gerente(String nome, String cpf, String matricula, boolean isGerenteRegional){
        super(nome, cpf, matricula);
        this.gerenteRegional = isGerenteRegional;
    }

    public boolean isGerenteRegional(){
        return gerenteRegional;
    }

    public void setGerenteRegional(boolean gerenteRegional){
        this.gerenteRegional = gerenteRegional;
    }
}
