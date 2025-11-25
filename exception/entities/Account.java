package exception.entities;

import exception.DomainException;

public class Account {
	
	private Integer number;
	private Double balance;
	
	
	public Account() {}

	public Account(Integer number, Double balance) {
		this.number = number;
		this.balance = balance;
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			throw new DomainException("Erro de Saque: Saldo insuficiente.");
		}
		
		if (amount <=0) {
			throw new DomainException("Erro de Saque: O valor deve ser positivo.");
		}
		
		balance -= amount;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + "]";
	}
}
