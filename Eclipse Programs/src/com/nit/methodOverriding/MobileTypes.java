package com.nit.methodOverriding;
class Mobile{
	public void showDetails()
	{
		System.out.println("Generic Moblie");
	}
}
class SmartPhone extends Mobile{
	@Override
	public void showDetails()
	{
		System.out.println("Operating System: Android/iOS");
	}
}
class FeaturePhone extends Mobile{
	@Override
	public void showDetails()
	{
		System.out.println("Features:Call,SMS,FM Radio");
	}
}
public class MobileTypes {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.showDetails();
		
		FeaturePhone fp = new FeaturePhone();
		fp.showDetails();
		
		Mobile[] mobile = {new SmartPhone(),new FeaturePhone()};
		for(Mobile m:mobile)
		{
			m.showDetails();
		}
	}

}
