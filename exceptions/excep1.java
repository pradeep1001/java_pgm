// we are using finally block 
import java.util.* ;
 
class excep1
 { 
    public static void  main(String[] args)
     {
       Scanner scan = new Scanner(System.in);
           int a;
          try
        {
           System.out.println(" enter the value");
           a= scan.nextInt();
         }
          catch(InputMismatchException ae)
       {
         ae.printStackTrace();              
       } 
          catch(NumberFormatException ie)
        {
          ie.printStackTrace();
        }  
      finally 
     { 
           System.out.println("this code will run irrespective of whether the exception is handled or not   " );
     }
  }
}