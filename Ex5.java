class Ex5
{
	public static void main(String[] args)
	{
		int x =65;
		int y =75;
		System.out.println("x>=60 && y>=80 -->"+(x>=60 && y>=80));
		System.out.println("x>=60 // y>=80 -->"+(x>=60 || y>=80));
		System.out.println("x>=60 ^ y>=80 -->"+(x>=60 ^ y>=80));//兩個都是ture時結果為false
		System.out.println("x>=60 ^ y>=80 -->"+!(x>=60 ^ y>=80));



/*
		int chi = 65;
		System.out.println("chi>60-->"+(chi>65));
		System.out.println("chi>=60-->"+(chi>=65));
		System.out.println("chi<60-->"+(chi<65));
		System.out.println("chi<=60-->"+(chi<=65));
		System.out.println("chi==60-->"+(chi==65));
		System.out.println("chi!=60-->"+(chi!=65));
*/
	}
}