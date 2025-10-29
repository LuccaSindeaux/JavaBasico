package pessoa;

public class Vendedor extends Funcionario{
    private int qtdDeVendas;

    public Vendedor(String nome, String cpf, String matricula){
        super(nome, cpf, matricula);
    }
}
