/*===========================================================
	    ���� �޼ҵ� �ߺ�����(Method Overloading) ����
		- �޼ҵ� �����ε��� ������ ���¿� �Ұ����� ����
==============================================================*/

public class Test100
{
	public static void main(String[] args)
	{
		print('A');		//�ڵ� �� ��ȯ ���ɼ��� �ִ� Ȯ��~~
		
	}
	public static void print(){}
	public static void print(int i){}
	//public static void print(int j){}		//�Ұ���
	//public static void print(char c){}		//�ڵ� �� ��ȯ ��Ģ ��CHECK��
	public static void print(int i, int j){}
	public static void print(double d){}
	//public static double print(double){return 10.0;}	//�Ұ���

}