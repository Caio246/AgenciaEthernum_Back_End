package model;

public class Destino {
	
	private Integer id;
	private Integer telefone;
	private String nome;
	private String local_de_partida;
	private Integer data_de_partida;
	private String local_de_destino;
	private Integer data_de_destino;
	
	
	public Destino(String nome, Integer telefone, String local_de_partida, Integer data_de_partida, String local_de_destino, Integer data_de_destino) {
	
		this.nome = nome;
		this.telefone = telefone;
		this.local_de_partida = local_de_partida;
		this.data_de_partida = data_de_partida;
		this.local_de_destino = local_de_destino;
		this.data_de_destino = data_de_destino;
	}

	public Destino() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal_de_partida() {
		return local_de_partida;
	}

	public void setLocal_de_partida(String local_de_partida) {
		this.local_de_partida = local_de_partida;
	}

	public Integer getData_de_partida() {
		return data_de_partida;
	}

	public void setData_de_partida(Integer data_de_partida) {
		this.data_de_partida = data_de_partida;
	}

	public String getLocal_de_destino() {
		return local_de_destino;
	}

	public void setLocal_de_destino(String local_de_destino) {
		this.local_de_destino = local_de_destino;
	}

	public Integer getData_de_destino() {
		return data_de_destino;
	}

	public void setData_de_destino(Integer data_de_destino) {
		this.data_de_destino = data_de_destino;
	}

	public void setModelo(int i) {
		// TODO Auto-generated method stub
		
	}

	public void setModelo(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setId(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String next) {
		// TODO Auto-generated method stub
		
	}



}
