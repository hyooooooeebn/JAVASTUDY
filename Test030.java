/*=============================================================
	���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
	- if ~ else�� �ǽ�
===============================================================*/

/*����ڷκ��� ������ ������ �Է¹޾�
  �Է¹��� ������ ¦������, Ȧ������, 0����
  ����� �Ǻ�

  //���� ��)
  ������ ���� �Է� : 14
  14 -> ¦��
												 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a;
		String strResult;


		System.out.print("������ ���� �Է� : ");
		a =Integer.parseInt(br.readLine());


		if(a==0){
		strResult = "��";}				// ��CHECK��  ¦������ 0�� �տ��� Ȯ��
		else if(a%2!=0){
		strResult = "Ȧ��";}
		else {
		strResult = "¦��";
		}

		System.out.printf("%d -> %s\n",a,strResult);

	}
}
//���� ���
/*
������ ���� �Է� : 0
0 -> ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 14
14 -> ¦��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 7
7 -> Ȧ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/