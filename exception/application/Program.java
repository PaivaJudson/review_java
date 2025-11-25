package exception.application;

import exception.DomainException;
import exception.entities.Account;

public class Program {


	public static void main(String[] args) {
		
		try {
			Account account = new Account(1001, 500.0);
			account.withdraw(600);
			System.out.println("Saque realizado...");
			System.out.println(account);
		} catch (DomainException e) {
			
			System.out.println("Ocorreu um erro "+e.getMessage());
		} catch (RuntimeException e) {
			
			System.out.println("Ocorreu um erro "+e.getMessage());
		}
	}

}
