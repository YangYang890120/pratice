class Ex4
{
	public static void main(String[] args)
	{
		int x = 10;
		x++;
		System.out.println(x);

		int a= 10;
		int b;
		b=a++;
		System.out.println("a="+a);
		System.out.println("b="+b);
		b=++a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		b=--a;
		System.out.println("a="+a);
		System.out.println("b="+b);
		b=a--;
		System.out.println("a="+a);
		System.out.println("b="+b);

	}
}