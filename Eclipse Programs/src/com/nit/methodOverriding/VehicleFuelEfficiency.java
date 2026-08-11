package com.nit.methodOverriding;

class Vehicle{
	public void fuelEfficiency()
	{
		System.out.println("Vehicle Fuel Efficiency: 0 km/l");
	}
}
class Car extends Vehicle{
	
	@Override
	public void fuelEfficiency()
	{
		System.out.println("Car Fuel Efficiency: 15 km/l");
	}
}
class Bike extends Vehicle{
	@Override
	public void fuelEfficiency()
	{
		System.out.println("Bike Fuel Efficiency: 40 km/l");
	}
}
class Truck extends Vehicle{
	@Override
	public void fuelEfficiency()
	{
		System.out.println("Turck Fuel Efficiency: 8 km/l");
	}
}
public class VehicleFuelEfficiency {

	public static void main(String[] args) {
		Vehicle[] vehicles = {new Car(),new Bike(),new Truck()};
		
		for(Vehicle i:vehicles)
		{
			i.fuelEfficiency();
		}

	}

}
