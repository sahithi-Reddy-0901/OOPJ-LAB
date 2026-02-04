class overload 
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) 
	{
		overload obj=new overload();
		System.out.println("sum of two integers="+obj.add(10,20));
		System.out.println("sum of three integers="+obj.add(5,15,25));
	}
}
