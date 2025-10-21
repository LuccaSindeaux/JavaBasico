public class calculoComissao {
    double valorVendido;
    double percentualComissao;

    public double calcularValorComissao(){
        return (valorVendido * percentualComissao) / 100 ;
    }
}
