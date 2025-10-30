public class Recurso {

    private final int valor;
    private final int peso;

    public Recurso(int valor, int peso){
        this.valor = valor;
        this.peso = peso;
    }

    public int getValor(){
        return this.valor;
    }

    public int getPeso(){
        return this.peso;
    }

    @Override
    public String toString(){
        return "Recursos [valor = " + valor + ", peso = " + peso + "]";
    }
}
