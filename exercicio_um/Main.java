package exercicio_um;

public class Main {

	public static void main(String[] args) {
		
		ContaTelefonica conta = new ContaTelefonica("923456789", "Pós-pago", 5000, 0, 10000.0, 5.0);
		
		conta.registarConsumoDados(2000);
		conta.registarConsumoDados(1500);
		conta.registarConsumoDados(2500);
		
		System.out.println(conta);
	}
}
