package injecao_dependencia.exemplo_generico;

/**
 *
 * @author roni.aviz
 */
public class Uva {
    private String cor;
    public Uva(String cor){
        setCor(cor);
    }

    
 @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nUva[cor=");
        builder.append(cor);
        builder.append("]");
        return builder.toString();
    }   
    
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}

