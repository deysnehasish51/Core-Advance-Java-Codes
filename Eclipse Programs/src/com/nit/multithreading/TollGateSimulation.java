package com.nit.multithreading;
/*
Design a java program to simulate a toll gate where multiple vehicles arrive at the gate. 
-If the toll gate is CLOSED, Vehicles must wait.
-If the toll gate is OPENED< only one vehicle is allowed to pass the through the gate.
Requirement:
-Create a class named as TollGate with:
	-boolean variable to indicate gate status
	-synchronized method waitForGate()
		-If gate is CLOSED, the vehicle must wait
		-Use wait() inside while loop
	-synchronized method openGate();
		-Change the gate status to OPEN
		-Wake up one waiting thread (vehicle) using notify()
-Crate another class named as Vehicle with extends Thread
	-Call the waitForGate() of TollGate
-In MainClass named as TollGateSimlation:
	-Create one TollGate object
	-Create two or more vehicle threads
	-Start all the threads
	-Keep the gate Closed for sometime using Thread.sleep()
	-Open the gate by calling openGate()

 */

class TollGate{
	boolean isOpen;
	
	public synchronized void waitForGate() {
		
		try {
			System.out.println(Thread.currentThread().getName()+" is wating. Gate is CLOSED");
			openGate();
			while(!isOpen) {
				wait();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public synchronized void openGate() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		isOpen=true;
		notify();
		System.out.println("Gate is OPENED.");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" is passing through the gate.");
		System.out.println("========================================");
	}
}
class Vehicle extends Thread{
	TollGate tollGate;
	Vehicle(TollGate tollGate) {
		this.tollGate=tollGate;
	}
	@Override
	public void run() {
		tollGate.waitForGate();
	}
}
public class TollGateSimulation {

	public static void main(String[] args) {
		TollGate tollGate = new TollGate();
		Vehicle v1 = new Vehicle(tollGate);
		Vehicle v2 = new Vehicle(tollGate);
		Vehicle v3 = new Vehicle(tollGate);
		
		
		try {
			v1.start();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			v2.start();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			v3.start();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
