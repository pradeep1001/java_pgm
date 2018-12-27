class student  
{
     public void  add()
     {
         System.out.println(" pradeep");
     }
}
class teacher extends student
{
     public  void sub()
     {
         System.out.println(" david");
     }
}
public class Tnagar
{
    public static void main(String[] args)
    {
            teacher t1 =  new teacher();
            t1.add();
                   t1.sub();
    }
    
}