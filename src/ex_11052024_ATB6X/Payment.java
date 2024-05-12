package ex_11052024_ATB6X;

public class Payment {

	double courseFee;
	String modeOfPayment;
	boolean fullPayment;

	public void isItPaid()
	{
		System.out.println("The course fee is paid");
	}

	public float InstallmentAmount(float amt)
	{
		return amt;
	}

	public void dispPay()
	{
		System.out.println("The courseFee is: "+courseFee+"\n" +
		                     "The mode of payment is: "+modeOfPayment+ "\n"+
		                      "Is full Payment done? = "+fullPayment);
	}
}

