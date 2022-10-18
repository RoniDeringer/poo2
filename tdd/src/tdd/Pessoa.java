package tdd;

public class Pessoa {
	private String nome;
	private String sobreNome;
	
	
	public Pessoa(String nome, String sobreNome) {
		setNome(nome);
		setSobreNome(sobreNome);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobreNome() {
		return sobreNome;
	}
	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String nomeCompleto() {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(sobreNome);
		return builder.toString();
	}
	
	
	@Override
	public String toString()  {
		StringBuilder builder = new StringBuilder();
		builder.append(nome);
		builder.append(" ");
		builder.append(sobreNome);
		return builder.toString();
		}
	
}
