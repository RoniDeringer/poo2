package injecao_dependencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Aluno extends Pessoa {

    private String matricula;
    private String cpf;
    private Date dataNascimento;
    private String email;
    protected FormatType formatType;

    public Aluno(String nome, String matricula, String cpf, String dataNascimento, String email) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
        this.setEmail(email);
    }
    
    /**
     * Recebe como parametro um tipo de formato (json ou xml)
     * e faz o sysout no retorno do metodo converte
     * que vai retornar uma String no formato desejado
     */
    public void imprima(FormatType formatType){
        System.out.println(formatType.converte(this));
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\nAluno[matricula=");
        builder.append(matricula);
        builder.append(", cpf=");
        builder.append(cpf);
        builder.append(", dataNascimento=");
        builder.append(dataNascimento);
        builder.append(", email=");
        builder.append(email);
        builder.append(super.toString());
        builder.append("]");
        return builder.toString();
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Aluno.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
