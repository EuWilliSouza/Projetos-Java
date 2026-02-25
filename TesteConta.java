package ContaCorrente;

public class TesteConta {
	
	//instanciar a classe Scanner "ler"
	
		public static void main(String[] args) {
			
		//instanciar a classe Cliente "cliente1"	
		
		Cliente Cli01 = new Cliente("Willian", "123.456.789-01", "(11) 95211-0881");
		
		//instanciar a classe Cliente "cliente2"
		
		Cliente Cli02 = new Cliente("Thais", "987.654.321-98", "(11) 94748-5738");
		
		// Conta 1
		
		Conta Ct01 = new Conta(Cli01, 123, 222, 100);
		
		// Conta 2
		
		Conta Ct02 = new Conta(Cli02, 456, 333, 100);
		
		//Transferencia 
		
		Ct01.transferencia(222, 100, Ct02);
		
		//Dados do cliente
		
		Ct02.dadosCliente(333);
		
		
		
		
		}

}
