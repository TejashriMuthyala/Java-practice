class first
{
	public static void main(String args[])
	{
		System.out.println("Tejas");
		display();
		first obj=new first();
		obj.greet();
	}
	
	public static void display(){
	
		System.out.println("Static");
	}
	
	public void greet(){
	
		System.out.println("Non Static");
	}

}