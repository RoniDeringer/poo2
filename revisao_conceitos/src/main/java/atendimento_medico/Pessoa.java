package atendimento_medico;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public abstract class Pessoa {

    private Date dataNascimento;
    private String nome;
    
    

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

     @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" Pessoa[nome=");
        builder.append(nome);
        builder.append(", dataNascimento= ");
        builder.append(dataNascimento);
        builder.append("]");
        return builder.toString();
    }

    
}
