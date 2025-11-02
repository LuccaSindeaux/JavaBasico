package pokemon;

public abstract class Pokemon {

    protected String nome;
    protected TipoPokemon tipo;
    protected  Movimento movimento;

    protected  int pontosDeSaudeIniciais;
    protected int pontosDeSaude;
    protected int ataque;
    protected int defesa;
    protected int ataqueEspecial;
    protected int defesaEspecial;
    protected int velocidade;

    public Pokemon(String nome, TipoPokemon tipo, Movimento movimento, int saude, int ataque, int defesa, int ataqueEspecial, int defesaEspecial, int velocidade){
        this.nome = nome;
        this.tipo = tipo;
        this.movimento = movimento;
        this.pontosDeSaudeIniciais = saude;
        this.pontosDeSaude = saude;
        this.ataque = ataque;
        this.defesa = defesa;
        this.ataqueEspecial = ataqueEspecial;
        this.defesaEspecial = defesaEspecial;
        this.velocidade = velocidade;
    }

    public int calulcarDano(Pokemon adversario){
        double multiplicadorVantagem = 1.0;

        if (this.tipo == TipoPokemon.FOGO && adversario.tipo == TipoPokemon.GRAMA){
            multiplicadorVantagem = 2.0;
        } else if (this.tipo == TipoPokemon.AGUA && adversario.tipo == TipoPokemon.FOGO){
            multiplicadorVantagem = 2.0;
        } else if (this.tipo == TipoPokemon.ELETRICO && adversario.tipo == TipoPokemon.AGUA){
            multiplicadorVantagem = 2.0;
        } else if (this.tipo == TipoPokemon.GRAMA && adversario.tipo == TipoPokemon.AGUA){
            multiplicadorVantagem = 2.0;
        }

        int poder = this.movimento.getPoder();
        TipoMovimento tipoMov = this.movimento.getTipoMovimento();
        double dano = 0;

        if (tipoMov == TipoMovimento.FISICO){
            dano = 0.5 * poder * multiplicadorVantagem * (this.ataque / (double)adversario.getDefesa());
        } else if (tipoMov == TipoMovimento.ESPECIAL){
            dano = 0.5 * poder * multiplicadorVantagem * (this.ataqueEspecial / (double)adversario.getDefesaEspecial());
        }
        return (int) Math.ceil(dano);
    }

    public String falar(){
        return this.nome;
    }

    // getters

    public String getNome(){
        return this.nome;
    }

    public TipoPokemon getTipo(){
        return this.tipo;
    }
    public Movimento getMovimento(){
        return this.movimento;
    }
    public int getPontosDeSaudeIniciais(){
        return this.pontosDeSaudeIniciais;
    }
    public int getPontosDeSaude(){
        return this.pontosDeSaude;
    }
    public int getAtaque(){
        return this.ataque;
    }
    public int getDefesa(){
        return this.defesa;
    }
    public int getAtaqueEspecial(){
        return this.ataqueEspecial;
    }
    public int getDefesaEspecial(){
        return this.defesaEspecial;
    }
    public int getVelocidade(){
        return this.velocidade;
    }


    // setters
    public void setPontosDeSaude(int pontosDeSaude){
        this.pontosDeSaude = pontosDeSaude;
    }

    public void setAtaque(int ataque){
        this.ataque = ataque;
    }
    public void setDefesa(int defesa){
        this.defesa = defesa;
    }
    public void setAtaqueEspecial(int ataqueEspecial){
        this.ataqueEspecial = ataqueEspecial;
    }
    public void setDefesaEspecial(int defesaEspecial){
        this.defesaEspecial = defesaEspecial;
    }
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    // status
    public boolean estaDerrotado(){
        return this.pontosDeSaude <= 0;
    }
}
