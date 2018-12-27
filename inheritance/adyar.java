interface student 
{
   void add(); 
  
}
interface teacher
{
     void sub();
}
public class adyar implements student,teacher
{
    public  void add()
    {
        System.out.println(" muruga");
    }
     public void sub()
    {
        System.out.println(" sivan  ");
    }
    public static void main(String[] args)
    {
      adyar a1 = new adyar();
      a1.add();
      a1.sub();
    }
}