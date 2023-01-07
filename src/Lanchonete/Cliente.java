package Lanchonete;

public class Cliente {

	private String nome;
	private String endereço;
	private long telefone;
	public Cliente(String nome, String endereço, long telefone){
		super();
		this.nome = nome;
		this.endereço = endereço;
		this.telefone = telefone;	
	}
	public Cliente (String nome, long telefone) {
		super();
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public void ImprimirInfo() {
		System.out.println("Cadastro Efetuado!!!\nNome do cliente: "+getNome()+"\nTelefone: "+getTelefone());
	}
	
}
	


