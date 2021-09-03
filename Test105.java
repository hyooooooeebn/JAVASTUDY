/*===============================================
	  ■■■ 정렬(sort) 알고리즘 ■■■
	  - 향상된 버블 정렬(Bubble Sort)
=================================================*/

/*
	※ 앞에서 확인해 본 Selection Sort나 Bubble Sort의 성능은 같다.
	    (→ 반복 횟수로 추정)
		하지만 향상된 버블 정렬은 대상 데이터의 구조에 따라서
		일반 버블 정렬이나 선택 정렬보다 성능이 좋을 수 있다.

원본데이터 : 61 15 20 22 30
			 15 20 22 30 61 - 1회전 (스왑 발생 -> true)  -> 다음 회전 o
			 15 20 22 30 61 - 2회전 (스왑 발생 -> false) -> 다음 회전 x


==> 1회전 수행,,,2회전 수행,,.을 해보았더니,,,
	2회전에서 스왑이 일어나지 않았기때문에
	불필요한 추가 연산은 무의미한 것으로 판단하여 수행하지 않는다.

*/



public class Test105
{
	public static void main(String[] args)
	{
		int[] a = {10, 50,20,30,40};

		System.out.print("Source Data : ");
		for (int n : a )
			System.out.print(n + " ");
		System.out.println();


		/*
		10 50 20 30 40		0	1
							1	2
							2	3
							3	4
						------------1회전 -> 스왑발생
		10 20 30 40 50		0	1
							1	2
							2	3
					    ------------2회전 -> 스왑발생Ⅹ
		...다음 회전 발생하지 않음

		*/


/*
		int i,j;
		int c=0;
	
		for (i =1; i<a.length; i++)			
		{
			c=0;
			for (j = 0 ; j< a.length-i ; j++) 
			{
				
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					c++;
					
				} 
			} if (c==0)	
				
				break;
			 
		}  
		
		*/			
				
	
		
/*
	int i=0,j;
		
	boolean b;	
	
	do
	{
		b=false;
		for (i =1; i<a.length; i++)
		{
		for (j = 0 ; j< a.length-n ; j++) 
			{
				
				if (a[j] > a[j+1])
				{
					a[j] = a[j]^a[j+1];
					a[j+1] = a[j+1]^a[j];
					a[j] = a[j]^a[j+1];
					b =true;
						
				} 				
				
			} 
		}System.out.println(b);
		
	}
	while (b);
	
		*/
			

		boolean flag;
		int temp;
		int pass=0;

		//향상된 Bubble Sort 구현
		do
		{
			flag = false;
			pass++;
			for (int i=0;i<a.length-pass ;i++ )
			{
				if (a[i]>a[i+1])
				{
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;

					flag = true;
					// 단 한번이라도 스왑이 발생하게 되면 flag변수는 true로 변경
				}
				
			}
		}
		while (flag);
		//--flag 변수가 false라는 것은 회전이 구분적으로 발생하느 동안 스왑이 일어나지 않은 경우
		//	더 이상의 반복문 수행은 무의미한 것으로 판단


				
		System.out.print("Sorted Data : ");
		for (int n : a )
			System.out.print(n + " ");
		System.out.println();

	}
}
//최종결과
/*
Source Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
계속하려면 아무 키나 누르십시오 . . .
*/