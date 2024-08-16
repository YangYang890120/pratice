class Ex2
{
	public static void main(String[] args)
	{
		float x =(float)10.12;//casting
		float x2 = 10.12f;//float文件(primitive type)
		float x3 = 10.12F;//java.lang.Float(wrapper class)
		
		System.out.println(x);
		System.out.println(x2);
		System.out.println(x3);

		char y1 = 'a';
		char y2 = 65;
		System.out.println(y1);
		String z = "gdiasojiohkjerf";
		System.out.println(z);

		boolean y3 = false;
		System.out.println(y3);
		String x4 = "\thello\n巨匠";
		System.out.println(x4);

		int a=10;
		int A=10;
		int eeee=41;
		//int public=45;專用字不能命名

		int $yyy=10;
		int _ttt=45;
		int abc4=45;
		//int 4abc=45;前面不能放數字

		int thisIsMyWeb=10;//要連在一起用駝峰命名法

		int 國文=10;
		System.out.println(國文*10); 
	}
}