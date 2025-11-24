package exercicio_quatro;

public class Main {

	public static void main(String[] args) {
		
		Endereco end_um = new Endereco("Av. Deolinda Rodrigues, 1000", "Kinaxixe", "Luanda", "Angola");
		Cliente cliente = new Cliente("João Manuel", "005000123LA044", "923000111", end_um);
		System.out.println(cliente);
		
		Endereco end_dois = new Endereco("Rua Direita do Camama, 250",  "Camama", "Luanda", "Angola");
		cliente.atualizarEndereco(end_dois);
		System.out.println(cliente);
	}

}
