package model;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String email;
	private Integer cpf;
	private Integer telefone;
	private Integer registrigeral;

	public Cliente(String nome, String email, Integer cpf, Integer telefone, Integer registrigeral) {
	
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
		this.registrigeral = registrigeral;
	}

	public Cliente() {
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
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Integer getRegistrigeral() {
		return registrigeral;
	}
	public void setRegistrigeral(Integer registrigeral) {
		this.registrigeral = registrigeral;
	}

	public void setTelefone(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setCpf(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(int nextInt) {
		// TODO Auto-generated method stub
		
	}

	public void setId(String next) {
		// TODO Auto-generated method stub
		
	}
	
}
