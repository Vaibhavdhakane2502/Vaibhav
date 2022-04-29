package Hai;

interface hi{
	void print ();
	int i=25;
}
interface bye{
	void show();

}
public class afg implements hi,bye
{
public void print()
{
	System.out.println("hi");

}
public void println()
{
	System.out.println("bye");

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
afg obl=new afg();
obl.print();
	}

}
