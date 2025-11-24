package exercicio_dois;

public class Program {

	public static void main(String[] args) {
		
		SensorTemperatura sensor = new SensorTemperatura("SALA-01", "Laboratório de Redes");
		
		sensor.registarLeitura(22.5);
		sensor.registarLeitura(23.0);
		sensor.registarLeitura(24.2);
		sensor.registarLeitura(21.8);
		sensor.registarLeitura(23.5);
		
		System.out.println(sensor);
		
	}

}
