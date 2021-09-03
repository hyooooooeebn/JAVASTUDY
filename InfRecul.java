public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(5);
		
	}

/*
	public static void showHi(int cnt)
	{
		System.out.println("Hi~~");
		showHi(cnt--);
		if (cnt==1)
			return;
	}
	*/

		public static void showHi(int cnt)
	{
		System.out.println("Hi~~");

		if (cnt==1)				//조건을 확인한 후
			return;

		showHi(--cnt);			//감소시켜야한다.....
	}
}