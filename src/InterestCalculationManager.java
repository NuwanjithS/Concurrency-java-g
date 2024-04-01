package com.concurrent.banking.simulation;

public class InterestCalculationManager implements Runnable {
	
	private Bank bank;
	public InterestCalculationManager(Bank bank) {
		this.bank = bank;
	  }

	  public double calculateInterest() {
		double interestRate = this.bank.getInterestRate(this.accountType); // Assuming Bank has getInterestRate method
		if (this.balance > 0) {
		  return this.balance * interestRate;
		} else {
			return 0;
		}
	}
	@Override
	public void run() {
		// exception handling has to be added
		bank.addInterest();
	}

}
