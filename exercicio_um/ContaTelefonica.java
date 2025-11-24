package exercicio_um;

public class ContaTelefonica {

	private String numero;
	private String plano;
	private int limiteDadosMB;
	private int dadosConsumidosMB;
	private double valorMensalBase;
	private double valorPorMBExcedente;
	
	
	public ContaTelefonica(String numero, String plano, int limiteDadosMB, double valorMensalBase) {
		this.numero = numero;
		this.plano = plano;
		this.limiteDadosMB = limiteDadosMB;
		this.valorMensalBase = valorMensalBase;
	}

	public ContaTelefonica(String numero, String plano, 
						   int limiteDadosMB, int dadosConsumidosMB,
						   double valorMensalBase, double valorPorMBExcedente) {
		this.numero = numero;
		this.plano = plano;
		this.limiteDadosMB = limiteDadosMB;
		this.dadosConsumidosMB = dadosConsumidosMB;
		this.valorMensalBase = valorMensalBase;
		this.valorPorMBExcedente = valorPorMBExcedente;
	}

	public void registarConsumoDados(int mb) {
		dadosConsumidosMB = dadosConsumidosMB + mb;
	}
	
	public int calcularExcedenteMB() {
		
		if(dadosConsumidosMB > limiteDadosMB) {
			return dadosConsumidosMB - limiteDadosMB;
		}
		return 0;
	}
	
	public double calcularValorAPagar() {
		return valorMensalBase + calcularExcedenteMB() * valorPorMBExcedente;
	}

	
	@Override
	public String toString() {
		return "ContaTelefonica [numero=" + numero + ", plano=" + plano + ", limiteDadosMB=" + limiteDadosMB
				+ ", dadosConsumidosMB=" + dadosConsumidosMB + ", valorMensalBase=" + valorMensalBase
				+ ", valorPorMBExcedente=" + valorPorMBExcedente + ", calcularExcedenteMB()=" + calcularExcedenteMB()
				+ ", calcularValorAPagar()=" + calcularValorAPagar() + "]";
	}
	
}
