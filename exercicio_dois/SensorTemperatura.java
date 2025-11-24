package exercicio_dois;

public class SensorTemperatura {
	
	private String identificador;
	private String local;
	private double leituraMinima;
	private double leituraMaxima;
	private double somaLeituras;
	private int quantidadeLeituras;
	
	
	public SensorTemperatura(String identificador, String local) {
		this.identificador = identificador;
		this.local = local;
		somaLeituras = 0;
		quantidadeLeituras = 0;
	}

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
