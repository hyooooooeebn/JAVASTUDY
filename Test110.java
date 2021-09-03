/*=============================
	���� Ŭ���� ��� ����
	  - ��� (Inheritance)
==============================*/

/*
�� �޼ҵ�������̵��� Ư¡
	
	- �޼ҵ� �̸�,����Ÿ��,�Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�

	- �ݵ�� ��� ���谡 �־�� �Ѵ�

	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų����ƾ� �Ѵ�,
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵��ϴ� ���
	  �������������ڴ� ��protected�� �Ǵ� ��public���̾�� �Ѵ�.

	- ��static���� final���� private�� �޼ҵ�� �������̵� �� �� ����.

	- Exception�� �߰��� �Ұ����ϴ�.
	  ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� �������ܻ��׿�
	  ���ο� Exception�� �߰��ϴ°��� �Ұ����ϴٴ°��̴�.
*/

//�θ� Ŭ����
class SuperTest110
{
	private int a =5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
}

//�ڽ� Ŭ����
class SubTest110 extends SuperTest110
{
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.print("Sub... print() : " + a + " : " + b + " : " + c);
		//--==>>����
		//-- ���� Ŭ�������� ����� ���� a���� ������ �� ����.
		//   �� private�����̱⶧����,,,

		System.out.println("Sub... print() : " + b + " : " + c);

		//System.out.println("Sub... print() : " + b);
		//System.out.println("Sub... print() : " + this.b);
		//System.out.println("Sub... print() : " + super.b);
		//--���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		//	���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b

		//System.out.println("Sub... print() : " + c);
		//System.out.println("Sub... print() : " + this.c);
		//System.out.println("Sub... print() : " + super.c);
		//--���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		//	���� Ŭ�������� ����� c


	}

	@Override
	public void write()
	{
		//System.out.print("Sub... write() : " + a + " : " + b + " : " + c);
		//--==>>����
		//-- ���� Ŭ�������� ����� ���� a���� ������ �� ����.
		//   �� private�����̱⶧����,,,
		System.out.println("Sub... write() : " + b + " : " + c);

	}
}


// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test110
{
	public static void main(String[] args)
	{
		//���� Ŭ���� �ν��Ͻ� ����
		SubTest110 ob = new SubTest110();
		
		ob.print();
		//--==>> Sub... print() : 100 : 20

		ob.write();
		//--==>> Super... write() : 5 : 10 : 20

		System.out.println("---------------------------------���м�");

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest110)ob).b);					//��CHECK��
		//--==>> 10
		// �� ���� �θ� 
		//	  super�� ����ϸ� Test110�� �θ� ã�´�,,,, 
		//	  ������ �츮�� �ʿ��� ���� ob�� �θ�,,,, 
		//	  ���� ���� ���� ���·� �θ�Ŭ������ ������ �θ���...

	
		((SuperTest110)ob).write();									//��CHECK��
		//--==>> Sub... write() : 100 : 20
		// �� �޼ҵ�� ���� �� �����ؼ� ����~~~~~!!!!!1
		// �޼ҵ�� �θ𰡰��� write()ȣ���ϴ� ���̾ƴϴ�!!
		// �ֳĸ� �������̵��ϸ鼭 ������ؼ� �ڽ��� write()�� ���´�...




	}
}