package com.nit.interfaceProgram;

class Vehicle
{
	public void showType()
	{
		System.out.println("Generic Vehicle");
	}
}

class TwoWheeler extends Vehicle
{
	@Override
	public void showType()
	{
		System.out.println("Vehicle Type: TwoWheeler");
	}
}

interface Electric
{
	public void showElectricFeature();
}

class Bike extends TwoWheeler implements Electric
{
	@Override
	public void showElectricFeature()
	{
		System.out.println("Bike Electric Feature: Battery Assist Ennabled.");
	}
}

class Car extends Vehicle
{
	@Override
	public void showType()
	{
		System.out.println("Sports Car Type: Car");
	}
}

interface GPS
{
	public void showGPSFeatures();
	
}
class SportsCar extends Car implements GPS
{
	@Override
	public void showGPSFeatures()
	{
		System.out.println("GPS Feature: Navigation,Time Traffic");
	}
}
public class TestVehicle {

	public static void main(String[] args) {
		Vehicle vehicle = new Bike();
		
		vehicle.showType();
		Bike bike = (Bike)vehicle;
		bike.showElectricFeature();

		Vehicle v = new SportsCar();
		v.showType();
		SportsCar s = (SportsCar) v;
		s.showGPSFeatures();
		
	}

}
