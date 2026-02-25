package ContaCorrente;

public class Cliente {
	
	protected String cliente;
	protected String cpf;
	protected String telefone;
	
	public Cliente(String cliente, String cpf, String telefone) {
		
		this.cliente = cliente;
		this.cpf = cpf;
		this.telefone = telefone;
		
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public String getTelefone() {
		return telefone;
	}


}
