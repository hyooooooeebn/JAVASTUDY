/*==============================
   ��� �ڹ��� �ֿ� Ŭ�������
		- Random Ŭ����
================================*/
/*
��  java.util.Random Ŭ������
	
	���� ������ ������ �߻����� �����ϴ� Ŭ������
	MathŬ������ ���� �޼ҵ��� random() �޼ҵ嵵
	������ �߻����� �����ϴ¸޼ҵ�����
	0.0 ~ 1.0 ������ �Ǽ� ���¸� �߻��ϰ� �ǹǷ�
	�ʿ��ѿ��� ������ ������ ���������ؼ���
	�߰����� ������� �����ؾ� �Ѵ�.
	�׷��� �ڹٴ¿��� ������ ������ �߻������ִ�
	���� Ŭ������ Random Ŭ������ ������ �����ϰ� �ִ�.


// �ζ� ��ȣ ������ (���� �߻� ���α׷�)

// ���α׷��� ����Ǹ� �⺻������ �ζǸ�
// 5���� �����ϴ� ���α׷��� �����Ѵ�.

//���� ��)
// 3 5 12 24 31 41
// 4 5 6 7 8 9 45
//
//
//
*/

import java.util.Random;


public class Test142
{
	public static void main(String[] args)
	{
		//[���� �� Ǯ��]
		Random rd = new Random();
		int[] arr = new int[6];
		int random;
		
		for (int n=0;n<5 ;n++ )
		{
		
		//�迭�� �������� �Է�
		for (int i =0;i<6 ;i++ )
		{	
			random = rd.nextInt(45)+1;			//�ߺ����ֱ�.......
			
				arr[i] = random;
		} 
		
		//����
		for (int i =0;i<6 ;i++ )
		{
			for (int j=i+1;j <arr.length ;j++ )
			{
				if (arr[i] > arr[j])
				{
					arr[i] = arr[i]^arr[j];
					arr[j] = arr[j]^arr[i];
					arr[i] = arr[i]^arr[j];
				}
			} 	
			
		 }//end ����
		
		 //���
		 for ( int a : arr )
				System.out.printf("%3d",a);
			System.out.println();

		}//end 5��������
		
	}//end main()
}//end class