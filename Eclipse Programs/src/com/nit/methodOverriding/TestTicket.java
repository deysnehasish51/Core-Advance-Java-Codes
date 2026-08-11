package com.nit.methodOverriding;


class Ticket{
	double baseFare;
	double serviceCharge;
	
	public Ticket(double baseFare, double serviceCharge) {
		super();
		this.baseFare = baseFare;
		this.serviceCharge = serviceCharge;
	}

	public void calculatePrice()
	{
		System.out.println("");
	}
}

class EconomyTicket extends Ticket{
	
	public EconomyTicket(double baseFare, double serviceCharge) {
		super(baseFare, serviceCharge);
		
	}

	@Override
	public void calculatePrice()
	{
		System.out.println("Economy Ticket Price: "+(baseFare+serviceCharge));
	}
}
class BusinessTicket extends Ticket{
	
	public BusinessTicket(double baseFare, double serviceCharge) {
		super(baseFare, serviceCharge);
		
	}

	@Override
	public void calculatePrice()
	{
		System.out.println("Economy Ticket Price: "+(baseFare+serviceCharge));
	}
}


public class TestTicket {

	public static void main(String[] args) {
		
		EconomyTicket economyTicket = new EconomyTicket(3000, 0);
		BusinessTicket businessAccount = new BusinessTicket(3000,1500);
		economyTicket.calculatePrice();
		businessAccount.calculatePrice();

	}

}
