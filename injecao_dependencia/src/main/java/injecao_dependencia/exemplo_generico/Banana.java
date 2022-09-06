package injecao_dependencia.exemplo_generico;

/**
 *
 * @author roni.aviz
 */
public class Banana {
    private String tipo;
    private String origem;
    
    public Banana(String tipo, String origem){
        setTipo(tipo);
        setOrigem(origem);
    }

 @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nBanana[tipo=");
        builder.append(tipo);
        builder.append(", origem=");
        builder.append(origem);
        builder.append("]");
        return builder.toString();
    }    
    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
}
