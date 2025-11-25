package aula123_124.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import aula123_124.entities.Department;
import aula123_124.entities.HourContract;
import aula123_124.entities.Worker;
import aula123_124.entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Department department = new Department("Vendas");
		Worker trabalhador = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.00, department);
		
		Date data1 = sdf.parse("20/10/2025");
		HourContract contrato1 = new HourContract(data1, 50.0, 20);
		
		Date data2 = sdf.parse("25/11/2025");
		HourContract contrato2 = new HourContract(data2, 80.0, 15);
		
		trabalhador.addContract(contrato1);
		trabalhador.addContract(contrato2);
				
		Double renda = trabalhador.income(2025, 11);
		
		System.out.println("Nome: " + trabalhador.getName());
		System.out.println("Departamento: " + trabalhador.getDepartment().getName());
		System.out.println("Renda de 11/2025: "+String.format(Locale.US, "%.2f", renda));
		
	}

}
