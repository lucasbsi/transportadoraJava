package br.com.lucasbsi.model;

public class ModelFuncionario {
	
	private String nome;
	private String telefone;
	private String email;
	private String cidade;
	private String estado;
	private String endereco;
	private String numero;
	private int matricula;
	
	
	public ModelFuncionario(String nome, String telefone, String email, String cidade, String estado, String endereco,
			String numero, int matricula) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.cidade = cidade;
		this.estado = estado;
		this.endereco = endereco;
		this.numero = numero;
		this.matricula = matricula;
	}
	
	public ModelFuncionario() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
    
	

}
