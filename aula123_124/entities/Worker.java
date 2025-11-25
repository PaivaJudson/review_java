package aula123_124.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import aula123_124.entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Department department;
	private List<HourContract> contrats = new ArrayList<>();
	
	
	public Worker() {}
	
	
	
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}



	public void addContract(HourContract contract) {
		contrats.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contrats.remove(contract);
	}
	
	public Double income(Integer year, Integer month) {
		double sum = baseSalary;
		Calendar calendar = Calendar.getInstance();
		
		for (HourContract hourContract : contrats) {
			int c_year = calendar.get(Calendar.YEAR);
			int c_month = calendar.get(Calendar.MONTH) + 1;
			
			if (year == c_year && month == c_month) {
				sum +=hourContract.totalValue();
			}
			
		}
		
		return sum;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	
	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}
	
	
	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContrats() {
		return contrats;
	}

}
