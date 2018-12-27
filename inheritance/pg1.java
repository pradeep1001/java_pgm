public class pg1 extends telusko
{
    public static void main(String[] args)
    {
            pg1 r1 = new pg1();
            r1.num1 = 8;
            r1.num2=5;
            r1.add();
            System.out.println(" "+r1.result);
    }
    
}
class telusko
{
     int num1, num2,result;
     public  void add()
     {
         result = num1 + num2;
     }
}