class Ex8
{
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("請輸入國文分數");
		int chi;
		chi = sc.nextInt();
		

		System.out.println("請輸入英文分數");
		int eng;
		eng = sc.nextInt();

		System.out.println("你的分數為\n國文"+chi
							+"\n英文"+eng
							+"\n總分"+(chi+eng));

	}
}