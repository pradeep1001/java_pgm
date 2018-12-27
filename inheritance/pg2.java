public class pg2 extends subtraction
{
    public static void main(String[] args)
    {
            pg2 r1 = new pg2();
            r1.num1 = 8;
            r1.num2=5;
            r1.add();
            System.out.println("  addition of the numbers is : "+r1.result);
            r1.sub();
        System.out.println(" subtraction of the numbers is "+r1.result);
    }
    
}
class addition
{
     int num1, num2,result;
     public  void add()
     {
         result = num1 + num2;
     }
}
class subtraction extends addition
{
    public void sub()
    {
        result = num1 - num2 ;
    }
}