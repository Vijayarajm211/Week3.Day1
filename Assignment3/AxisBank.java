package week3.day1.assignments;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		double Axisbk=1000.16;
		System.out.println("AxisBank Deposit Amount is :"+Axisbk);
		
	}

	public static void main(String[] args) 
	{
		
		AxisBank axisobj=new AxisBank();
		axisobj.saving();
		System.out.println("AxisBank Saving Amount is: " +axisobj.saving());
		axisobj.fixed();
		axisobj.deposit();
		
	}
}
