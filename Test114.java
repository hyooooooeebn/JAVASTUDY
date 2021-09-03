/*================================ 
	���� Ŭ���� ��� ����
	 - �������̽�(Interface)
================================== */

// �������̽�
interface ADemo
{
	public void write();	//interface�ȿ��� �߻� �޼ҵ常 �����ϱ� ������
							//abstract ��������
}

// �������̽�
interface BDemo
{
	public void print();
}


//�� �������̽��� 2�� �̻��� ������ �� �ִ�.
// -> ���� ����� ���� �ʴ� �κ��� �����ϴ� ����

// Ŭ����
//class DemoImpl
//class DemoImpl extends ADemo (x)
//implements�ϴ� ���� �߻�Ŭ����
//abstract class DemoImpl implements ADemo, BDemo
//��� �޼ҵ� ������ �Ǹ� �߻� �����...
class DemoImpl implements ADemo, BDemo
{
	/*
	public abstract void write();
	public abstract void print();
	*/

	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}

	// �� JDK 1.5(5.0) ������ ���������̽� �޼ҵ�ڸ�
	//	  �������̵� �� �� ��@Override�� ������̼��� ����� �� ����
	//	  JDK 1.6(6.0)���� ������ ����
	//	  ��, ��ӹ��� Ŭ������ �޼ҵ带
	//	  �������̵��� ���� JDK 1.5(5.0)���� �����ϴ�...
}


// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ�Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		//ADemo ob =new ADemo();		//�������̽��� �ν��Ͻ����� �Ұ�


		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//--==>> ADemo �������̽� �޼ҵ� write()...
		//		 BDemo �������̽� �޼ҵ� print()...

		ADemo ob2 = new DemoImpl();			//��ĳ����
		BDemo ob3 = new DemoImpl();	

		//ob2.print();		//�����߻�...
		//ob3.write();		//�����߻�...		//�� �������̽��� ���� �޼ҵ� ȣ�� �Ұ�

		ob2.write();
		ob3.print();

		((BDemo)ob2).print();
		((ADemo)ob3).write();		
		//DemoImpl Ŭ������ ��� �������߱⶧���� ����....					��CHECK��
		//���� DemoImpŬ������ �̵� �� �� �������̽��� ������ ��Ȳ�̶��
		//�� ������ ��Ÿ�� ���� �߻��ϴ� ������ �ȴ�...
		//��ĳ����,,, �ٿ�ĳ������ �ƴϰ� �׳� ���� �� ��ȯ�̶�� �� �� �ִ�,,,


		

	}
}