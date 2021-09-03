/*====================================================
   ��� �÷��� �����ӿ�ũ (Collection Framework) ���
======================================================*/

/*
	���� ��)

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 1

		1���� ��� �Է� : �չ���
		1��° ��� �Է� ����
		��� �Է� ���(Y/N)? : Y

		2��° ��� �Է� : ���±�
		2��° ��� �Է� ����
		��� �Է� ���(Y/N)? : n

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 2

		[���� ��ü ���]
			�չ���
			���±�
		���� ��ü ��� �Ϸ�

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 3

		�˻��� ��� �Է� : ����ȭ

		[�˻� ��� ���]
		�׸��� �������� �ʽ��ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 3

		�˻��� ��� �Է� : �չ���

		[�˻� ��� ���]
		�׸��� �����մϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 4

		������ ��� �Է� : ���ش�

		[���� ��� ���]
		�׸��� �������� �ʾƼ� ������ �� �����ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 4

		������ ��� �Է� : ���±�

		[���� ��� ���]
		���±� �׸��� �����Ǿ����ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 5

		������ ��� �Է� : ������

		[���� ��� ���]
		������ ����� ���������ʽ��ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 5

		������ ��� �Է� : �չ���
		������ ���� �Է� : ������

		[���� ��� ���]
		������ �Ϸ�Ǿ����ϴ�.

		[�޴� ����]
		1. ��� �߰�
		2. ��� ���
		3. ��� �˻�
		4. ��� ����
		5. ��� ����
		6. ����
		>> �޴� ����(1~6) : 6

		���α׷� ����
����Ϸ��� �ƹ� Ű�� ��������...

*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class menus //�ϼ�
{
	public static final int E_ADD = 1;
	public static final int E_DISP = 2;
	public static final int E_FIND = 3;
	public static final int E_DEL = 4;
	public static final int E_CHA = 5;
	public static final int E_END = 6;

}


public class Test159
{

	//�ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;		// ���ð�
	private static String con;		//��� ����

	static
	{
		vt = new Vector<Object>();

		br = new BufferedReader(new InputStreamReader(System.in));

		sel =1;
		con ="Y";
		
	}

	//�޴� ���
	public static void menuDisp()
	{
		System.out.print("  [�޴� ����]\n 1. ��� �߰�\n 2. ��� ���\n 3. ��� �˻�\n");
		System.out.print(" 4. ��� ����\n 5. ��� ����\n 6. ����\n >> �޴� ����(1~6) :  ");
	}

	//�޴� ����
	public static void 	menuSelect() throws IOException
	{
		sel = Integer.parseInt(br.readLine());
	}

	// ���õ� �޴� ���࿡ ���� ��� ȣ��
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case menus.E_ADD: addElement(); break;
		case menus.E_DISP : disElement(); break;
		case menus.E_FIND : findElement(); break;
		case menus.E_DEL : delElement(); break;
		case menus.E_CHA : chaElement(); break;
		case menus.E_END : exit(); break;
		}
		
	}

	
	//��� �߰�
	public static void addElement() throws IOException
	{
		do
		{
			System.out.printf("%d��° ��� �Է� : ",vt.size()+1);
			String a = br.readLine();
			vt.add(a);
			System.out.printf("%d��° ��� �Է� ����\n",vt.size());
			System.out.print("��� �Է� ���(Y/N)? :");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y"));	
		

	}

	public static void disElement()
	{
		System.out.println("[���� ��ü ���]");
		for(int a=0; a<vt.size(); a++)
			System.out.printf("%s\n", vt.get(a));
		System.out.println("���� ��ü ��� �Ϸ�");
		System.out.println();
			
	}

	public static void findElement() throws IOException
	{

		System.out.println("�˻��� ��� �Է� : "); 
		boolean b = vt.contains(br.readLine());

		System.out.println("[�˻� ��� ���]");
		if (b)
		{
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		}else 
			System.out.println("�׸��� �����մϴ�.");
		
	}

	public static void delElement() throws IOException  
	{
		System.out.print("������ ��� �Է� :");
		String del = br.readLine();
		System.out.println("[���� ��� ���]");
		if (vt.contains(del))
		{
			int i = vt.indexOf(del);
			vt.remove(i);
			System.out.printf("%s �׸��� �����Ǿ����ϴ�.\n",del);
		}else
			System.out.println("�׸��� �������� �ʾƼ� ������ �� �����ϴ�.\n");
		
	}

	public static void chaElement() throws IOException  
	{
		System.out.print("������ ��� �Է� : ");
		String change1 = br.readLine();
		

		if (vt.contains(change1))
		{
			int chidx = vt.indexOf(change1);
			System.out.print("������ ��� �Է� : ");
			String change2 = br.readLine();

			vt.set(chidx, change2);
			System.out.println("[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		} else
		{	
			System.out.println("[���� ��� ���]");
			System.out.println("������ ����� ���������ʽ��ϴ�.");
		}		

	}

	public static void exit()	//�ϼ�
	{
		System.out.println("\t���α׷�����");
		System.exit(-1);
	}

	//main() --�ϼ�
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}