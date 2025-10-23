public class Conta {
    private int numero;
    private double saldo;

    // Construtor
    public Conta (int numero){
        this.numero = numero;
    }  // Estou dizendo no meu construtor que quando crio uma conta,
      // quero que seja informado seu numero como argumento, ou seja:
     // toda conta criada PRECISA de um número -> regra de negócio.

    //Criando um construtor que quando faço uma conta posso definir seu numero e saldo
//    public Conta(int numero, double saldoInicial){
//        this.numero = numero;
//        this.saldo = saldoInicial;
//    }

    // Métodos
    public boolean sacar(double valorSacar){
        if (this.saldo >= valorSacar) {
            this.saldo = this.saldo - valorSacar;
            return true; // boolean
        }
        return false; // boolean
    }

    public void depositar(double valorDepositar){
        this.saldo =  this.saldo + valorDepositar;
    }

    public boolean transferir(Conta contaDestino, double valorTransferir) {
        boolean foiPossivelSacar = this.sacar(valorTransferir);
        if (foiPossivelSacar){
            contaDestino.depositar(valorTransferir);
            return true;
        }
        return false; // por ser boolean, é o mesmo que ser o "else" de um if else padrão

    }

    // noções de get e set
    public double getSaldo() {
        return this.saldo;
    }

    public double getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
        // Se eu quisesse que numeros de conta fossem imutáveis, basta remover o metodo set
    }
}