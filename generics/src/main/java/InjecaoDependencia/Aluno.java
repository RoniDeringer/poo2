package InjecaoDependencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roni Deringer <ronideringer.ifc@gmail.com>
 */
public class Aluno <E>{
    
    private String nome;
    private int idade;
    protected FormatType formatType;

    public Aluno(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
    
     /**
     * imprima() Recebe como parametro um tipo de formato (json ou xml)
     * faz o sysout do retorno do metodo converte() 
     * converte() recebe como parametro meu objeto atual Aluno
     * e retorna uma String no formato que desejado
     */
    public void imprima(FormatType formatType) {
        System.out.println(formatType.converte(this));
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public FormatType getFormatType() {
        return formatType;
    }

    public void setFormatType(FormatType formatType) {
        this.formatType = formatType;
    }
    
    
    
    
    
}
