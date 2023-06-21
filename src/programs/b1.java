package programs;

class ex
{

	public void add()
	{
		System.out.println("hi");
		
//		b1 b=new b1();
		b1.name();
		b1.main(null);
	}
	
	
}


class b1
{
	public static void name() 
	{
	System.out.println("hello");	
	}
	
	public static void main(String[] args) 
	{
	
		ex e=new ex();
		e.add();
				
		
	}
}
