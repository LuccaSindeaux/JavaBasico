package pokemon;

public class Movimento {
    private String nome;
    private int poder;
    private TipoMovimento tipo;

    public Movimento(String nome, int poder, TipoMovimento tipo){
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    public String getNome(){
        return  this.nome;
    }

    public int getPoder(){
        return this.poder;
    }
    public TipoMovimento getTipoMovimento(){
        return this.tipo;
    }

}
