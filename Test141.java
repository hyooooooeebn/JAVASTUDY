/*==============================
   ��� �ڹ��� �ֿ� Ŭ�������
		- Math Ŭ����
================================*/

/*
�� java.lang.Math Ŭ������

	���а� ���õ� ������ �Ӽ��� �Լ����� �����ϴ� Ŭ������
	�����ڰ� �ֱ�������,,, ��private������ ����Ǿ� �ֱ� ������
	�ܺο��� ��ü�� ������ ������.
	��, ���޼ҵ尡 static���� ���ǵǾ������Ƿ�
	��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

�� java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�
	
	- public static final double E = 2.71...
	  :�ڿ��α�

	- public static final double PI = 3.141592...
	  : ������(��)

	- public static double sin(double a)
	- public static double cos(double a)
	- public static double tan(double a)
	: sin(a) cos(a) tan(a) ���� ��ȯ�Ѵ�.

	- public static double asin(double a)
	- public static double acos(double a)
	- public static double atan(double a)
	: asin(a) acos(a) atan(a) ���� ��ȯ�Ѵ�.

	- public static double toRadians(double angdeg)
    : ������ �������� �ٲپ� ��ȯ�Ѵ�.
	- public static double toDegrees(double angrad)
	: ������ ������ �ٲپ� ��ȯ�Ѵ�.

	- public static double exp(double a)
	:e�� a�� ��ȯ

	- public static double log(double a)
	: �αװ� ��ȯ

	- public static double sqrt(double a)
	: a�� ������ ��ȯ

	- public static double ceil(double a)
	: a���� ũ�ų� ���� ���� ��ȯ(�ø�)

	- public static double floor(double a)
	: a���� �۰ų� ���� ���� ��ȯ(����)

	- public static double pow(double a, double b)
	: a�� b�� ��ȯ

	- public static int round(float a)
	- public static long round(double a)
	: a�� �ݿø��Ͽ� ����� ��ȯ

	- public static doublerandom()
	: 0.0~1.0 ������ ���� ��ȯ

*/

public class Test141
{
	public static void main(String[] args)
	{
		System.out.println("������ : "+ Math.PI);

		System.out.println("2�� ������ : " + Math.sqrt(2));
		//--==>> 2�� ������ : 1.4142135623730951

		System.out.println("���̿� ���� Degree : " + Math.toDegrees(Math.PI));
		//--==>> ���̿� ���� Degree : 180.0

		System.out.println("2���̷� ���� Degree : " + Math.toDegrees(2.0*Math.PI));
		//--==>> 2���̷� ���� Degree : 360.0

		double radian45 = Math.toRadians(45);

		System.out.println("���� 45   : " + Math.sin(radian45));
		System.out.println("�ڽ��� 45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ 45 : " + Math.tan(radian45));
		//--==>> ���� 45   : 0.7071067811865475
		//		 �ڽ��� 45 : 0.7071067811865476
		//		 ź��Ʈ 45 : 0.9999999999999999

		System.out.println("�α�25 : " + Math.log(25));
		//--==>> �α�25 : 3.2188758248682006
		System.out.println("2�� 4�� : " + Math.pow(2,4));
		//--==>> 2�� 4�� : 16.0

		for (int i = 1;i<10 ;i++ )
		{
			System.out.println("0.0 ~ 1.0������ ���� : "+ Math.random());
		}

		//--==>> 0.0 ~ 1.0������ ���� : 0.5957917690637358
		//		 0.0 ~ 1.0������ ���� : 0.9285857095111426
		//		 0.0 ~ 1.0������ ���� : 0.8775555556924443
		//		 0.0 ~ 1.0������ ���� : 0.4850339088078991
		//		 0.0 ~ 1.0������ ���� : 0.48036337347101665
		//		 0.0 ~ 1.0������ ���� : 0.32312063693533055
		//		 0.0 ~ 1.0������ ���� : 0.2140089088671845
		//		 0.0 ~ 1.0������ ���� : 0.18991637411833084
		//		 0.0 ~ 1.0������ ���� : 0.26442595348529996
		
	}
}