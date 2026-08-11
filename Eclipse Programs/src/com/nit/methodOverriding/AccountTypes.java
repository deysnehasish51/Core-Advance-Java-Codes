package com.nit.methodOverriding;
class Account{
	public void showAccountType()
	{
		System.out.println("Generic Account");
	}
}
class PersonalAccount extends Account{
	@Override
	public void showAccountType()
	{
		System.out.println("Account Type: Personal");
	}
}
class BusinessAccount extends Account{
	@Override
	public void showAccountType()
	{
		System.out.println("Account Type: Business");
	}
}
public class AccountTypes {

	public static void main(String[] args) {
		
		PersonalAccount p = new PersonalAccount();
		p.showAccountType();
		BusinessAccount b =new BusinessAccount();
		b.showAccountType();
		
		Account[] accounts = {new PersonalAccount(),new BusinessAccount()};
		
		for(Account acc: accounts)
		{
			acc.showAccountType();
		}
		
	}

}
