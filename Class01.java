abstract class CShape               // 定義抽象類別CShape
{
   protected String color;       // 資料成員
   public void setColor(String str)    // 一般的函數
   {
      color=str;
   }
   public CShape(String str) { //1 create constructor and set the vaule of color
	   color=str;
   }
   public CShape() { //1 create empty constructor
   }
   public abstract void show(); // 抽象函數，只有定義名稱，沒有定義處理方式
}
class CRectangle extends CShape    // 定義子類別CRectangle
{
   protected int width,height;
   public CRectangle(int w,int h)
   {
      width=w;
      height=h;
   }
   public void show()      // 明確定義繼承自抽象類別的show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+width*height);
   }
}
class CCircle extends CShape     // 定義子類別CCircle
{
   protected double radius;
   public CCircle(double r)
   {
      radius=r;
   }
   public void show()     // 明確定義繼承自抽象類別的show() method
   {
      System.out.print("color="+color+",  ");
      System.out.println("area="+3.14*radius*radius);
   }
}
public class Class01 {
   public static void main(String args[])
   {
      CRectangle rect=new CRectangle(5,10);
      rect.setColor("Yellow");   // 呼叫父類別裡的setColor() method
      rect.show();         // 呼叫CRectangle類別裡的show() method

      CCircle cir=new CCircle(2.0);
      cir.setColor("Green");     // 呼叫父類別裡的setColor() method
      cir.show();             // 呼叫CCircl類別裡的show() method
   }
}