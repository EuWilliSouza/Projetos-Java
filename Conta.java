package ContaCorrente;

public class Conta {
	
	Cliente cliente;
    private int agencia;
    private int numero;
    private int senha;
    private double saldo;
    private static int totalConta = 1000;
    
 //Construtor
	public Conta(Cliente cliente, int agencia, int senha, double saldo) {
		super();
		this.cliente = cliente;
		this.agencia = agencia;
		this.senha = senha;
		this.saldo = saldo;
		this.numero = totalConta;
		totalConta++;
	}
	
	//Saque
			public double saldo (int senha) {
				double valorSaldo = 0.0;
				if(this.senha == senha) {
					
					double valorSaldo1 = this.saldo;
					System.out.println("Saldo" + this.saldo);
				}else {
					System.out.println("Senha Invalida");
				}
				
				return valorSaldo;
			}
			
			public boolean saque (int senha, double valor) {
				boolean confirma = false;
				
				if(this.senha ==senha) {
					
					if(this.saldo >= valor) {
						this.saldo -= valor;
						System.out.println("Saque Realizado");
						confirma = true;
					}else {
						System.out.println("Saldo insuficiente");
					}
				}else {
					System.out.println("Senha Invalida");
				}
				
				return confirma;
			}
			
			//Deposito
			
			public void deposito (double valor) {
				
				this.saldo += valor;
				System.out.println("Valor depositado");			
			}
			
			//Transferencia 
			
			public void transferencia (int senha, double valor, Conta c) {
				
			boolean conf = saque(senha, valor);
			
			if(conf) {
				c.deposito(valor);
				System.out.println("Transferencia realizada com sucesso");
			}else {
				System.out.println();
			}
				
			}
			
			public void dadosCliente (int senha) {
				if(this.senha == senha) {
					System.out.println("Dados do Cliente" + "\n" + 
				"Nome: " + this.cliente.cliente + "\n" + 
							"CPF: " + this.cliente.cpf + "\n" + 
				"Telefone: " + this.cliente.telefone);
				}else {
					System.out.println("Senha invalida");
				}
			}

}
