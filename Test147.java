/*   ===========================
      ��Ό��ó�����
   =========================== */

//Test146 �� ��
class Demo2{   

   private int value;

   public void setValue(int value) throws Exception
	{
      //�׳� Exception�� lang ��Ű���� �־ import �ʿ� X

      if (value<=0)
         //throw : ���� ����(���߹� ����) 
         throw new Exception("value�� 0���� �۰ų� ���� �� ����");

      this.value = value;
   }

   public int getValue(){
      return value;
   }

}
public class Test147{   
   public static void main(String[] args){

      Demo2 ob = new Demo2();

      try{
         ob.setValue(-3);
         int result = ob.getValue();
         System.out.println(result);

      }catch(Exception e){
         System.out.println(e.toString());
      }
   }
}