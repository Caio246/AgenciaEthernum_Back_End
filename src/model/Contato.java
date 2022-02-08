package model;

public class Contato {
	
	private Integer id;
	private String nome;
	private String email;
	private String mensagem;

	
	public Contato(String nome, String email, String mensagem) {
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public void setId(String next) {
		// TODO Auto-generated method stub
		
	}

	public String Mensagem() {
		// TODO Auto-generated method stub
		return null;
	}
}
