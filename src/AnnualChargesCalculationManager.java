package com.concurrent.banking.simulation;

public class AnnualChargesCalculationManager implements Runnable {
	
	private Bank bank;
	
	

	public AnnualChargesCalculationManager(Bank bank) {
		super();
		this.bank = bank;
	}



	@Override
	public void run() {
		// exception handling must be written
		bank.annualCharges();

	}

}
