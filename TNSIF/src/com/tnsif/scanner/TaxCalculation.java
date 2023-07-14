package com.tnsif.scanner;

public class TaxCalculation {

	public void calculateTax(Person person)
	{
		if(person.getAge()>65 || (person.getGender().equalsIgnoreCase("female")) || (person.getIncome()<=160000))
		{
			person.setTax(0);
			System.out.println("Tax not applicable");
		}
		else if(person.getIncome()>160000 && person.getIncome()<=500000)
		{
			person.setTax((person.getIncome()-160000)*10/100);
		}
		else if(person.getIncome()>500000 && person.getIncome()<=1000000)
		{
			person.setTax((person.getIncome()-160000)*15/100+10000);
		}
		else if(person.getIncome()>1000000 && person.getIncome()<=2000000)
		{
			person.setTax((person.getIncome()-160000)*20/100+20000);
		}
		else if(person.getIncome()>2000000)
		{
			person.setTax((person.getIncome()-160000)*50/100+50000);
		}
	}
}
