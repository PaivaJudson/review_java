package exercicio_dois;

/**
 * Modelar um sensor de temperatura que regista leituras e calcula estatísticas simples de
 * monitorização de ambiente.
 * 
 * @author Judson Paiva
 * @version 1.0
 * @since 1
 * 
 * 
 * @see Program
 */

public class SensorTemperatura {
	
	private String identificador;
	private String local;
	private double leituraMinima;
	private double leituraMaxima;
	private double somaLeituras;
	private int quantidadeLeituras;
	
	/**
	 * Construtor com parametro quando se instanciar o constructor SensorTemperatura
	 * @param identificador identifica o local onde monta-se o sensor. Exemplo SALA-01
	 * @param local nome por extensao do local. Exemplo Laboratorio de Informatica
	 */
	
	public SensorTemperatura(String identificador, String local) {
		this.identificador = identificador;
		this.local = local;
		somaLeituras = 0;
		quantidadeLeituras = 0;
	}
	
	/**
	 * @param valor e o valor da temperatura em si
	 * Na primeira vez se da quando a quantidadeLeituras e = 0
	 * Nesse momento leitura maxima = a leitura minima
	 */
	
	public void registarLeitura(double valor) {
		if(quantidadeLeituras == 0) {
			
			leituraMaxima = valor;
			leituraMinima = valor;	
		}else {
			if(leituraMaxima < valor) {
				leituraMaxima = valor;
			}else if(leituraMinima > valor) {
				leituraMinima = valor;
			}
		}

		somaLeituras += valor;
		quantidadeLeituras++;
	}
	
	
	/**
	 * Devolver a media de todas as temperaturas lidas
	 * @return a media dass temperaturas, caso nao haja media retorna zero
	 */
	
	public double obterMedia() {
		if(quantidadeLeituras > 0) {
			return somaLeituras / quantidadeLeituras;
		}
		return 0.0;
	}
	
	public double obterIntervalor() {
		return leituraMaxima - leituraMinima;
	}

	@Override
	public String toString() {
		return "SensorTemperatura [identificador=" + identificador + ", local=" + local + ", leituraMinima="
				+ leituraMinima + ", leituraMaxima=" + leituraMaxima + ", somaLeituras=" + somaLeituras
				+ ", quantidadeLeituras=" + quantidadeLeituras + ", obterMedia()=" + obterMedia()
				+ ", obterIntervalor()=" + obterIntervalor() + "]";
	}
	
}
