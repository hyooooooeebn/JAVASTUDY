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

//[���� �� Ǯ��]
import java.util.Random;
import java.util.Arrays;

class Lotto
{
	private int[] num = new int[6];

	//getter
	public int[] getNum()
	{
		return num;
	}

	//6���� ���� �߻���Ű�� �޼ҵ� ����
	public void start()
	{
		Random rd = new Random();

		int n;
		int cnt=0;
		
		jump:			//��CHECK��
		while (cnt<6)	//��~~ 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;

			for (int i=0;i<cnt; i++)	//��!
			{
				if (num[i]==n)
				{
					//���� �ٽ� �߻���ų �� �ֵ��� ó��
					continue jump;
				}
			}

			num[cnt++] = n; 
		}
		// ���� �޼ҵ� ȣ��
		sorting();
		
	}//end start()

	private void sorting()
	{
		Arrays.sort(num);
	}
}

public class Test142_1
{
	public static void main(String[] args)
	{
		Lotto lotto = new Lotto();

		for (int i=1;i<=5 ;i++ )
		{
			lotto.start();

			for (int n : lotto.getNum() )
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}
//�������
/*
   7  11  15  17  22  36
  10  15  28  31  42  43
   6   7  29  36  41  44
   4   6   8  14  23  42
   3  13  21  24  38  40
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/