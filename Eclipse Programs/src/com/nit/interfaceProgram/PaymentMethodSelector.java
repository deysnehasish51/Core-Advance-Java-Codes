package com.nit.interfaceProgram;

class Mobile{
	public void showBasicFeatures()
	{
		System.out.println("Basic Moblie Features");
	}
}
class Phone extends Mobile
{
	public void call()
	{
		System.out.println("Call Connected through Phone");
	}
	public void SMS()
	{
		System.out.println("Message Sent Successfully");
	}
}
interface Payment
{
	public void showPaymentApps(String paymentMehods);
	
}

class SmartPhone extends Phone implements Payment
{
	@Override
	public void showPaymentApps(String paymentMethods)
	{
		System.out.println("Payment Apps: "+paymentMethods);
	}
}
public class PaymentMethodSelector {

	public static void main(String[] args) {
		
		SmartPhone s1 = new SmartPhone();
		
		s1.call();
		s1.SMS();
		s1.showBasicFeatures();
		s1.showPaymentApps("Mobile");
	}

}
