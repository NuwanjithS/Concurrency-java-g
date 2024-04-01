package com.concurrent.banking.simulation;

public class IncomeTaxCalculationManager implements Runnable {
	
	private Bank bank;
	
	

	public IncomeTaxCalculationManager(Bank bank) {
		super();
		this.bank = bank;
	}



	@Override
	public void run() {
		// exception handling must be written
		bank.deductIncomeTax();

	}

}
