/*WAP to calculate and display the final electricity bill for a customer based on :
 Unit Consumed: Input by User
 Cost per Unit:5
 fixed charge=100
 surcharge:10% of the total bill(excluding fixed charge)
  */

package com.nit.userdefinedmethods;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BillingSystem c1 = new BillingSystem();
		
		System.out.println("Enter the Unit Consumed :");
		
		int unitConsumed=sc.nextInt();
		
		System.out.println("Cost Per Unit : ");
		double costPerUnit=sc.nextDouble();
		
		c1.setData(unitConsumed, costPerUnit);
		c1.calculateBill();
		c1.display();
		sc.close();

	}

}

class BillingSystem
{
	int unitConsumed;
	
	double costPerUnit;
	public static final double FIXED_CHARGE=100;
	double surcharge;
	double finalBill;
	
	public void setData(int unitConsumed,double costPerUnit)
	{
		this.unitConsumed=unitConsumed;
		this.costPerUnit=costPerUnit;
	}
	
	public void calculateBill()
	{
		double price=this.costPerUnit*this.unitConsumed;
		
		this.surcharge=price*0.10;
		
		this.finalBill=price+this.surcharge+FIXED_CHARGE;
		
	}
	public void display()
	{
		System.out.println("Unit Consumed : "+this.unitConsumed);
		System.out.println("Cost Per Unit : "+this.costPerUnit);
		System.out.println("Surcharge Applied : "+this.surcharge);
		System.out.println("Final Price : "+this.finalBill);
	}
}
