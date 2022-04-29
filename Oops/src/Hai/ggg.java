package Hai;
interface myinterface {
	public void m1();
	public void m2();
	int a=20;
}
public class ggg implements myinterface
{
public void m1()
{
	System.out.println("hi");
	System.out.println("Value of a" +a);
}
public void m2()
{System.out.println("bye");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ggg obl=new ggg();
obl.print();
	}
}
