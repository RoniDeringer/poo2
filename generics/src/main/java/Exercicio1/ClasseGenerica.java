package Exercicio1;

/**
 *
 * @author Roni
 */
public class ClasseGenerica <T> {
    
    private T atributoGenerico;

    public ClasseGenerica(T atributoGenerico) {
        setAtributoGenerico(atributoGenerico);
    }

    public T getAtributoGenerico() {
        return atributoGenerico;
    }

    public void setAtributoGenerico(T atributoGenerico) {
        this.atributoGenerico = atributoGenerico;
    }
     @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ClasseGenerica[atributoGenerico=");
        builder.append(atributoGenerico);
        builder.append("]");
        return builder.toString();
    }
}
