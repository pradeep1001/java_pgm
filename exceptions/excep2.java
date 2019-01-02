// we are using nested try
// at a time only one exception is handled .
import java.util.* ;
    class excep2
 { 
     public static void  main(String[] args)
    {
        try
       {
          int i=10 , j=0,result ;
          result = i/j;
          System.out.println(result);
          try
        {
          int a[] = {2,3,4};
          a[12] = 14;
             System.out.println(a[12]);        

 
        }
      catch(Exception t)
      {
       System.out.println(" the exception is :  "+t);
      }
    }
     catch(Exception e)
     {
           System.out.println(" the exception is :  "+e);
     }

    }
}