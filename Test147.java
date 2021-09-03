/*   ===========================
      ■■예외처리■■
   =========================== */

//Test146 과 비교
class Demo2{   

   private int value;

   public void setValue(int value) throws Exception
	{
      //그냥 Exception은 lang 패키지에 있어서 import 필요 X

      if (value<=0)
         //throw : 예외 생성(폭발물 생성) 
         throw new Exception("value는 0보다 작거나 같을 수 없다");

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