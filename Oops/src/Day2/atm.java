package Day2;

class withdraw//base class
{
	int amt_withdraw=2000;}
public class atm extends withdraw 
{
	
	public class withdraw {

		int amt_withdraw=2000;}
		
	public class amt extends withdraw
	{
			int amt_left=5000;
	}
			
	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			atm ob1=new atm();
			System.out.println("amt withdraw" +ob1.amt_withdraw);
			
		}
}


