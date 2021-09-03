/*=============================
	���� Ŭ���� ��� ����
	  - �߻� Ŭ����(Abstract)
==============================*/


/*
�� �߻� Ŭ������
   ���� �L�� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ�������� �������̵��� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ���� ���� �̸� ȣ�� ��ȹ�� ����� ���� �����.


�� ���� �� ����

	[��������������] abstract class Ŭ������
	{
		[��������������] abtract �ڷ��� �޼ҵ��([�Ű�����], ...);
	}


�� Ư¡
   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �տ� ��abstract��Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ� �߻� Ŭ������ ����� ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.

   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   �ڻ���� ���ؼ����� ������ �߻� Ŭ�������� ��ӹ޴� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵��ؾ��Ѵ�

�� abstract Ű�����
   Ŭ������ �޼ҵ忡���� ����� �� ������
   ��� ������ ���� ���������� ��� �Ұ����ϴ�.
*/



// �߻� Ŭ����
abstract class SortInt111
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();				//���� ȣ���� �߻�ƴ�,,, ����...
	}
	
	//�߻� �޼ҵ�
	protected abstract void sorting();	//���� �κи� �ְ� ������� = �߻� �޼ҵ�

	protected int dataLength()
	{
		return value.length;
	}

	//��final��Ű����� ����...					//��CHECK��
	//�� Ŭ����(SortInt111)�� ��ӹ޴� Ŭ��������
	//�� �޼ҵ带 �������� �� ����.
	protected final int compare(int i, int j)	
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else 
			return -1;
	
	}

	//��final��Ű����� ����...
	//�� Ŭ������ ��ӹ޴� Ŭ��������
	//�� �޼ҵ带 �������� �� ����.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;

	}

}

// �߻� Ŭ������ ��ӹ��� Ŭ���� -> �ϴ� �߻�Ŭ����
public class Test111 extends SortInt111
{

	/* <��ӹ��� �κ�>
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();		
	}
	
	//�߻� �޼ҵ�
	protected abstract void sorting();		

	protected int dataLength()
	{
		return value.length;
	}

	protected final int compare(int i, int j)	
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else 
			return -1;
	
	}
.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;

	}

	*/

	static int[] data = {7, 10, 3, 8, 7};


	@Override
	//protected void sorting();
	protected void sorting()
	{
		for (int i =0;i<dataLength()-1 ;i++)
		{
			for (int j =i+1; j<dataLength() ;j++ )
			{
				if (compare(i,j) == 1)
				
					swap(i,j);
				
			}
		}

	}//end sorting()



	

	public static void main(String[] args)
	{
		//Test111 ob = new Test111();			=> �Ұ���
		//SortInt111 ob = new SortInt111();		=> �Ұ���

		
		System.out.print("Source Data : ");
		for (int n :data)
			System.out.print(n + " ");

		System.out.println();


		Test111 ob = new Test111();
		ob.sort(data);


		System.out.print("Sort Data : ");
		for (int n :data)
				System.out.print(n + " ");
		System.out.println();
		


	}
}