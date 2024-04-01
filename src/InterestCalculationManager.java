package com.concurrent.banking.simulation;

public class InterestCalculationManager implements Runnable {
	
	private Bank bank;

	public InterestCalculationManager(Bank bank) {
		super();
		this.bank = bank;
	}



	@Override
	public void run() {
		// exception handling has to be added
		bank.addInterest();
	}

}
