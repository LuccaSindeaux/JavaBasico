public class Conta {
    double saldo;

    public void sacar(double valorSacar){
        saldo = saldo - valorSacar;
        System.out.println("Saldo atual: " + saldo);
    }

    public void depositar(double valorDepositar){
        saldo =  saldo + valorDepositar;
        System.out.println("Saldo atual: " + saldo);
    }

}
