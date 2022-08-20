package atendimento_medico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class ListaAtendimento {

    protected List<Atendimento> listaAtendimento = new ArrayList<Atendimento>();

    
    /**
     * construtor recebe atendimento, e já adiciona na lista de atedimento!
     *
     * @param atedimento
     */
    public ListaAtendimento(Atendimento atendimento) {
        listaAtendimento.add(atendimento);
    }

    public void addLista(Atendimento atendimento) {
        listaAtendimento.add(atendimento);
    }

    public void mostrarLista() {
        System.out.println(listaAtendimento);
    
    }

    public List<Atendimento> getListaAtendimento() {
        return listaAtendimento;
    }

    public void setListaAtendimento(List<Atendimento> listaAtendimento) {
        this.listaAtendimento = listaAtendimento;
    }

   
}
